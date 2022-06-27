package com.guzmans.appventas.controller;

import com.guzmans.appventas.dto.CategoriaDTO;
import com.guzmans.appventas.repository.model.Categoria;
import com.guzmans.appventas.service.CategoriaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "Controlador de Categorías")
@RequestMapping("/categorias")
public class CategoriaController {

  @Autowired
  private CategoriaService categoriaService;

  @ApiOperation(value = "Obtener todos las categorías",
      notes = "No necesita parámetros de entrada",
      responseContainer = "Categoria")
  @ApiResponse(code = 200, message = "ApiResponseMessages.ITEM_FETCHED",
      response = Categoria.class, responseContainer = "List"
  )
  @ApiResponses(value = {
      @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
      @ApiResponse(code = 404, message = "Not found, no encontrado"),
      @ApiResponse(code = 405, message = "No se encontraron Categorías en la BD"),
      @ApiResponse(code = 200, message = "Petición OK")})
  @GetMapping
  public List<Categoria> listarTodo(){
    return categoriaService.listarTodo();
  }

  @ApiOperation(value = "Obtener categorías por identificador",
      notes = "Datos de entrada id",
      response = Categoria.class,
      responseContainer = "Categoria")
  @ApiResponses(value = {
      @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
      @ApiResponse(code = 404, message = "Not found, no encontrado"),
      @ApiResponse(code = 405, message = "No se encontraron Categoría en la BD"),
      @ApiResponse(code = 200, message = "Petición OK")})
  @GetMapping("/{id}")
  public Categoria buscarPorId(@PathVariable("id") Long id){
    return categoriaService.buscarPorId(id);
  }

  @ApiOperation(value = "Obtener categorías por objeto filtro",
      notes = "Datos de entrada: id, nombre, descripcion",
      response = Categoria.class,
      responseContainer = "Categoria")
  @ApiResponses(value = {
      @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
      @ApiResponse(code = 404, message = "Not found, no encontrado"),
      @ApiResponse(code = 405, message = "No se encontraron Categoría en la BD"),
      @ApiResponse(code = 200, message = "Petición OK")})
  @PostMapping("/buscar-por-filtro")
  public ResponseEntity<List<Categoria>> buscarPorFiltro(@RequestBody CategoriaDTO categoriaDTO) {
    List<Categoria> categorias = categoriaService.buscarPorFiltro(categoriaDTO);
    return new ResponseEntity<>(categorias, HttpStatus.OK);
  }

  @ApiOperation(value = "Guardar categorías",
      notes = "Datos a guardar en categorías",
      response = Categoria.class,
      responseContainer = "Categoria")
  @ApiResponses(value = {
      @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
      @ApiResponse(code = 404, message = "Not found, no encontrado"),
      @ApiResponse(code = 405, message = "No se encontraron Categoría en la BD"),
      @ApiResponse(code = 200, message = "Petición OK")})
  @PostMapping
  public Categoria guardar(@RequestBody Categoria categoria){
    return categoriaService.guardar(categoria);
  }

  @ApiOperation(value = "Actualizar categorías",
      notes = "Datos a actualizar en categorías",
      response = Categoria.class,
      responseContainer = "Categoria")
  @ApiResponses(value = {
      @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
      @ApiResponse(code = 404, message = "Not found, no encontrado"),
      @ApiResponse(code = 405, message = "No se encontraron Categoría en la BD"),
      @ApiResponse(code = 200, message = "Petición OK")})
  @PutMapping
  public Categoria actualizar(@RequestBody Categoria categoria){
    return categoriaService.actualizar(categoria);
  }

  @ApiOperation(value = "Eliminar registro categoría",
      notes = "Datos a eliminar en categorías",
      response = Categoria.class,
      responseContainer = "Categoria")
  @ApiResponses(value = {
      @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
      @ApiResponse(code = 404, message = "Not found, no encontrado"),
      @ApiResponse(code = 405, message = "No se encontraron Categoría en la BD"),
      @ApiResponse(code = 200, message = "Petición OK")})
  @DeleteMapping("/{id}")
  public ResponseEntity<Object> eliminar(@PathVariable("id") Long id) {
    Categoria categoria = categoriaService.buscarPorId(id);
    categoriaService.eliminar(categoria.getIdCategoria());
    return new ResponseEntity<>(HttpStatus.OK);
  }

}
