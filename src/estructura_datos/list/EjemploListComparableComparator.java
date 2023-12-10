package estructura_datos.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import estructura_datos.modelo.Alumno;

public class EjemploListComparableComparator {

  public static void main(String[] args) {
	System.out.println(":::::::::::::ArrayList::::::::::::::::");
	List<Alumno> calif = new ArrayList<>();
	calif.add(new Alumno("Luisinho", 4.8));
	calif.add(new Alumno("JesusDavicho", 4.9));
	calif.add(new Alumno("Chei", 4.3));
	calif.add(new Alumno("JesusDee", 4.28));
	calif.add(new Alumno("LuisE", 4.18));


	//ordenaoms la lista
	Collections.sort(calif, (a, b) -> a.getNombre().compareTo(b.getNombre()));
	calif.sort(Comparator.comparing(Alumno::getNota));
	calif.sort(Comparator.comparing((Alumno a) -> a.getNota()).reversed());
	calif.forEach(System.out::println);
  }
}
