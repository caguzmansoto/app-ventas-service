package com.guzmans.appventas.repository.model;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "VENTA")
public class Venta {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_VENTA", nullable = false, precision = 0)
  private Long idVenta;

  @ManyToOne
  @JoinColumn(name = "ID_CLIENTE", nullable = false, foreignKey = @ForeignKey(name = "FK_VENTA_CLIENTE"))
  private Cliente cliente;

  @ManyToOne
  @JoinColumn(name = "ID_EMPLEADO", nullable = false, foreignKey = @ForeignKey(name = "FK_VENTA_EMPLEADO"))
  private Empleado empleado;

  @Column(name = "FECHA", nullable = false)
  private Date fecha;

  @Column(name = "TIPO_COMPROBANTE", nullable = false, length = 20)
  private String tipoComprobante;

  @Column(name = "SERIE", nullable = false, length = 4)
  private String serie;

  @Column(name = "CORRELATIVO", nullable = false, length = 7)
  private String correlativo;

  @Column(name = "IGV", nullable = false)
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
    if (!(o instanceof Venta)) {
      return false;
    }
    Venta venta = (Venta) o;
    return Objects.equals(getIdVenta(), venta.getIdVenta()) && Objects.equals(
        getCliente(), venta.getCliente()) && Objects.equals(getEmpleado(),
        venta.getEmpleado()) && Objects.equals(getFecha(), venta.getFecha())
        && Objects.equals(getTipoComprobante(), venta.getTipoComprobante())
        && Objects.equals(getSerie(), venta.getSerie()) && Objects.equals(
        getCorrelativo(), venta.getCorrelativo()) && Objects.equals(getIgv(),
        venta.getIgv());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getIdVenta(), getCliente(), getEmpleado(), getFecha(), getTipoComprobante(),
        getSerie(), getCorrelativo(), getIgv());
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Venta{");
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
