package STREAM;

import STREAM.MODELS.User;

import java.util.stream.Stream;

public class EjemploStreamFlatMap {
    public static void main(String[] args) {

        Stream<User> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new User(nombre.split(" ")[0], nombre.split(" ")[1]))
                .flatMap(u -> {
                    if(u.getName().equalsIgnoreCase("Pepe")){
                        return Stream.of(u);
                    }
                    return Stream.empty();
                })
                .peek(System.out::println);

        // nombres.forEach(System.out::println);
        System.out.println(nombres.count());

    }
}
