package org.uml.appfacturas.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {

    private int folio;
    private String descripcion;
    private Date fecha;

    //relacion de clases - tablas
    private Cliente cliente;
    private ItemFactura items[];
    private int indiceItems;

    //costantes
    public static final int MAX_ITEM = 12;
    public static int ultimoFolio;

    //constructores

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEM];
        this.folio = ++ultimoFolio;
        this.fecha = new Date();
    }


    //get and set

    public int getFolio() {
        return folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void addItemFactura(ItemFactura item){
        if(indiceItems < MAX_ITEM){
            this.items[indiceItems++] =  item;
        }
    }

    public float calcularTotal(){
        float total = 0.0f;
        for (ItemFactura item:  this.items) {
            if (item == null){
                continue;
            }
            total += item.calcularImporte();
        }
        return total;
    }

    public String generarDetalle(){
        StringBuilder sb = new StringBuilder("Factura N°: ");
        sb.append(folio)
                .append("\nClinte: ")
                .append(this.cliente.getNombre())
                .append("\t Nif: ")
                .append(cliente.getNif())
                .append("\nDescripcion: ")
                .append(this.descripcion)
                .append("\n");

        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMMM, yyyy");

        sb.append("Fecha Emicion: ")
                .append(df.format(this.fecha))
                .append("\n")
                .append("\n#\tNombre\t$\tCant.\tTotal\n");

        for (ItemFactura item: this.items) {
            if (item == null){
                continue;
            }
            sb.append(item.getProducto().getCodigo())
                    .append("\t")
                    .append(item.getProducto().getNombre())
                    .append("\t")
                    .append(item.getProducto().getPrecio())
                    .append("\t")
                    .append(item.getCantidad())
                    .append("\t")
                    .append(item.calcularImporte())
                    .append("\n");
        }

        sb.append("\nGran Total: ")
                .append(calcularTotal());

        return sb.toString();
    }
}
