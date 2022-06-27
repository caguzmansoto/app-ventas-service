package com.guzmans.appventas.service.impl;

import com.guzmans.appventas.configuration.exception.ExcepcionNegocio;
import com.guzmans.appventas.configuration.exception.ExcepcionNotFound;
import com.guzmans.appventas.dto.CategoriaDTO;
import com.guzmans.appventas.repository.CategoriaDAO;
import com.guzmans.appventas.repository.model.Categoria;
import com.guzmans.appventas.service.CategoriaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoriaServiceImpl implements CategoriaService {

  @Autowired
  private CategoriaDAO categoriaDAO;

  @Override
  public Categoria guardar(Categoria obj) {
    return this.categoriaDAO.save(obj);
  }

  @Override
  public Categoria actualizar(Categoria obj) {
    return this.guardar(obj);
  }

  @Override
  public List<Categoria> listarTodo() {
    return this.categoriaDAO.findAll();
  }

  @Override
  public Categoria buscarPorId(Long id) {
    Optional<Categoria> categoria = this.categoriaDAO.findById(id);
    if (categoria.isPresent()){
      return categoria.get();
    } else {
      throw new ExcepcionNotFound("No se encontró registro con id: "+id);
    }
  }

  @Override
  public boolean eliminar(Long id) {
    this.categoriaDAO.deleteById(id);
    return true;
  }

  @Override
  public List<Categoria> buscarPorFiltro(CategoriaDTO categoriaDTO) {
    if (categoriaDTO.getIdCategoria() != null || categoriaDTO.getNombre() != null || categoriaDTO.getDescripcion() != null) {
      if (categoriaDTO.getNombre() == null) categoriaDTO.setNombre("");
      if (categoriaDTO.getDescripcion() == null) categoriaDTO.setDescripcion("");
      return this.categoriaDAO.buscarPorFiltro(categoriaDTO.getIdCategoria(), categoriaDTO.getNombre().toUpperCase(), categoriaDTO.getDescripcion().toUpperCase());
    } else {
      throw new ExcepcionNegocio("La búsqueda de la categoría no cumple con los parámetros minimos: idCategoria, nombre y/o descripcion");
    }
  }
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


