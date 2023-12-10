package estructura_datos.modelo;

import java.util.Objects;

public class Alumno implements Comparable<Alumno>{
  private String nombre;
  private Double nota;

  public Alumno(String nombre, Double nota) {
	this.nombre = nombre;
	this.nota = nota;
  }

  public String getNombre() {
	return nombre;
  }

  public void setNombre(String nombre) {
	this.nombre = nombre;
  }

  public Double getNota() {
	return nota;
  }

  public void setNota(Double nota) {
	this.nota = nota;
  }

  @Override
  public String toString() {
	return "Alumno:" + nombre + " nota=" + nota;
  }

  @Override
  public int compareTo(Alumno o) {
	if (this.nota == null){
	  return 0;
	}
	//return this.nota.compareTo(o.nota); //menor a mayor
	return o.nota.compareTo(this.nota);
  }

  @Override
  public boolean equals(Object object) {
	if (this == object)	  return true;
	if (object == null || getClass() != object.getClass())	  return false;
	Alumno alumno = (Alumno) object;
	return Objects.equals(nombre, alumno.nombre)
		&& Objects.equals(nota, alumno.nota);
  }

  @Override
  public int hashCode() {
	return Objects.hash(nombre, nota);
  }
}
