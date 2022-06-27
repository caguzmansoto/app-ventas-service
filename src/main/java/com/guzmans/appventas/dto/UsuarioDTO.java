package com.guzmans.appventas.dto;

import com.guzmans.appventas.repository.model.Rol;
import java.util.List;
import java.util.Objects;

public class UsuarioDTO {
  private Long idUsuario;
  private String nombre;
  private String clave;
  private Boolean estado;
  private List<Rol> roles;

  public Long getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getClave() {
    return clave;
  }

  public void setClave(String clave) {
    this.clave = clave;
  }

  public Boolean getEstado() {
    return estado;
  }

  public void setEstado(Boolean estado) {
    this.estado = estado;
  }

  public List<Rol> getRoles() {
    return roles;
  }

  public void setRoles(List<Rol> roles) {
    this.roles = roles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof UsuarioDTO)) {
      return false;
    }
    UsuarioDTO that = (UsuarioDTO) o;
    return Objects.equals(getIdUsuario(), that.getIdUsuario()) && Objects.equals(
        getNombre(), that.getNombre()) && Objects.equals(getClave(), that.getClave())
        && Objects.equals(getEstado(), that.getEstado()) && Objects.equals(
        getRoles(), that.getRoles());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getIdUsuario(), getNombre(), getClave(), getEstado(), getRoles());
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("UsuarioDTO{");
    sb.append("idUsuario=").append(idUsuario);
    sb.append(", nombre='").append(nombre).append('\'');
    sb.append(", clave='").append(clave).append('\'');
    sb.append(", estado=").append(estado);
    sb.append(", roles=").append(roles);
    sb.append('}');
    return sb.toString();
  }
}
