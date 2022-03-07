package org.paquete.app.hogar;

import org.paquete.app.jardin.Perro;
import static org.paquete.app.hogar.Persona.*;

public class EjemploHogar {

    public static void main(String[] args) {

        Persona persona = new Persona();
        Perro perro = new Perro();


        String saludo = saludar();
        System.out.println("saludo = " + saludo);


    }
}
