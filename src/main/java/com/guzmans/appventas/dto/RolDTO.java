package com.guzmans.appventas.dto;

import java.util.Objects;

public class RolDTO {
  private Long idRol;
  private String nombre;

  public Long getIdRol() {
    return idRol;
  }

  public void setIdRol(Long idRol) {
    this.idRol = idRol;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof RolDTO)) {
      return false;
    }
    RolDTO rolDTO = (RolDTO) o;
    return Objects.equals(getIdRol(), rolDTO.getIdRol()) && Objects.equals(
        getNombre(), rolDTO.getNombre());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getIdRol(), getNombre());
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("RolDTO{");
    sb.append("idRol=").append(idRol);
    sb.append(", nombre='").append(nombre).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
