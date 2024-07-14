package LAMBDA;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {

  public static void main(String[] args) {

	Function<String, String> function = param -> "Hola que tal! " + param;
	String result= function.apply("Luisda");
	System.out.println(result);

	Function<String, String> function2 = String::toUpperCase;
	System.out.println(function2.apply("jesusda"));

	BiFunction<String, String, String> function3 = (a, b) -> a.toLowerCase().concat(b.toUpperCase());
	System.out.println(function3.apply("ayudame ", "dios mio"));
  }
}
