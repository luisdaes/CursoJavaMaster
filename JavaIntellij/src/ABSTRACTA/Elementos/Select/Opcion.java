package ABSTRACTA.Elementos.Select;

public class Opcion {

    private String valor;
    private String nombre;
    private boolean Selected;

    public Opcion() {
    }

    public Opcion(String valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSelected() {
        return Selected;
    }

    public Opcion setSelected(boolean selected) {
        Selected = selected;
        return this;
    }
}
