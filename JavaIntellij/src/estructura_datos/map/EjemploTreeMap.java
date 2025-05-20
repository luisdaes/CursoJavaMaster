package estructura_datos.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EjemploTreeMap {
  public static void main(String[] args) {

	Map<String, Object> persona = new TreeMap<>(/*(a, b) -> b.compareTo(a)*/Comparator.comparing(String::length).reversed());
	System.out.println("::::::::::::::::::::TREEMAP:::::::::::::::::::::");
	persona.put("nombre", "Davicho");
	persona.put("apellido", "Avila");
	persona.put("apellidoPaterno", "Escorcia");
	persona.put("email", "example@hotmail.com");
	persona.put("edad", "27");
	Map<String, String> dir = new HashMap<>();
	dir.put("pais", "Colombia");
	dir.put("ciudad", "Cartagena");
	dir.put("barrio", "Sierrita");
	dir.put("calle", "Primavera");
	persona.put("direccion", dir);

	System.out.println("Persona: " + persona);
  }

}
