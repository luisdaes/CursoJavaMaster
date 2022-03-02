package POO.AUTOMOVIL_UML;

public enum Color {

    ROJO("Rojo"),
    AMARILLO("Amarrillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris Oscuro"),
    NARANJO("Naranjo"),
    VERDE("Verde");

    private final String color;

    //Constructor de la clase
    Color(String color) {
        this.color = color;
    }

    //metodo get
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
