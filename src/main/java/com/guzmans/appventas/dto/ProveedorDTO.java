package com.guzmans.appventas.dto;

import java.util.Objects;

public class ProveedorDTO {
  private Long idProveedor;
  private String razonSocial;
  private String sectorComercial;
  private String tipoDocumento;
  private String numeroDocumento;
  private String direccion;
  private String telefono;
  private String email;
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
    if (!(o instanceof ProveedorDTO)) {
      return false;
    }
    ProveedorDTO that = (ProveedorDTO) o;
    return Objects.equals(getIdProveedor(), that.getIdProveedor())
        && Objects.equals(getRazonSocial(), that.getRazonSocial())
        && Objects.equals(getSectorComercial(), that.getSectorComercial())
        && Objects.equals(getTipoDocumento(), that.getTipoDocumento())
        && Objects.equals(getNumeroDocumento(), that.getNumeroDocumento())
        && Objects.equals(getDireccion(), that.getDireccion()) && Objects.equals(
        getTelefono(), that.getTelefono()) && Objects.equals(getEmail(), that.getEmail())
        && Objects.equals(getUrl(), that.getUrl());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getIdProveedor(), getRazonSocial(), getSectorComercial(),
        getTipoDocumento(),
        getNumeroDocumento(), getDireccion(), getTelefono(), getEmail(), getUrl());
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("ProveedorDTO{");
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
