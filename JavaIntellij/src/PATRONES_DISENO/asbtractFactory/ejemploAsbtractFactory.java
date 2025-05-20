package PATRONES_DISENO.asbtractFactory;

public class ejemploAsbtractFactory {

  public static void main(String[] args) {

	PizzeriaCartagena cartagena = new PizzeriaCartagena();

	PizzaProducto pizza = cartagena.ordenarPizza("italiana");
	System.out.println("Bruce ordena la pizza " + pizza.getNombre());

	//pizza = cartagena.ordenarPizza("vegetariana");
  }
}
