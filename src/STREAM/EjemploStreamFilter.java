package STREAM;

import STREAM.MODELS.User;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilter {
    public static void main(String[] args) {

        Stream<User> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new User(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getName().equals("Pepe"))
                .peek(System.out::println);

        List<User> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);
        //nombres.forEach(System.out::println);

    }
}
