package PATRONES_DISENO.decorator.decoradores2;

public class Cafe implements Configurable{

  private float precio;
  private	 String nombre;

  public Cafe(String nombre, float precio) {
	this.nombre = nombre;
	this.precio = precio;
  }

  @Override
  public float getPrecioBase() {
	return 0;
  }

  @Override
  public String getIngredientes() {
	return nombre;
  }
}
