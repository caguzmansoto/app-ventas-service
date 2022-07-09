package com.guzmans.appventas.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import com.guzmans.appventas.repository.PresentacionDAO;
import com.guzmans.appventas.repository.model.Presentacion;
import com.guzmans.appventas.service.PresentacionService;
import com.guzmans.appventas.service.impl.PresentacionServiceImpl;
import java.util.Optional;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
class PresentacionControllerTest {

  @Mock
  PresentacionDAO presentacionDAO;

  @InjectMocks
  PresentacionService presentacionService = new PresentacionServiceImpl();

  @Before
  public void init() {
    MockitoAnnotations.initMocks(this);
  }

  @Ignore
  @Test
  public void getPresentacionOK(){
    Long idPresentacion = 1L;
    Presentacion presentacionNuevo = new Presentacion();
    presentacionNuevo.setIdPresentacion(1L);
    presentacionNuevo.setNombre("Nombre presentacion");
    presentacionNuevo.setDescripcion("Descripcion presentacion");

    when(presentacionDAO.findById(idPresentacion)).thenReturn(Optional.of(presentacionNuevo));
    Presentacion presentacion = presentacionService.buscarPorId(idPresentacion);
    assertEquals(presentacion.getIdPresentacion(), idPresentacion);
  }

  @Ignore
  @Test
  public void getPresentacionNOK(){
    Long idPresentacion = null;
    Presentacion presentacionNuevo = new Presentacion();
    presentacionNuevo.setIdPresentacion(1L);
    presentacionNuevo.setNombre("Nombre presentacion");
    presentacionNuevo.setDescripcion("Descripcion presentacion");

    when(presentacionDAO.findById(idPresentacion)).thenReturn(Optional.of(presentacionNuevo));
    Presentacion presentacion = presentacionService.buscarPorId(idPresentacion);
    assertEquals(presentacion.getIdPresentacion(), idPresentacion);
  }

  @Ignore
  @Test
  public void guardar(){
    Presentacion presentacionNuevo = new Presentacion();
    presentacionNuevo.setIdPresentacion(1L);
    presentacionNuevo.setNombre("Nombre presentacion");
    presentacionNuevo.setDescripcion("Descripcion presentacion");

    when(presentacionDAO.save(presentacionNuevo)).thenReturn(presentacionNuevo);
    Presentacion presentacion = presentacionService.guardar(presentacionNuevo);
    assertEquals(presentacion.getIdPresentacion(), presentacionNuevo.getIdPresentacion());
  }

}
