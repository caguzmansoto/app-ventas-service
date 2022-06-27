package com.guzmans.appventas.dto;

import com.guzmans.appventas.repository.model.Usuario;
import java.util.Date;
import java.util.Objects;

public class EmpleadoDTO {
  private Long idEmpleado;
  private String nombre;
  private String apellidos;
  private String sexo;
  private Date fechaNacimiento;
  private String numeroDocumento;
  private String direccion;
  private String telefono;
  private String email;
  private Usuario usuario;

  public Long getIdEmpleado() {
    return idEmpleado;
  }

  public void setIdEmpleado(Long idEmpleado) {
    this.idEmpleado = idEmpleado;
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

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof EmpleadoDTO)) {
      return false;
    }
    EmpleadoDTO that = (EmpleadoDTO) o;
    return Objects.equals(getIdEmpleado(), that.getIdEmpleado())
        && Objects.equals(getNombre(), that.getNombre()) && Objects.equals(
        getApellidos(), that.getApellidos()) && Objects.equals(getSexo(), that.getSexo())
        && Objects.equals(getFechaNacimiento(), that.getFechaNacimiento())
        && Objects.equals(getNumeroDocumento(), that.getNumeroDocumento())
        && Objects.equals(getDireccion(), that.getDireccion()) && Objects.equals(
        getTelefono(), that.getTelefono()) && Objects.equals(getEmail(), that.getEmail())
        && Objects.equals(getUsuario(), that.getUsuario());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getIdEmpleado(), getNombre(), getApellidos(), getSexo(),
        getFechaNacimiento(),
        getNumeroDocumento(), getDireccion(), getTelefono(), getEmail(), getUsuario());
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("EmpleadoDTO{");
    sb.append("idEmpleado=").append(idEmpleado);
    sb.append(", nombre='").append(nombre).append('\'');
    sb.append(", apellidos='").append(apellidos).append('\'');
    sb.append(", sexo='").append(sexo).append('\'');
    sb.append(", fechaNacimiento=").append(fechaNacimiento);
    sb.append(", numeroDocumento='").append(numeroDocumento).append('\'');
    sb.append(", direccion='").append(direccion).append('\'');
    sb.append(", telefono='").append(telefono).append('\'');
    sb.append(", email='").append(email).append('\'');
    sb.append(", usuario=").append(usuario);
    sb.append('}');
    return sb.toString();
  }
}
