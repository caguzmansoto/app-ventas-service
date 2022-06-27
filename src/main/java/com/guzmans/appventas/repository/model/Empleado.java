package com.guzmans.appventas.repository.model;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLEADO")
public class Empleado {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_EMPLEADO", nullable = false, precision = 0)
  private Long idEmpleado;

  @Column(name = "NOMBRE", nullable = false, length = 50)
  private String nombre;

  @Column(name = "APELLIDOS", nullable = false, length = 40)
  private String apellidos;

  @Column(name = "SEXO", nullable = false, length = 1)
  private String sexo;

  @Column(name = "fecha_Nacimiento", nullable = false)
  private Date fechaNacimiento;

  @Column(name = "NUM_DOCUMENTO", nullable = false, length = 8)
  private String numeroDocumento;

  @Column(name = "DIRECCION", nullable = false, length = 100)
  private String direccion;

  @Column(name = "TELEFONO", nullable = false, length = 10)
  private String telefono;

  @Column(name = "EMAIL", nullable = false, length = 50)
  private String email;

  @OneToOne
  @JoinColumn(name = "ID_USUARIO", nullable = false, foreignKey = @ForeignKey(name = "FK_EMPLEADO_USUARIO"))
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
    if (!(o instanceof Empleado)) {
      return false;
    }
    Empleado empleado = (Empleado) o;
    return Objects.equals(getIdEmpleado(), empleado.getIdEmpleado())
        && Objects.equals(getNombre(), empleado.getNombre()) && Objects.equals(
        getApellidos(), empleado.getApellidos()) && Objects.equals(getSexo(),
        empleado.getSexo()) && Objects.equals(getFechaNacimiento(),
        empleado.getFechaNacimiento()) && Objects.equals(getNumeroDocumento(),
        empleado.getNumeroDocumento()) && Objects.equals(getDireccion(),
        empleado.getDireccion()) && Objects.equals(getTelefono(), empleado.getTelefono())
        && Objects.equals(getEmail(), empleado.getEmail()) && Objects.equals(
        getUsuario(), empleado.getUsuario());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getIdEmpleado(), getNombre(), getApellidos(), getSexo(),
        getFechaNacimiento(),
        getNumeroDocumento(), getDireccion(), getTelefono(), getEmail(), getUsuario());
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Empleado{");
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
