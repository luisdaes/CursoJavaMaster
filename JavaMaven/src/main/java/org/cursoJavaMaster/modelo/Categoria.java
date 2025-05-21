package org.cursoJavaMaster.modelo;

import java.io.Serializable;

public class Categoria implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long id_categoria;
  private String nombre;

  public Categoria() {
  }

  public Categoria(Long id_categoria) {
	this.id_categoria = id_categoria;
  }

  public Long getId_categoria() {
	return id_categoria;
  }

  public void setId_categoria(Long id_categoria) {
	this.id_categoria = id_categoria;
  }

  public String getNombre() {
	return nombre;
  }

  public void setNombre(String nombre) {
	this.nombre = nombre;
  }
}
