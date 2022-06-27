package com.guzmans.appventas.service;

import com.guzmans.appventas.dto.PresentacionDTO;
import com.guzmans.appventas.repository.model.Presentacion;
import java.util.List;

public interface PresentacionService extends CRUD<Presentacion> {

  List<Presentacion> buscarPorFiltro(PresentacionDTO presentacionDTO);
}
