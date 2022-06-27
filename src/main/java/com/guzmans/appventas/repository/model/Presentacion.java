package com.guzmans.appventas.repository.model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRESENTACION")
public class Presentacion {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_PRESENTACION", nullable = false, precision = 0)
  private Long idPresentacion;

  @Column(name = "NOMBRE", nullable = false, length = 50)
  private String nombre;

  @Column(name = "DESCRIPCION", nullable = false, length = 256)
  private String descripcion;

  public Long getIdPresentacion() {
    return idPresentacion;
  }

  public void setIdPresentacion(Long idPresentacion) {
    this.idPresentacion = idPresentacion;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Presentacion)) {
      return false;
    }
    Presentacion that = (Presentacion) o;
    return Objects.equals(getIdPresentacion(), that.getIdPresentacion())
        && Objects.equals(getNombre(), that.getNombre()) && Objects.equals(
        getDescripcion(), that.getDescripcion());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getIdPresentacion(), getNombre(), getDescripcion());
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Presentacion{");
    sb.append("idPresentacion=").append(idPresentacion);
    sb.append(", nombre='").append(nombre).append('\'');
    sb.append(", descripcion='").append(descripcion).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
