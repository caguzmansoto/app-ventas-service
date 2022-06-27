package com.guzmans.appventas.controller;

import com.guzmans.appventas.dto.PresentacionDTO;
import com.guzmans.appventas.repository.model.Categoria;
import com.guzmans.appventas.repository.model.Presentacion;
import com.guzmans.appventas.service.PresentacionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "Controlador de Presentación")
@RequestMapping("/presentaciones")
@Validated
public class PresentacionController {

  @Autowired
  private PresentacionService presentacionService;

  @ApiOperation(value = "Obtener todos las presentaciones",
      notes = "No necesita parámetros de entrada",
      responseContainer = "Presentacion")
  @ApiResponse(code = 200, message = "ApiResponseMessages.ITEM_FETCHED",
      response = Categoria.class, responseContainer = "List"
  )
  @ApiResponses(value = {
      @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
      @ApiResponse(code = 404, message = "Not found, no encontrado"),
      @ApiResponse(code = 405, message = "No se encontraron Presentación en la BD"),
      @ApiResponse(code = 200, message = "Petición OK")})
  @GetMapping
  public List<Presentacion> listarTodo(){
    return presentacionService.listarTodo();
  }

  @ApiOperation(value = "Obtener Presentación por identificador",
      notes = "Datos de entrada id",
      response = Categoria.class,
      responseContainer = "Presentacion")
  @ApiResponses(value = {
      @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
      @ApiResponse(code = 404, message = "Not found, no encontrado"),
      @ApiResponse(code = 405, message = "No se encontraron Presentación en la BD"),
      @ApiResponse(code = 200, message = "Petición OK")})
  @GetMapping("/{id}")
  public Presentacion buscarPorId(
      @Min(value = 1, message = "Id: El valor mínimo es 1.") @NotNull(message = "Id: El valor es requerido.")
      @PathVariable("id") Long id){
    return presentacionService.buscarPorId(id);
  }

  @ApiOperation(value = "Obtener Presentaciones por objeto filtro",
      notes = "Datos de entrada: id, nombre, descripcion",
      response = Categoria.class,
      responseContainer = "Presentacion")
  @ApiResponses(value = {
      @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
      @ApiResponse(code = 404, message = "Not found, no encontrado"),
      @ApiResponse(code = 405, message = "No se encontraron Presentación en la BD"),
      @ApiResponse(code = 200, message = "Petición OK")})
  @PostMapping("/buscar-por-filtro")
  public ResponseEntity<List<Presentacion>> buscarPorFiltro(@Valid @RequestBody PresentacionDTO presentacionDTO) {
    List<Presentacion> presentacion = presentacionService.buscarPorFiltro(presentacionDTO);
    return new ResponseEntity<>(presentacion, HttpStatus.OK);
  }

  @ApiOperation(value = "Guardar Presentaciones",
      notes = "Datos a guardar en Presentaciones",
      response = Categoria.class,
      responseContainer = "Presentacion")
  @ApiResponses(value = {
      @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
      @ApiResponse(code = 404, message = "Not found, no encontrado"),
      @ApiResponse(code = 405, message = "No se encontraron Presentación en la BD"),
      @ApiResponse(code = 200, message = "Petición OK")})
  @PostMapping
  public Presentacion guardar(@RequestBody Presentacion presentacion){
    return presentacionService.guardar(presentacion);
  }

  @ApiOperation(value = "Actualizar Presentaciones",
      notes = "Datos a actualizar en Presentaciones",
      response = Categoria.class,
      responseContainer = "Presentacion")
  @ApiResponses(value = {
      @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
      @ApiResponse(code = 404, message = "Not found, no encontrado"),
      @ApiResponse(code = 405, message = "No se encontraron Presentaciones en la BD"),
      @ApiResponse(code = 200, message = "Petición OK")})
  @PutMapping
  public Presentacion actualizar(@RequestBody Presentacion presentacion){
    return presentacionService.actualizar(presentacion);
  }

  @ApiOperation(value = "Eliminar registro Presentación",
      notes = "Datos a eliminar en Presentación",
      response = Categoria.class,
      responseContainer = "Presentacion")
  @ApiResponses(value = {
      @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
      @ApiResponse(code = 404, message = "Not found, no encontrado"),
      @ApiResponse(code = 405, message = "No se encontraron Presentación en la BD"),
      @ApiResponse(code = 200, message = "Petición OK")})
  @DeleteMapping("/{id}")
  public ResponseEntity<Object> eliminar(@PathVariable("id") Long id) {
    Presentacion presentacion = presentacionService.buscarPorId(id);
    presentacionService.eliminar(presentacion.getIdPresentacion());
    return new ResponseEntity<>(HttpStatus.OK);
  }

}
