package com.guzmans.appventas.dto;

import com.guzmans.appventas.repository.model.Cliente;
import com.guzmans.appventas.repository.model.Empleado;
import java.util.Date;
import java.util.Objects;

public class VentaDTO {
  private Long idVenta;
  private Cliente cliente;
  private Empleado empleado;
  private Date fecha;
  private String tipoComprobante;
  private String serie;
  private String correlativo;
  private Double igv;

  public Long getIdVenta() {
    return idVenta;
  }

  public void setIdVenta(Long idVenta) {
    this.idVenta = idVenta;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public Empleado getEmpleado() {
    return empleado;
  }

  public void setEmpleado(Empleado empleado) {
    this.empleado = empleado;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof VentaDTO)) {
      return false;
    }
    VentaDTO ventaDTO = (VentaDTO) o;
    return Objects.equals(getIdVenta(), ventaDTO.getIdVenta()) && Objects.equals(
        getCliente(), ventaDTO.getCliente()) && Objects.equals(getEmpleado(),
        ventaDTO.getEmpleado()) && Objects.equals(getFecha(), ventaDTO.getFecha())
        && Objects.equals(getTipoComprobante(), ventaDTO.getTipoComprobante())
        && Objects.equals(getSerie(), ventaDTO.getSerie()) && Objects.equals(
        getCorrelativo(), ventaDTO.getCorrelativo()) && Objects.equals(getIgv(),
        ventaDTO.getIgv());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getIdVenta(), getCliente(), getEmpleado(), getFecha(), getTipoComprobante(),
        getSerie(), getCorrelativo(), getIgv());
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("VentaDTO{");
    sb.append("idVenta=").append(idVenta);
    sb.append(", cliente=").append(cliente);
    sb.append(", empleado=").append(empleado);
    sb.append(", fecha=").append(fecha);
    sb.append(", tipoComprobante='").append(tipoComprobante).append('\'');
    sb.append(", serie='").append(serie).append('\'');
    sb.append(", correlativo='").append(correlativo).append('\'');
    sb.append(", igv=").append(igv);
    sb.append('}');
    return sb.toString();
  }
}
