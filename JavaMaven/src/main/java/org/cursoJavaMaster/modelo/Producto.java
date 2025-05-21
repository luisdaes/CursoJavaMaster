package org.cursoJavaMaster.modelo;

import java.io.Serializable;
import java.util.Date;

public class Producto implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long idProducto;
  private String nombre;
  private Long precio;
  private Date fechaRegistro;

  private Categoria categoria;

  /**Constructor vacio**/
  public Producto() {

  }

  /**Constructor con parametros**/
  public Producto(Long idProducto, String nombre, Long precio, Date fechaRegistro,
	  Categoria categoria) {
	this.idProducto = idProducto;
	this.nombre = nombre;
	this.precio = precio;
	this.fechaRegistro = fechaRegistro;
	this.categoria = categoria;
  }

  public Producto(long l, String miniMacintoshM3, long l1, Date date) {
  }

  public Long getIdProducto() {
	return idProducto;
  }

  public void setIdProducto(Long idProducto) {
	this.idProducto = idProducto;
  }

  public String getNombre() {
	return nombre;
  }

  public void setNombre(String nombre) {
	this.nombre = nombre;
  }

  public Long getPrecio() {
	return precio;
  }

  public void setPrecio(Long precio) {
	this.precio = precio;
  }

  public Date getFechaRegistro() {
	return fechaRegistro;
  }

  public void setFechaRegistro(Date fechaRegistro) {
	this.fechaRegistro = fechaRegistro;
  }

  public Categoria getCategoria() {
	return categoria;
  }

  public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
  }

  @Override
  public String toString() {
	return idProducto + " | "
		+ nombre + " | "
		+ precio + " | "
		+ fechaRegistro + " | "
		+ categoria.getNombre();
  }
}
