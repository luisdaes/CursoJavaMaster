package STREAM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class EjemploStream {

  public static void main(String[] args) {

	/*Stream<String> names = Stream.of("Luisda", "Dee", "Jesusda");
	//names.forEach(System.out::println);

	String[] array = {"Luisda", "Dee", "Jesusda"};
	names = Arrays.stream(array);
	names.forEach(System.out::println);*/

	List<String> list = new ArrayList<>();
	list.add("Jose");
	list.add("Ana");
	list.add("Bob");
	list.add("Jack");
	list.add("Luis");

	//Stream<String> names = list.stream();
	//names.forEach(System.out::println);
	list.stream().forEach(System.out::println);
  }
}
