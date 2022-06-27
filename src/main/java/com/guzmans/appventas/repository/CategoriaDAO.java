package com.guzmans.appventas.repository;

import com.guzmans.appventas.repository.model.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface CategoriaDAO extends JpaRepository<Categoria, Long>{

  @Query("from Categoria categoria where categoria.idCategoria = :id or UPPER(categoria.nombre) like %:nombre% or UPPER(categoria.descripcion) like %:descripcion%")
  List<Categoria> buscarPorFiltro(@Param("id")Long id, @Param("nombre")String nombre, @Param("descripcion")String descripcion);
}
