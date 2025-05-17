package PATRONES_DISENO.decorator.decoradores;

public class Texto implements Formateable {

  private String nombre;

  public Texto(String nombre) {
	this.nombre = nombre;
  }

  public String getNombre() {
	return nombre;
  }

  @Override
  public String darFormato() {
	return nombre;
  }
}
