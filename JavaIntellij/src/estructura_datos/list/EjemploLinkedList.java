package estructura_datos.list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import estructura_datos.modelo.Alumno;

public class EjemploLinkedList {
  public static void main(String[] args) {

	LinkedList<Alumno> enlazada = new LinkedList<>();
	System.out.println(enlazada + ", Size: " + enlazada.size());
	enlazada.add(new Alumno("L", 1.0));
	enlazada.add(new Alumno("D", 2.1));
	enlazada.add(new Alumno("M", 3.2));
	enlazada.add(new Alumno("J", 4.3));
	System.out.println(enlazada + ", Size: " + enlazada.size());

	enlazada.addFirst(new Alumno("primer", 1.1));
	enlazada.addLast(new Alumno("ultimo", 2.2));
	System.out.println(enlazada + ", Size: " + enlazada.size());

	System.out.println("::::::::::::::::::::LIST-ITERATOR::::::::::::::::::::::");
	ListIterator<Alumno> iterator = enlazada.listIterator();
	System.out.println(".....................NEXT");
	while (iterator.hasNext()){
	  System.out.println(iterator.next());
	}
	System.out.println(".....................PREVIOUS");
	while (iterator.hasPrevious()){
	  Alumno alumno = iterator.previous();
	  System.out.println(alumno);
	}
  }
}
