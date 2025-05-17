package PATRONES_DISENO.asbtractFactory.producto;

import PATRONES_DISENO.asbtractFactory.PizzaProducto;

public class PizzaCartagenaVegetariana extends PizzaProducto {

  public PizzaCartagenaVegetariana() {
	super();
	nombre = "Pizza vegetariana Cartagena";
	masa = "Masa integral vegana";
	salsa = "Salda de tomate";
	ingredientes.add("Queso");
	ingredientes.add("Tomate");
	ingredientes.add("Aceitunas");
	ingredientes.add("Espinacas");
	ingredientes.add("Berenjenas");
  }

  @Override
  public void cocinar() {

	System.out.println("Cocinando " + nombre + " por 25min a 150°C.");
  }

  @Override
  public void cortar() {

	System.out.println("Cortando la pizza en rebanadas cuadradas.");
  }
}
