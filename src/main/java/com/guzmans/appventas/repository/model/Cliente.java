package com.guzmans.appventas.repository.model;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class Cliente {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_CLIENTE", nullable = false, precision = 0)
  private Long idCliente;

  @Column(name = "NOMBRE", nullable = false, length = 50)
  private String nombre;

  @Column(name = "APELLIDOS", nullable = false, length = 40)
  private String apellidos;

  @Column(name = "SEXO", nullable = false, length = 1)
  private String sexo;

  @Column(name = "FECHA_NACIMIENTO", nullable = false)
  private Date fechaNacimiento;

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
    if (!(o instanceof Cliente)) {
      return false;
    }
    Cliente cliente = (Cliente) o;
    return Objects.equals(getIdCliente(), cliente.getIdCliente())
        && Objects.equals(getNombre(), cliente.getNombre()) && Objects.equals(
        getApellidos(), cliente.getApellidos()) && Objects.equals(getSexo(),
        cliente.getSexo()) && Objects.equals(getFechaNacimiento(),
        cliente.getFechaNacimiento()) && Objects.equals(getTipoDocumento(),
        cliente.getTipoDocumento()) && Objects.equals(getNumeroDocumento(),
        cliente.getNumeroDocumento()) && Objects.equals(getDireccion(),
        cliente.getDireccion()) && Objects.equals(getTelefono(), cliente.getTelefono())
        && Objects.equals(getEmail(), cliente.getEmail());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getIdCliente(), getNombre(), getApellidos(), getSexo(),
        getFechaNacimiento(),
        getTipoDocumento(), getNumeroDocumento(), getDireccion(), getTelefono(), getEmail());
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Cliente{");
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
