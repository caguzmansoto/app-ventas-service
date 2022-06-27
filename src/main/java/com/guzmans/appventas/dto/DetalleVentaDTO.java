package com.guzmans.appventas.dto;

import com.guzmans.appventas.repository.model.DetalleIngreso;
import com.guzmans.appventas.repository.model.Venta;
import java.util.Objects;

public class DetalleVentaDTO {
  private Long idDetalleVenta;
  private Venta venta;
  private DetalleIngreso detalleIngreso;
  private Integer cantidad;
  private Double precioVenta;
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
    if (!(o instanceof DetalleVentaDTO)) {
      return false;
    }
    DetalleVentaDTO that = (DetalleVentaDTO) o;
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
    final StringBuilder sb = new StringBuilder("DetalleVentaDTO{");
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
