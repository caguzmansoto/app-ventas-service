package com.guzmans.appventas.service;

import com.guzmans.appventas.dto.CategoriaDTO;
import com.guzmans.appventas.repository.model.Categoria;
import java.util.List;

public interface CategoriaService extends CRUD<Categoria> {

  List<Categoria> buscarPorFiltro(CategoriaDTO categoriaDTO);
}
