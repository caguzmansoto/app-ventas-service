package com.guzmans.appventas.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.validation.constraints.Min;

@ApiModel(description = "Estructura que contiene el modelo de Presentacion.")
public class PresentacionDTO {

  @ApiModelProperty(position = -2, value = "Identificador de Presentacion.", allowableValues = "range[1,infinite]")
  @Min(value = 1, message = "Identificador de presentacion: El valor mínimo es 1.")
  private Long idPresentacion;

  @ApiModelProperty(value = "Nombre de presentación.")
  private String nombre;

  @ApiModelProperty(value = "Descripcion de presentación.")
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
    if (!(o instanceof PresentacionDTO)) {
      return false;
    }
    PresentacionDTO that = (PresentacionDTO) o;
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
    final StringBuilder sb = new StringBuilder("PresentacionDTO{");
    sb.append("idPresentacion=").append(idPresentacion);
    sb.append(", nombre='").append(nombre).append('\'');
    sb.append(", descripcion='").append(descripcion).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
