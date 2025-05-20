package estructura_datos.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
  public static void main(String[] args) {

	Set<String> ts = new TreeSet<>((a, b) -> b.compareTo(a));
	ts.add("uno");
	ts.add("dos");
	ts.add("tres");
	ts.add("cuatro");
	ts.add("quinto");
	System.out.println("Orden TreeSet: " + ts);

	Set<Integer> num = new TreeSet<>(Comparator.reverseOrder());
	num.add(1);
	num.add(5);
	num.add(2);
	num.add(4);
	num.add(3);
	System.out.println("Orden Numeros: " + num);
  }
}
