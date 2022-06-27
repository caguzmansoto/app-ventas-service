package com.guzmans.appventas.repository.model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORIA")
public class Categoria {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_CATEGORIA", nullable = false, precision = 0)
  private Long idCategoria;

  @Column(name = "NOMBRE", nullable = false, length = 50)
  private String nombre;

  @Column(name = "DESCRIPCION", nullable = false, length = 50)
  private String descripcion;

  public Long getIdCategoria() {
    return idCategoria;
  }

  public void setIdCategoria(Long idCategoria) {
    this.idCategoria = idCategoria;
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
    if (!(o instanceof Categoria)) {
      return false;
    }
    Categoria categoria = (Categoria) o;
    return Objects.equals(getIdCategoria(), categoria.getIdCategoria())
        && Objects.equals(getNombre(), categoria.getNombre()) && Objects.equals(
        getDescripcion(), categoria.getDescripcion());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getIdCategoria(), getNombre(), getDescripcion());
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Categoria{");
    sb.append("idCategoria=").append(idCategoria);
    sb.append(", nombre='").append(nombre).append('\'');
    sb.append(", descripcion='").append(descripcion).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
