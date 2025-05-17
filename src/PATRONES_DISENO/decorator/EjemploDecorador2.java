package PATRONES_DISENO.decorator;

import PATRONES_DISENO.decorator.decoradores2.Cafe;
import PATRONES_DISENO.decorator.decoradores2.ConChocolateDecorador;
import PATRONES_DISENO.decorator.decoradores2.ConCremaDecorador;
import PATRONES_DISENO.decorator.decoradores2.ConLecheDecorador;
import PATRONES_DISENO.decorator.decoradores2.Configurable;

public class EjemploDecorador2 {

  public static void main(String[] args) {

	Configurable cafeCapuchino = new Cafe("Cafe capuchino", 2.5f);
	ConChocolateDecorador cafeConChocolate = new ConChocolateDecorador(cafeCapuchino);
	ConLecheDecorador cafeConLeche = new ConLecheDecorador(cafeConChocolate);
	ConCremaDecorador cafeConCrema = new ConCremaDecorador(cafeConLeche);

	System.out.println("Precio del cafe Capuchino: " + cafeConCrema.getPrecioBase());
	System.out.println("Ingredientes: " + cafeConCrema.getIngredientes());

	System.out.println("-------");

	Configurable cafeEpress = new Cafe("Cafe Express", 10f);
	ConCremaDecorador expressConCrema = new ConCremaDecorador(cafeEpress);

	System.out.println("Precio del cafe Express: " + expressConCrema.getPrecioBase());
	System.out.println("Ingredientes del cafe Express: " + expressConCrema.getIngredientes());

  }
}
