package poo_interfaces;

import poo_interfaces.models.Curriculo;
import static  poo_interfaces.models.GeneroEnum.*;
import poo_interfaces.models.Imprimible;
import poo_interfaces.models.Informe;
import poo_interfaces.models.Libro;
import poo_interfaces.models.Pagina;
import poo_interfaces.models.Persona;

public class EjemploImprenta {

  public static void main(String[] args) {

	Curriculo cv = new Curriculo(new Persona("Luis", "Escorcia"),
		"Ing Sistemas", "Resumen Laboral...");
	cv.addExperiencias("Java")
		.addExperiencias("Spring")
		.addExperiencias("Javascript")
		.addExperiencias("Angular");

	Informe informe = new Informe(new Persona("Davide", "Avila"),
		"Estudio micro servicios",  "James");
	imprimir(cv);
	imprimir(informe);

	Libro libro = new Libro(new Persona("Erich", "Gamma"), "Patron de diseño: Elem reusables POO", PROGRAMACION);
	libro.addPagina(new Pagina("Patron singleton"))
		.addPagina(new Pagina("Patron factory"))
		.addPagina(new Pagina("Patron composite"))
		.addPagina(new Pagina("Patron facade"));

	imprimir(libro);

  }

  public static void imprimir(Imprimible imprimible){
	System.out.println(imprimible.imprimir());
  }
}
