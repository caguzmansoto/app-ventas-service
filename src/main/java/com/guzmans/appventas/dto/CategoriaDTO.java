package com.guzmans.appventas.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.validation.constraints.Min;

@ApiModel(description = "Estructura que contiene el modelo de Categoría.")
public class CategoriaDTO {
  @ApiModelProperty(position = -2, value = "Identificador de categoría.", allowableValues = "range[1,infinite]")
  @Min(value = 1, message = "Identificador de categoría: El valor mínimo es 1.")
  private Long idCategoria;
  @ApiModelProperty(value = "Nombre de categoría.")
  private String nombre;
  @ApiModelProperty(value = "Descripcion de categoría.")
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
    if (!(o instanceof CategoriaDTO)) {
      return false;
    }
    CategoriaDTO that = (CategoriaDTO) o;
    return Objects.equals(getIdCategoria(), that.getIdCategoria())
        && Objects.equals(getNombre(), that.getNombre()) && Objects.equals(
        getDescripcion(), that.getDescripcion());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getIdCategoria(), getNombre(), getDescripcion());
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("CategoriaDTO{");
    sb.append("idCategoria=").append(idCategoria);
    sb.append(", nombre='").append(nombre).append('\'');
    sb.append(", descripcion='").append(descripcion).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
