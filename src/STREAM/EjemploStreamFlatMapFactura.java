package STREAM;

import STREAM.MODELS.Facture;
import STREAM.MODELS.User;
import STREAM.MODELS.Facture;

import java.util.Arrays;
import java.util.List;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {

        User u1 = new User("John", "Doe");
        User u2 = new User("Pepe", "Pérez");

        u1.addFacture(new Facture("compras tecnologías"));
        u1.addFacture(new Facture("compras muebles"));

        u2.addFacture(new Facture("bicicleta"));
        u2.addFacture(new Facture("notebook gamer"));

        /*List<User> usuarios = Arrays.asList(u1, u2);
        usuarios.stream()
                .flatMap(u -> u.getFacturas().stream())
                .forEach(f -> System.out.println(f.getDescripcion().concat(" : cliente ")
                .concat(f.get().toString())));*/

        /*for(Usuario u: usuarios){
            for(Factura f: u.getFacturas()){
                System.out.println(f.getDescripcion());
            }
        }*/
    }
}
