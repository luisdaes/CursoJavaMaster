package PATRONES_DISENO.asbtractFactory.producto;

import PATRONES_DISENO.asbtractFactory.PizzaProducto;

public class PizzaCartagenaPepperoni extends PizzaProducto {

  public PizzaCartagenaPepperoni(){
	super();
	nombre = "Pizza pepperoni Cartagena";
	masa = "Masa delgada a la piedra";
	salsa = "Salda de tomate";
	ingredientes.add("Queso mozzarella");
	ingredientes.add("Extra pepperoni");
	ingredientes.add("Aceitunas");
  }

  @Override
  public void cocinar() {

	System.out.println("Cocinando " + nombre + " por 40min a 90°C.");
  }

  @Override
  public void cortar() {

	System.out.println("Cortando la pizza en triángulos.");
  }
}
