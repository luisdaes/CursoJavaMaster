package STREAM;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import STREAM.MODELS.User;

public class EjemploStreamMap {

  public static void main(String[] args) {

	/*Stream<String> names = Stream.of("Luisda", "Dee", "Jesusda").map(
		nombre -> {return nombre.toLowerCase()});//nombre.toUpperCase());
	names.forEach(System.out::println);*/

	Stream<User> users = Stream
		.of("Luisda Escorcia", "Dee Avila", "Jesusda Julio")
		.map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
		.peek(u -> System.out.println(u.getName()))
		.filter(u -> u.getName().equals("Luisda"))
		.map(user -> {
		  String name = user.getName().toUpperCase();
		  user.setName(name);
		  return user;
		});

	List<User> listaUsers = users.collect(Collectors.toList());
	listaUsers.forEach(u -> System.out.println(u.getLastName()));
  }
}
