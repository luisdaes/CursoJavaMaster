package org.paquete.app.jardin;

import org.paquete.app.hogar.*; //usamos todas las clases de el paquete

import static org.paquete.app.hogar.ColorPelo.*; //usamos todas las constantes de enum de ColorPelo
import static org.paquete.app.hogar.Persona.saludar;
import static org.paquete.app.hogar.Persona.*; //usamos todas variables y metodos estaticos de la clase persona

public class EjemploPaquete {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("LuisDa");
        persona.setApellido("Escorcia");
        persona.setColorPelo(NEGRO);
        System.out.println(persona.getNombre());

        Perro perro = new Perro();
        perro.nombre = "Tobby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(persona);
        System.out.println("jugando = " + jugando);

        String saludo = saludar(); //evitamos usar persona.saludar();
        System.out.println("saludo = " + saludo);

        String generoMujer = GENERO_FEMENINO;
        System.out.println("generoMujer = " + generoMujer);

    }
}
