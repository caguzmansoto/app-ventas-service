package com.guzmans.appventas.repository.model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PROVEEDOR")
public class Proveedor {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_PROVEEDOR", nullable = false, precision = 0)
  private Long idProveedor;

  @Column(name = "RAZON_SOCIAL", nullable = false, length = 150)
  private String razonSocial;

  @Column(name = "SECTOR_COMERCIAL", nullable = false, length = 50)
  private String sectorComercial;

  @Column(name = "TIPO_DOCUMENTO", nullable = false, length = 20)
  private String tipoDocumento;

  @Column(name = "NUM_DOCUMENTO", nullable = false, length = 11)
  private String numeroDocumento;

  @Column(name = "DIRECCION", nullable = false, length = 100)
  private String direccion;

  @Column(name = "TELEFONO", nullable = false, length = 10)
  private String telefono;

  @Column(name = "EMAIL", nullable = false, length = 50)
  private String email;

  @Column(name = "URL", nullable = false, length = 100)
  private String url;

  public Long getIdProveedor() {
    return idProveedor;
  }

  public void setIdProveedor(Long idProveedor) {
    this.idProveedor = idProveedor;
  }

  public String getRazonSocial() {
    return razonSocial;
  }

  public void setRazonSocial(String razonSocial) {
    this.razonSocial = razonSocial;
  }

  public String getSectorComercial() {
    return sectorComercial;
  }

  public void setSectorComercial(String sectorComercial) {
    this.sectorComercial = sectorComercial;
  }

  public String getTipoDocumento() {
    return tipoDocumento;
  }

  public void setTipoDocumento(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }

  public String getNumeroDocumento() {
    return numeroDocumento;
  }

  public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Proveedor)) {
      return false;
    }
    Proveedor proveedor = (Proveedor) o;
    return Objects.equals(getIdProveedor(), proveedor.getIdProveedor())
        && Objects.equals(getRazonSocial(), proveedor.getRazonSocial())
        && Objects.equals(getSectorComercial(), proveedor.getSectorComercial())
        && Objects.equals(getTipoDocumento(), proveedor.getTipoDocumento())
        && Objects.equals(getNumeroDocumento(), proveedor.getNumeroDocumento())
        && Objects.equals(getDireccion(), proveedor.getDireccion())
        && Objects.equals(getTelefono(), proveedor.getTelefono())
        && Objects.equals(getEmail(), proveedor.getEmail()) && Objects.equals(
        getUrl(), proveedor.getUrl());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getIdProveedor(), getRazonSocial(), getSectorComercial(),
        getTipoDocumento(),
        getNumeroDocumento(), getDireccion(), getTelefono(), getEmail(), getUrl());
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Proveedor{");
    sb.append("idProveedor=").append(idProveedor);
    sb.append(", razonSocial='").append(razonSocial).append('\'');
    sb.append(", sectorComercial='").append(sectorComercial).append('\'');
    sb.append(", tipoDocumento='").append(tipoDocumento).append('\'');
    sb.append(", numeroDocumento='").append(numeroDocumento).append('\'');
    sb.append(", direccion='").append(direccion).append('\'');
    sb.append(", telefono='").append(telefono).append('\'');
    sb.append(", email='").append(email).append('\'');
    sb.append(", url='").append(url).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
