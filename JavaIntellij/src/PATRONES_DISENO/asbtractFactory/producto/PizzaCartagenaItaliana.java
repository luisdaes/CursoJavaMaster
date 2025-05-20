package PATRONES_DISENO.asbtractFactory.producto;

import PATRONES_DISENO.asbtractFactory.PizzaProducto;

public class PizzaCartagenaItaliana extends PizzaProducto {

  public PizzaCartagenaItaliana(){
	super();
	nombre = "Pizza Italiana Cartagena";
	masa = "Masa gruesa";
	salsa = "Salda de tomate italiano carne";
	ingredientes.add("Queso mozzarella");
	ingredientes.add("Aceitunas");
	ingredientes.add("Jamón");
	ingredientes.add("Choricillo");
	ingredientes.add("Champíñones");
  }

  @Override
  public void cocinar() {

	System.out.println("Cocinando " + nombre + " por 30min a 120°C.");
  }

  @Override
  public void cortar() {

	System.out.println("Cortando la pizza en triángulos grandes.");
  }
}
