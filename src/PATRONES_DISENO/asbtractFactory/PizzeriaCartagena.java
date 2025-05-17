package PATRONES_DISENO.asbtractFactory;

import PATRONES_DISENO.asbtractFactory.producto.PizzaCartagenaItaliana;
import PATRONES_DISENO.asbtractFactory.producto.PizzaCartagenaPepperoni;
import PATRONES_DISENO.asbtractFactory.producto.PizzaCartagenaVegetariana;

public class PizzeriaCartagena extends PizzeriaZonaAbstractFactory {

  @Override
  PizzaProducto crearPizza(String tipo) {
	PizzaProducto producto = null;

	switch (tipo) {
	  case "vegetariana":
		producto = new PizzaCartagenaVegetariana();
		break;
	  case "pepperoni":
		producto = new PizzaCartagenaPepperoni();
		break;
	  case "italiana":
		producto = new PizzaCartagenaItaliana();
		break;
	}
	return producto;
  }
}
