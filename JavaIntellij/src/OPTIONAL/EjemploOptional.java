package OPTIONAL;

import java.util.Optional;

public class EjemploOptional {
  public static void main(String[] args) {

	String name = "Luisda";
	Optional<String> optional = Optional.of(name);
	System.out.println("optional: " + optional);

	System.out.println(optional.isPresent());
	if (optional.isPresent()) { // es lo opueso a isEmpty
	  System.out.println(optional.get());
	}
  }
}
