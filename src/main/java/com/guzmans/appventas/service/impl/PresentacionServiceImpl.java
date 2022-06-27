package com.guzmans.appventas.service.impl;

import com.guzmans.appventas.configuration.exception.ExcepcionNegocio;
import com.guzmans.appventas.configuration.exception.ExcepcionNotFound;
import com.guzmans.appventas.dto.PresentacionDTO;
import com.guzmans.appventas.repository.PresentacionDAO;
import com.guzmans.appventas.repository.model.Presentacion;
import com.guzmans.appventas.service.PresentacionService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PresentacionServiceImpl implements PresentacionService {

  @Autowired
  private PresentacionDAO presentacionDAO;

  @Override
  public Presentacion guardar(Presentacion obj) {
    return this.presentacionDAO.save(obj);
  }

  @Override
  public Presentacion actualizar(Presentacion obj) {
    return this.guardar(obj);
  }

  @Override
  public List<Presentacion> listarTodo() {
    return this.presentacionDAO.findAll();
  }

  @Override
  public Presentacion buscarPorId(Long id) {
    Optional<Presentacion> presentacion = this.presentacionDAO.findById(id);
    if (presentacion.isPresent()){
      return presentacion.get();
    } else {
      throw new ExcepcionNotFound("No se encontro registro con id: "+id);
    }
  }

  @Override
  public boolean eliminar(Long id) {
    this.presentacionDAO.deleteById(id);
    return true;
  }

  @Override
  public List<Presentacion> buscarPorFiltro(PresentacionDTO presentacionDTO) {
    if (presentacionDTO.getIdPresentacion() != null || presentacionDTO.getNombre() != null || presentacionDTO.getDescripcion() != null) {
      if (presentacionDTO.getNombre() == null) presentacionDTO.setNombre("");
      if (presentacionDTO.getDescripcion() == null) presentacionDTO.setDescripcion("");
      return this.presentacionDAO.buscarPorFiltro(presentacionDTO.getIdPresentacion(), presentacionDTO.getNombre().toUpperCase(), presentacionDTO.getDescripcion().toUpperCase());
    } else {
      throw new ExcepcionNegocio("La búsqueda de la presentación no cumple con los parámetros minimos: idPresentacion, nombre y/o descripcion");
    }
  }
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


