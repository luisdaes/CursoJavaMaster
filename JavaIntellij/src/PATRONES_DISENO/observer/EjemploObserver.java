package PATRONES_DISENO.observer;

public class EjemploObserver {
  public static void main(String[] args) {

	Corporacion google = new Corporacion("Google", 1000);

	/*
	google.addObserver(observable -> {
	  System.out.println("David: " + ((Corporacion)observable).getNombre() +
		  " nuevo precio: " + ((Corporacion)observable).getPrecio());
	});*/

	google.addObserver((observable, object) -> {
	  System.out.println("Jhon: " + observable);
	});

	google.addObserver((observable, object) -> {
	  System.out.println("LuisFer: " + observable);
	});

	google.modificarPrecio(2300);
  }
}
