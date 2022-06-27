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
@Table(name = "INGRESO")
public class Ingreso {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_INGRESO", nullable = false, precision = 0)
  private Long idIngreso;

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

  @ManyToOne
  @JoinColumn(name = "ID_EMPLEADO", nullable = false, foreignKey = @ForeignKey(name = "FK_INGRESO_EMPLEADO"))
  private Empleado empleado;

  @ManyToOne
  @JoinColumn(name = "ID_PROVEEDOR", nullable = false, foreignKey = @ForeignKey(name = "FK_INGRESO_PROVEEDOR"))
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
    if (!(o instanceof Ingreso)) {
      return false;
    }
    Ingreso ingreso = (Ingreso) o;
    return Objects.equals(getIdIngreso(), ingreso.getIdIngreso())
        && Objects.equals(getFecha(), ingreso.getFecha()) && Objects.equals(
        getTipoComprobante(), ingreso.getTipoComprobante()) && Objects.equals(getSerie(),
        ingreso.getSerie()) && Objects.equals(getCorrelativo(), ingreso.getCorrelativo())
        && Objects.equals(getIgv(), ingreso.getIgv()) && Objects.equals(
        getEmpleado(), ingreso.getEmpleado()) && Objects.equals(getProveedor(),
        ingreso.getProveedor());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getIdIngreso(), getFecha(), getTipoComprobante(), getSerie(),
        getCorrelativo(), getIgv(), getEmpleado(), getProveedor());
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Ingreso{");
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
