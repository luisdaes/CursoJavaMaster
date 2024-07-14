package STREAM;


import java.util.stream.Stream;

import STREAM.MODELS.User;

public class EjemploStreamDistinctUsuario {
    public static void main(String[] args) {

        Stream<User> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia", "Pato Guzman", "Pato Guzman")
                .map(nombre -> new User(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct();

        nombres.forEach(System.out::println);
    }
}
