package STREAM;

import STREAM.MODELS.User;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {
    public static void main(String[] args) {

        Stream<User> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new User(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getName().equals("Pepe"))
                .peek(System.out::println);

        Optional<User> usuario = nombres.findFirst();
        // System.out.println(usuario.orElse(new Usuario("John", "Doe")).getNombre());
        // System.out.println(usuario.orElseGet(() -> new Usuario("John", "Doe")).getNombre());
        if(usuario.isPresent()) {
            System.out.println(usuario.get().getName());
        } else {
            System.out.println("No se encontró el objeto!");
        }
        //nombres.forEach(System.out::println);

    }
}
