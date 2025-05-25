package org.cursoJavaMaster.modelo;

import java.io.Serializable;

public class Categoria implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long idCategoria;
  private String nombre;

  public Categoria() {
  }

  public Categoria(Long id_categoria) {
	this.idCategoria = id_categoria;
  }

  /** Actualizar categoria */
  public Categoria(Long id_categoria, String nombre) {
	this.idCategoria = id_categoria;
	this.nombre = nombre;
  }

  public Categoria(String libros) {
  }

  public Long getIdCategoria() {
	return idCategoria;
  }

  public void setIdCategoria(Long idCategoria) {
	this.idCategoria = idCategoria;
  }

  public String getNombre() {
	return nombre;
  }

  public void setNombre(String nombre) {
	this.nombre = nombre;
  }

  @Override
  public String toString() {
	return idCategoria + " | "
		+ nombre;
  }
}
