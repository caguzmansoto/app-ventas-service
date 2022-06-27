package com.guzmans.appventas.dto;

import com.guzmans.appventas.repository.model.Categoria;
import com.guzmans.appventas.repository.model.Presentacion;

public class ProductoDTO {
  private Long idProducto;
  private String codigo;
  private String nombre;
  private String descripcion;
  private String rutaImagen;
  private Categoria categoria;
  private Presentacion presentacion;

  public Long getIdProducto() {
    return idProducto;
  }

  public void setIdProducto(Long idProducto) {
    this.idProducto = idProducto;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getRutaImagen() {
    return rutaImagen;
  }

  public void setRutaImagen(String rutaImagen) {
    this.rutaImagen = rutaImagen;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
  }

  public Presentacion getPresentacion() {
    return presentacion;
  }

  public void setPresentacion(Presentacion presentacion) {
    this.presentacion = presentacion;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("ProductoDTO{");
    sb.append("idProducto=").append(idProducto);
    sb.append(", codigo='").append(codigo).append('\'');
    sb.append(", nombre='").append(nombre).append('\'');
    sb.append(", descripcion='").append(descripcion).append('\'');
    sb.append(", rutaImagen='").append(rutaImagen).append('\'');
    sb.append(", categoria=").append(categoria);
    sb.append(", presentacion=").append(presentacion);
    sb.append('}');
    return sb.toString();
  }
}
