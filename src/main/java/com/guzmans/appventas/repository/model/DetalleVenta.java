package com.guzmans.appventas.repository.model;

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
@Table(name = "DETALLE_VENTA")
public class DetalleVenta {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_DETALLE_VENTA", nullable = false, precision = 0)
  private Long idDetalleVenta;

  @ManyToOne
  @JoinColumn(name = "ID_VENTA", nullable = false, foreignKey = @ForeignKey(name = "FK_DETALLE_VENTA"))
  private Venta venta;

  @ManyToOne
  @JoinColumn(name = "ID_DETALLE_INGRESO", nullable = false, foreignKey = @ForeignKey(name = "FK_DETALLE_VENTA_INGRESO"))
  private DetalleIngreso detalleIngreso;

  @Column(name = "CANTIDAD", nullable = false)
  private Integer cantidad;

  @Column(name = "PRECIO_VENTA", nullable = false)
  private Double precioVenta;

  @Column(name = "DESCUENTO", nullable = false)
  private Double descuento;

  public Long getIdDetalleVenta() {
    return idDetalleVenta;
  }

  public void setIdDetalleVenta(Long idDetalleVenta) {
    this.idDetalleVenta = idDetalleVenta;
  }

  public Venta getVenta() {
    return venta;
  }

  public void setVenta(Venta venta) {
    this.venta = venta;
  }

  public DetalleIngreso getDetalleIngreso() {
    return detalleIngreso;
  }

  public void setDetalleIngreso(DetalleIngreso detalleIngreso) {
    this.detalleIngreso = detalleIngreso;
  }

  public Integer getCantidad() {
    return cantidad;
  }

  public void setCantidad(Integer cantidad) {
    this.cantidad = cantidad;
  }

  public Double getPrecioVenta() {
    return precioVenta;
  }

  public void setPrecioVenta(Double precioVenta) {
    this.precioVenta = precioVenta;
  }

  public Double getDescuento() {
    return descuento;
  }

  public void setDescuento(Double descuento) {
    this.descuento = descuento;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof DetalleVenta)) {
      return false;
    }
    DetalleVenta that = (DetalleVenta) o;
    return Objects.equals(getIdDetalleVenta(), that.getIdDetalleVenta())
        && Objects.equals(getVenta(), that.getVenta()) && Objects.equals(
        getDetalleIngreso(), that.getDetalleIngreso()) && Objects.equals(getCantidad(),
        that.getCantidad()) && Objects.equals(getPrecioVenta(), that.getPrecioVenta())
        && Objects.equals(getDescuento(), that.getDescuento());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getIdDetalleVenta(), getVenta(), getDetalleIngreso(), getCantidad(),
        getPrecioVenta(), getDescuento());
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("DetalleVenta{");
    sb.append("idDetalleVenta=").append(idDetalleVenta);
    sb.append(", venta=").append(venta);
    sb.append(", detalleIngreso=").append(detalleIngreso);
    sb.append(", cantidad=").append(cantidad);
    sb.append(", precioVenta=").append(precioVenta);
    sb.append(", descuento=").append(descuento);
    sb.append('}');
    return sb.toString();
  }
}
