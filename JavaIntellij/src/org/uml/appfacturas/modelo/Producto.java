package org.uml.appfacturas.modelo;

public class Producto {

    private int codigo;
    private String nombre;
    private float precio;

    //estaticas
    private static int ultimoCodigo;

    //constructor


    public Producto() {
        this.codigo = ++ultimoCodigo;
    }

    //get and set
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
