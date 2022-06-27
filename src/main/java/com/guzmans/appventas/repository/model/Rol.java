package com.guzmans.appventas.repository.model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROL")
public class Rol {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_ROL", nullable = false, precision = 0)
  private Long idRol;

  @Column(name = "NOMBRE", nullable = false, length = 50)
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
    if (!(o instanceof Rol)) {
      return false;
    }
    Rol rol = (Rol) o;
    return Objects.equals(getIdRol(), rol.getIdRol()) && Objects.equals(
        getNombre(), rol.getNombre());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getIdRol(), getNombre());
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Rol{");
    sb.append("idRol=").append(idRol);
    sb.append(", nombre='").append(nombre).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
