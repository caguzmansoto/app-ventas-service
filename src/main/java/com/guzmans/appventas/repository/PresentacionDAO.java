package com.guzmans.appventas.repository;

import com.guzmans.appventas.repository.model.Presentacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface PresentacionDAO extends JpaRepository<Presentacion, Long>{

  @Query("from Presentacion presentacion where presentacion.idPresentacion = :id or UPPER(presentacion.nombre) like %:nombre% or UPPER(presentacion.descripcion) like %:descripcion%")
  List<Presentacion> buscarPorFiltro(@Param("id")Long id, @Param("nombre")String nombre, @Param("descripcion")String descripcion);
}
