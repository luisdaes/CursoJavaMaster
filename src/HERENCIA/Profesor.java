package HERENCIA;

import com.sun.source.tree.ReturnTree;

public class Profesor extends Persona{

    private String asignatura;

    public String getAsignatura() {
        return asignatura;
    }

    public Profesor(){
        System.out.println("Profesor: inicializando constructor de la clase");
    }

    public Profesor(String nombre, String apellido, String asignatura){
        super(nombre, apellido);
        this.asignatura = asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar(){
        String saludoPersona = super.saludar();
        return saludoPersona + "Soy el profesor de la asignatura: " + getAsignatura() + ", Mi nombre es: " + getNombre();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nasignatura='" + asignatura + '\'' +
                ", nombre='" + nombre + '\'';
    }
}
