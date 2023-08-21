package HERENCIA;

import java.awt.*;
import java.awt.event.WindowStateListener;

public class Alumno extends Persona{

    private String institucion;
    private double notaCastellano;
    private double notaMatematica;
    private double notaHistoria;

    public Alumno(){
        System.out.println("Alumno: inicializando constructor de la clase");
    }

    public Alumno(String nombre, String apellido){
        super(nombre, apellido); //se puede asignar al constructor padre
    }

    public Alumno(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String institucion){
        this(nombre, apellido, edad); //Tambien se podria manejar el super
        this.institucion = institucion;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    public String saludar(){
        String saludoPersona = super.saludar();
        return saludoPersona + " Soy un alumno, mi nombre es: " + getNombre();
    }

    public double promedioNotas(){
        System.out.println("Promedio de: " + Alumno.class.getCanonicalName());
        return (notaCastellano + notaHistoria + notaMatematica) / 3;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ninstitucion='" + institucion + '\'' +
                ", notaCastellano=" + notaCastellano +
                ", notaMatematica=" + notaMatematica +
                ", notaHistoria=" + notaHistoria +
                ", nombre='" + nombre + '\'' +
                ", promedio = " + this.promedioNotas();
    }
}
