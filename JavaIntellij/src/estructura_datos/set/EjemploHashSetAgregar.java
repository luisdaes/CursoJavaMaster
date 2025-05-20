package estructura_datos.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EjemploHashSetAgregar {

  public static void main(String[] args) {

	Set<String> hs = new HashSet<>();
	hs.add("uno");
	hs.add("dos");
	hs.add("tres");
	hs.add("cuatro");
	hs.add("quinto");
	System.out.println("Datos  Set: " +hs);


	//Se ordena List apartir de el Set
	List<String> l = new ArrayList<>(hs);
	Collections.sort(l);
	System.out.println("Datos List: " + l);

	//elemento duplicado
	boolean b = hs.add("tres");
	System.out.println("Valor duplicado: " + b);
	System.out.println(hs);
  }
}
