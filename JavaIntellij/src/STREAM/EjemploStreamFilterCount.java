package STREAM;

import STREAM.MODELS.User;

import java.util.stream.Stream;

public class EjemploStreamFilterCount {
    public static void main(String[] args) {

        long count = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new User(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .count();

        System.out.println(count);
    }
}
