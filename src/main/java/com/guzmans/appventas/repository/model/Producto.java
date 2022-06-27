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
@Table(name = "PRODUCTO")
public class Producto {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_PRODUCTO", nullable = false, precision = 0)
  private Long idProducto;

  @Column(name = "CODIGO", nullable = false, length = 50)
  private String codigo;

  @Column(name = "NOMBRE", nullable = false, length = 50)
  private String nombre;

  @Column(name = "DESCRIPCION", nullable = false, length = 50)
  private String descripcion;

  @Column(name = "RUTA_IMAGEN", nullable = false, length = 50)
  private String rutaImagen;

  @ManyToOne
  @JoinColumn(name = "ID_CATEGORIA", nullable = false, foreignKey = @ForeignKey(name = "FK_PRODUCTO_CATEGORIA"))
  private Categoria categoria;

  @ManyToOne
  @JoinColumn(name = "ID_PRESENTACION", nullable = false, foreignKey = @ForeignKey(name = "FK_PRODUCTO_PRESENTACION"))
  private Presentacion presentacion;

  public Long getIdProducto() {
    return idProducto;
  }

  public void setIdProducto(Long idProducto) {
    this.idProducto = idProducto;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
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

  public String getRutaImagen() {
    return rutaImagen;
  }

  public void setRutaImagen(String rutaImagen) {
    this.rutaImagen = rutaImagen;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
  }

  public Presentacion getPresentacion() {
    return presentacion;
  }

  public void setPresentacion(Presentacion presentacion) {
    this.presentacion = presentacion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Producto)) {
      return false;
    }
    Producto producto = (Producto) o;
    return Objects.equals(getIdProducto(), producto.getIdProducto())
        && Objects.equals(getCodigo(), producto.getCodigo()) && Objects.equals(
        getNombre(), producto.getNombre()) && Objects.equals(getDescripcion(),
        producto.getDescripcion()) && Objects.equals(getRutaImagen(),
        producto.getRutaImagen()) && Objects.equals(getCategoria(), producto.getCategoria())
        && Objects.equals(getPresentacion(), producto.getPresentacion());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getIdProducto(), getCodigo(), getNombre(), getDescripcion(),
        getRutaImagen(),
        getCategoria(), getPresentacion());
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Producto{");
    sb.append("idProducto=").append(idProducto);
    sb.append(", codigo='").append(codigo).append('\'');
    sb.append(", nombre='").append(nombre).append('\'');
    sb.append(", descripcion='").append(descripcion).append('\'');
    sb.append(", rutaImagen='").append(rutaImagen).append('\'');
    sb.append(", categoria=").append(categoria);
    sb.append(", presentacion=").append(presentacion);
    sb.append('}');
    return sb.toString();
  }
}
