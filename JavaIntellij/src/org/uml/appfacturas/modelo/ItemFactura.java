package org.uml.appfacturas.modelo;

public class ItemFactura {

    private int cantidad;
    private Producto producto;

    //constructor
    public ItemFactura(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    //get and set
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public float calcularImporte(){
        return this.cantidad * this.producto.getPrecio();
    }
}
