package estructura_datos.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import estructura_datos.modelo.Alumno;

public class EjemploHashSetUnicidad {
  public static void main(String[] args) {

	System.out.println(":::::::::::::HashSet::::::::::::::::");
	Set<Alumno> calif = new HashSet<>();
	calif.add(new Alumno("LuisDa", 4.8));
	calif.add(new Alumno("JesusDa", 4.9));
	calif.add(new Alumno("Miche", 4.3));
	calif.add(new Alumno("JesusDee", 4.28));
	calif.add(new Alumno("LuisE", 4.18));
	calif.add(new Alumno("LuisE", 4.18));

	System.out.println("Calificaciones : " + calif);

	System.out.println("--------------FOREACH-----------------");
	for (Alumno a: calif){
	  System.out.println(a);
	}
	System.out.println("--------------WHILE-----------------");
	Iterator<Alumno> alumnoIterator = calif.iterator();
	while (alumnoIterator.hasNext()){
	  Alumno alumno = alumnoIterator.next();
	  System.out.println(alumno);
	}

	System.out.println(":::::::::::::TreeSet::::::::::::::::");
	Set<Alumno> notas = new TreeSet<>();
	notas.add(new Alumno("David", 4.8));
	notas.add(new Alumno("Jesu", 4.9));
	notas.add(new Alumno("Dee", 4.28));
	notas.add(new Alumno("Enrique", 4.18));

	System.out.println("--------------ForEach-----------------");
	for (Alumno a: notas){
	  System.out.println(a);
	}
	System.out.println("--------------While-----------------");
	Iterator<Alumno> it = notas.iterator();
	while (it.hasNext()){
	  Alumno alumno = it.next();
	  System.out.println(alumno);
	}

	System.out.println("::::::::::::::::::::::FOREACH LAMBDA::::::::::::::::::::::");
	notas.forEach(a  -> System.out.println(a.getNombre()));
	notas.forEach(System.out::println);

  }
}
