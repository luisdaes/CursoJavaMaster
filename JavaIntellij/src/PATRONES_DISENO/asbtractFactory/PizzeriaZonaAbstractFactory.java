package PATRONES_DISENO.asbtractFactory;

abstract public class PizzeriaZonaAbstractFactory {

  public PizzaProducto ordenarPizza(String tipo) {

	PizzaProducto pizza = crearPizza(tipo);
	System.out.println("....Fabrizando la pizza " + pizza.getNombre() + "....");
	pizza.preparar();
	pizza.cocinar();
	pizza.cortar();
	pizza.empaquetar();
	return pizza;
  }

  abstract PizzaProducto crearPizza(String tipo);
}
