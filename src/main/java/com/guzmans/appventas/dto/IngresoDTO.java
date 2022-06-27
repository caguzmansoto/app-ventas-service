package com.guzmans.appventas.dto;

import com.guzmans.appventas.repository.model.Empleado;
import com.guzmans.appventas.repository.model.Proveedor;
import java.util.Date;
import java.util.Objects;

public class IngresoDTO {
  private Long idIngreso;
  private Date fecha;
  private String tipoComprobante;
  private String serie;
  private String correlativo;
  private Double igv;
  private Empleado empleado;
  private Proveedor proveedor;

  public Long getIdIngreso() {
    return idIngreso;
  }

  public void setIdIngreso(Long idIngreso) {
    this.idIngreso = idIngreso;
  }

  public Date getFecha() {
    return fecha;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  public String getTipoComprobante() {
    return tipoComprobante;
  }

  public void setTipoComprobante(String tipoComprobante) {
    this.tipoComprobante = tipoComprobante;
  }

  public String getSerie() {
    return serie;
  }

  public void setSerie(String serie) {
    this.serie = serie;
  }

  public String getCorrelativo() {
    return correlativo;
  }

  public void setCorrelativo(String correlativo) {
    this.correlativo = correlativo;
  }

  public Double getIgv() {
    return igv;
  }

  public void setIgv(Double igv) {
    this.igv = igv;
  }

  public Empleado getEmpleado() {
    return empleado;
  }

  public void setEmpleado(Empleado empleado) {
    this.empleado = empleado;
  }

  public Proveedor getProveedor() {
    return proveedor;
  }

  public void setProveedor(Proveedor proveedor) {
    this.proveedor = proveedor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof IngresoDTO)) {
      return false;
    }
    IngresoDTO that = (IngresoDTO) o;
    return Objects.equals(getIdIngreso(), that.getIdIngreso()) && Objects.equals(
        getFecha(), that.getFecha()) && Objects.equals(getTipoComprobante(),
        that.getTipoComprobante()) && Objects.equals(getSerie(), that.getSerie())
        && Objects.equals(getCorrelativo(), that.getCorrelativo())
        && Objects.equals(getIgv(), that.getIgv()) && Objects.equals(
        getEmpleado(), that.getEmpleado()) && Objects.equals(getProveedor(),
        that.getProveedor());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getIdIngreso(), getFecha(), getTipoComprobante(), getSerie(),
        getCorrelativo(), getIgv(), getEmpleado(), getProveedor());
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("IngresoDTO{");
    sb.append("idIngreso=").append(idIngreso);
    sb.append(", fecha=").append(fecha);
    sb.append(", tipoComprobante='").append(tipoComprobante).append('\'');
    sb.append(", serie='").append(serie).append('\'');
    sb.append(", correlativo='").append(correlativo).append('\'');
    sb.append(", igv=").append(igv);
    sb.append(", empleado=").append(empleado);
    sb.append(", proveedor=").append(proveedor);
    sb.append('}');
    return sb.toString();
  }
}
