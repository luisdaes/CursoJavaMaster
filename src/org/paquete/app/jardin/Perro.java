package org.paquete.app.jardin;

import org.paquete.app.hogar.Persona;

public class Perro {

    protected String nombre;
    protected String raza;

    String jugar(Persona persona){
        return persona.lanzarPelota();
    }
}
