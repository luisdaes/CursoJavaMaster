package estructura_datos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import HERENCIA.Alumno;
import org.w3c.dom.ls.LSOutput;

public class EjemploHashMap {
  public static void main(String[] args) {

	Map<String, String> persona = new HashMap<>();
	persona.put("nombre", "Davide");
	persona.put("apellido", "Escorcia");
	persona.put("edad", "26");
	persona.put("mail", "Example@gmail.com");
	persona.put("numero", "123");

	persona.put("apellidoMaterno", "Avila");
	System.out.println(persona.get("nombre"));
	System.out.println(persona);
	String elimnado = persona.remove("apellidoMaterno");
	System.out.println(persona);

	//Reemplazar valor de un map
	boolean b = persona.replace("nombre", "LuisDa", "Davide");
	System.out.println("Lo reemplazo?: " +b);

	Boolean contieneValor = persona.containsValue("Escorcia");
	System.out.println("Contiene valor: " + contieneValor);

	System.out.println("::::::::::::::::::VALORES::::::::::::::::::::::::");
	Collection<String> valores = persona.values();
	for (String v: valores){
	  System.out.println("Valor: " +v);
	}

	System.out.println("::::::::::::::::::LLAVES::::::::::::::::::::::::");
	Set<String> llaves = persona.keySet();
	for (String ll: llaves){
	  System.out.println("llave: "+ ll);
	}

	System.out.println("::::::::::::::::::ENTRY -> INNER CLASS::::::::::::::::::::::::");
	for (Map.Entry<String, String> mapa: persona.entrySet()){
	  System.out.println(mapa.getKey() + " => " + mapa.getValue());
	}
	System.out.println("::::::::::::::::::OTRA FORMA ITERAR::::::::::::::::::::::::");
	for (String ll: persona.keySet()){
	  String valor = persona.get(ll);
	  System.out.println("llave: " + ll + " -> " + "valor: " +valor);
	}
	System.out.println("::::::::::::::::::LAMBDA::::::::::::::::::::::::");
	persona.forEach((ll, val) -> System.out.println(ll + "->" + val));

	System.out.println("::::::::::::::::::MAP ANIDADOS::::::::::::::::::::::::");
	Map<String, Object> per = new HashMap<>();
	per.put("nombres", "Luis David");
	per.put("apellidos", "Escorcia Avila");
	Map<String, String> ubicacion = new HashMap<>();
	ubicacion.put("pais", "Colombia");
	ubicacion.put("ciudad", "Cartagena");
	ubicacion.put("barrio", "Sierrita");
	ubicacion.put("calle", "Primavera");
	per.put("direccion", ubicacion);

	Map<String, String> dirPersona = (Map<String, String>) per.getOrDefault("direccion", "Sin direccion");
	String pais = dirPersona.get("pais");
	String ciudad = dirPersona.get("ciudad");
	String zona = dirPersona.getOrDefault("zona", "No especifico zona");

	System.out.print("Pais: " + pais + "\nCiudad: " + ciudad + "\nZona: " + zona + "\n");
	System.out.println("Map: " +per);

	System.out.println(":::::::::::::::::::::::::::::::::::::");
	for (Map.Entry<String, Object> par: per.entrySet()){
	  Object valor = par.getValue();
	  if (valor instanceof Map){
		String  nom = (String) per.get("nombre");
		Map<String, String> dirMap = (Map<String, String>) valor;
		for (Map.Entry<String, String> parDir: dirMap.entrySet()){
		  System.out.println("direcccion: " + parDir.getKey() + " => " + parDir.getValue());
		}
	  }else {
		System.out.println("Persona: "+ par.getKey() + " => " + valor);
	  }
	}
  }
}
