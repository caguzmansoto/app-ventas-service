package com.guzmans.appventas.repository.model;

import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class Usuario {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_USUARIO", nullable = false, precision = 0)
  private Long idUsuario;

  @Column(name = "NOMBRE", nullable = false, length = 100)
  private String nombre;

  @Column(name = "CLAVE", nullable = false, length = 50)
  private String clave;

  @Column(name = "ESTADO", nullable = false)
  private Boolean estado;

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(name = "USUARIO_ROL",
      joinColumns = @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO"),
      inverseJoinColumns = @JoinColumn(name = "ID_ROL", referencedColumnName = "ID_ROL"))
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
    if (!(o instanceof Usuario)) {
      return false;
    }
    Usuario usuario = (Usuario) o;
    return Objects.equals(getIdUsuario(), usuario.getIdUsuario())
        && Objects.equals(getNombre(), usuario.getNombre()) && Objects.equals(
        getClave(), usuario.getClave()) && Objects.equals(getEstado(), usuario.getEstado())
        && Objects.equals(getRoles(), usuario.getRoles());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getIdUsuario(), getNombre(), getClave(), getEstado(), getRoles());
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Usuario{");
    sb.append("idUsuario=").append(idUsuario);
    sb.append(", nombre='").append(nombre).append('\'');
    sb.append(", clave='").append(clave).append('\'');
    sb.append(", estado=").append(estado);
    sb.append(", roles=").append(roles);
    sb.append('}');
    return sb.toString();
  }
}
