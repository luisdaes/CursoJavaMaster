package estructura_datos.set;

import java.util.Set;
import java.util.TreeSet;

import estructura_datos.modelo.Alumno;

public class EjemploTreeSetComparable {
  public static void main(String[] args) {

	Set<Alumno> calif = new TreeSet<>((a, b) -> a.getNombre().compareTo(b.getNombre()));
	calif.add(new Alumno("LuisDa", 4.8));
	calif.add(new Alumno("JesusDa", 4.9));
	calif.add(new Alumno("Miche", 4.3));
	calif.add(new Alumno("JesusDee", 4.28));
	calif.add(new Alumno("LuisE", 4.18));
	calif.add(new Alumno("NuevaPersona", 4.18));

	System.out.println("Calificaciones : " + calif);
  }
}
