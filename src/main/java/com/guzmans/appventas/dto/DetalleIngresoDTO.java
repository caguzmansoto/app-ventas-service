package com.guzmans.appventas.dto;

import com.guzmans.appventas.repository.model.Ingreso;
import com.guzmans.appventas.repository.model.Producto;
import java.util.Date;
import java.util.Objects;

public class DetalleIngresoDTO {
  private Long idDetalleIngreso;
  private Ingreso ingreso;
  private Producto producto;
  private Double precioCompra;
  private Double precioVenta;
  private Integer stockInicial;
  private Integer stockActual;
  private Date fechaProduccion;
  private Date fechaVencimiento;

  public Long getIdDetalleIngreso() {
    return idDetalleIngreso;
  }

  public void setIdDetalleIngreso(Long idDetalleIngreso) {
    this.idDetalleIngreso = idDetalleIngreso;
  }

  public Ingreso getIngreso() {
    return ingreso;
  }

  public void setIngreso(Ingreso ingreso) {
    this.ingreso = ingreso;
  }

  public Producto getProducto() {
    return producto;
  }

  public void setProducto(Producto producto) {
    this.producto = producto;
  }

  public Double getPrecioCompra() {
    return precioCompra;
  }

  public void setPrecioCompra(Double precioCompra) {
    this.precioCompra = precioCompra;
  }

  public Double getPrecioVenta() {
    return precioVenta;
  }

  public void setPrecioVenta(Double precioVenta) {
    this.precioVenta = precioVenta;
  }

  public Integer getStockInicial() {
    return stockInicial;
  }

  public void setStockInicial(Integer stockInicial) {
    this.stockInicial = stockInicial;
  }

  public Integer getStockActual() {
    return stockActual;
  }

  public void setStockActual(Integer stockActual) {
    this.stockActual = stockActual;
  }

  public Date getFechaProduccion() {
    return fechaProduccion;
  }

  public void setFechaProduccion(Date fechaProduccion) {
    this.fechaProduccion = fechaProduccion;
  }

  public Date getFechaVencimiento() {
    return fechaVencimiento;
  }

  public void setFechaVencimiento(Date fechaVencimiento) {
    this.fechaVencimiento = fechaVencimiento;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof DetalleIngresoDTO)) {
      return false;
    }
    DetalleIngresoDTO that = (DetalleIngresoDTO) o;
    return Objects.equals(getIdDetalleIngreso(), that.getIdDetalleIngreso())
        && Objects.equals(getIngreso(), that.getIngreso()) && Objects.equals(
        getProducto(), that.getProducto()) && Objects.equals(getPrecioCompra(),
        that.getPrecioCompra()) && Objects.equals(getPrecioVenta(), that.getPrecioVenta())
        && Objects.equals(getStockInicial(), that.getStockInicial())
        && Objects.equals(getStockActual(), that.getStockActual())
        && Objects.equals(getFechaProduccion(), that.getFechaProduccion())
        && Objects.equals(getFechaVencimiento(), that.getFechaVencimiento());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getIdDetalleIngreso(), getIngreso(), getProducto(), getPrecioCompra(),
        getPrecioVenta(), getStockInicial(), getStockActual(), getFechaProduccion(),
        getFechaVencimiento());
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("DetalleIngresoDTO{");
    sb.append("idDetalleIngreso=").append(idDetalleIngreso);
    sb.append(", ingreso=").append(ingreso);
    sb.append(", producto=").append(producto);
    sb.append(", precioCompra=").append(precioCompra);
    sb.append(", precioVenta=").append(precioVenta);
    sb.append(", stockInicial=").append(stockInicial);
    sb.append(", stockActual=").append(stockActual);
    sb.append(", fechaProduccion=").append(fechaProduccion);
    sb.append(", fechaVencimiento=").append(fechaVencimiento);
    sb.append('}');
    return sb.toString();
  }
}
