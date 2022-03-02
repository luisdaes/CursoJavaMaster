package POO;

public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    double cilindrada;
    private int capacidadEstanque = 40;

    private static Color colorPatente = Color.NARANJO;
    private static int capacidadEstanqueEstatico = 30 ;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_VERDE = "Verde";
    public static final String COLOR_GRIS_OSCURO = "Gris Oscuro";
    public static final String COLOR_BLANCO = "Blanco";

    private TipoAutomovil tipo;

    //constructor 1
    public Automovil(){
        this.id = ++ultimoId;
    }
    //constructor 2
    public Automovil(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;

    }

    //constructor 3
    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    //constructor 4
    public Automovil(String fabricante, String modelo, Color color, double cilindrada, int capacidadEstanque) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
        this.capacidadEstanque = capacidadEstanque;
    }

    //insertados desde el IDE - generados automaticamente
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }

    public static int getCapacidadEstanqueEstatico() {
        return capacidadEstanqueEstatico;
    }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
        Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }
    //fin de getter and setter - generados automaticamente

    /*
    //Lectura de datos
    public String leerFabricante(){
        return fabricante;
    }
    public String leerModelo(){
        return modelo;
    }
    public String leerColor(){
        return color;
    }
    public Double leerCilindraje(){
        return cilindrada;
    }
    public int leerCapEstanque(){
        return capacidadEstanque;
    }
    //Asignacion de datos
    public void asignarFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    public void asignarModelo(String modelo){
        this.modelo = modelo;
    }
    public void asignarColor(String color){
        this.color = color;
    }
    public void asignarCilindrada(Double cilindrada){
        this.cilindrada = cilindrada;
    }
    public void asignarCapEstanque(int cap){
        this.capacidadEstanque = cap;
    }

     */

    //Metodos static para get y set
    public static Color getColorPatente(){
        return colorPatente;
    }
    public static void setColorPatente(Color colorPatente){
        Automovil.colorPatente = colorPatente;
    }

    public String verDetalle() {

        /*
        StringBuilder sb = new StringBuilder();
        // this hace referencia a los atributos
        sb.append("\nauto.fabricante = " + this.fabricante);
        sb.append("\nauto.modelo = " + this.modelo);
        sb.append("\nauto.color = " + this.color);
        sb.append("\nauto.cilindrada = " + this.cilindrada);
        return sb.toString();
         */
        return "auto.id = " + this.id +
                "\nauto.fabricante = " + this.getFabricante() +
                "\nauto.modelo = " + this.getModelo() +
                "\nauto.tipo = " + this.getTipo().getDescripcion() +
                "\nauto.color = " + this.color.getColor() +
                "\nauto.colorPatente = " + Automovil.colorPatente.getColor() +
                "\nauto.cilindrada = " + this.cilindrada;

    }

    public String acelerar(int rpm){
        return "el auto "  + this.fabricante + " acelerando a: " + rpm + " rpm";
    }

    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenando";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        return km / (capacidadEstanque * porcentajeBencina);
    }
    public float calcularConsumo(int km, int porcentajeBencina){
        return km / (capacidadEstanque * (porcentajeBencina / 100f));
    }
    public static float calcularConsumoEstatico(int km, int porcentajeBencina){
        return km / (Automovil.capacidadEstanqueEstatico * (porcentajeBencina / 100f));
    }


    @Override
    public boolean equals(Object obj) {

        if (this == obj){
            return true;
        }

        if (!(obj instanceof Automovil)){
            return false;
        }

        Automovil auto = (Automovil) obj;
        return (this.fabricante != null
                && this.modelo != null
                && this.fabricante.equals(auto.getFabricante())
                && this.modelo.equals(auto.getModelo()));
    }

    @Override
    public String toString() {
        return "Automivil{" +
                "id='" + id + '\'' +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadEstanque=" + capacidadEstanque +
                '}';
    }


}
