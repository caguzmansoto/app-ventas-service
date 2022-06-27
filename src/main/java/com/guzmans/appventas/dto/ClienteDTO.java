package com.guzmans.appventas.dto;

import java.util.Date;
import java.util.Objects;

public class ClienteDTO {
  private Long idCliente;
  private String nombre;
  private String apellidos;
  private String sexo;
  private Date fechaNacimiento;
  private String tipoDocumento;
  private String numeroDocumento;
  private String direccion;
  private String telefono;
  private String email;

  public Long getIdCliente() {
    return idCliente;
  }

  public void setIdCliente(Long idCliente) {
    this.idCliente = idCliente;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public Date getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(Date fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ClienteDTO)) {
      return false;
    }
    ClienteDTO that = (ClienteDTO) o;
    return Objects.equals(getIdCliente(), that.getIdCliente()) && Objects.equals(
        getNombre(), that.getNombre()) && Objects.equals(getApellidos(),
        that.getApellidos()) && Objects.equals(getSexo(), that.getSexo())
        && Objects.equals(getFechaNacimiento(), that.getFechaNacimiento())
        && Objects.equals(getTipoDocumento(), that.getTipoDocumento())
        && Objects.equals(getNumeroDocumento(), that.getNumeroDocumento())
        && Objects.equals(getDireccion(), that.getDireccion()) && Objects.equals(
        getTelefono(), that.getTelefono()) && Objects.equals(getEmail(), that.getEmail());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getIdCliente(), getNombre(), getApellidos(), getSexo(),
        getFechaNacimiento(),
        getTipoDocumento(), getNumeroDocumento(), getDireccion(), getTelefono(), getEmail());
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("ClienteDTO{");
    sb.append("idCliente=").append(idCliente);
    sb.append(", nombre='").append(nombre).append('\'');
    sb.append(", apellidos='").append(apellidos).append('\'');
    sb.append(", sexo='").append(sexo).append('\'');
    sb.append(", fechaNacimiento=").append(fechaNacimiento);
    sb.append(", tipoDocumento='").append(tipoDocumento).append('\'');
    sb.append(", numeroDocumento='").append(numeroDocumento).append('\'');
    sb.append(", direccion='").append(direccion).append('\'');
    sb.append(", telefono='").append(telefono).append('\'');
    sb.append(", email='").append(email).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
