package estructura_datos.list;

import java.util.ArrayList;
import java.util.List;

import estructura_datos.modelo.Alumno;

public class EjemploArrayList {

  public static void main(String[] args) {
	System.out.println(":::::::::::::ArrayList::::::::::::::::");
	List<Alumno> al = new ArrayList<>();

	System.out.println(al + ", size: " + al.size());
	System.out.println("Lista vacia: " + al.isEmpty());


	al.add(new Alumno("Luisinho", 4.8));
	al.add(new Alumno("JesusDavicho", 4.9));
	al.add(new Alumno("Chei", 4.3));
	al.add(new Alumno("JesusDee", 4.28));
	al.set(3, new Alumno("LuisE", 4.18));
	al.add(2, new Alumno("A", 10.0));

	al.remove(3);
	al.remove(new Alumno("nombre", 0.0));
	System.out.println(al + ", size: " + al.size());

  }
}
