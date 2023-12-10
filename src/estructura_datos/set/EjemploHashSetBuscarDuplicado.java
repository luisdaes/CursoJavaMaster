package estructura_datos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado {
  public static void main(String[] args) {

	String[] peces = {"Corvina", "Lenguado", "Perjerrey", "Robalo", "Atun", "Lenguado", "Corvina"};

	Set<String> pecesUnicos = new HashSet<>();
	Set<String> duplicados = new HashSet<>();
	for (String pez: peces){
	  if (!pecesUnicos.add(pez)){
		System.out.println("Elemento duplicado: " + pez);
		duplicados.add(pez);
	  }
	}

	//Se eliminan los duplicados
	pecesUnicos.removeAll(duplicados);
	System.out.println(pecesUnicos.size() + " elementos no duplicados " + pecesUnicos);
	System.out.println(duplicados.size() + " elementos :" + duplicados);
  }
}
