package LAMBDA;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import LAMBDA.MODELS.User;

public class EjemploConsumer {

  public static void main(String[] args) {

	Consumer<Date> consumer = date -> {
	  SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");

	  System.out.println(f.format(date));
	};
	consumer.accept(new Date());


	BiConsumer<String, Integer> biConsumer = (name, age) -> {
	  System.out.println("My name is " + name + " and age is " + age);
	};
	biConsumer.accept("LuisDa", 27);

	Consumer<String> consumerTwo = System.out::println;
	consumerTwo.accept("Mensaje");

	List<String> names = Arrays.asList("LuisDa", "Davide", "JesusDa", "Dee");
	names.forEach(consumerTwo);

	//Asignation names

	User user = new User();
	BiConsumer<User, String> assName = (person, name) -> {
	  person.setName(name);
	};
	assName.accept(user, "Luisda");
	System.out.println("My name is " + user.getName());
  }
}
