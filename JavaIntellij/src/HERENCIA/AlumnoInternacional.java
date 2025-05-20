package HERENCIA;

public class AlumnoInternacional extends Alumno{

    private String pais;
    private double notaIdiomas;

    public String getPais() {
        return pais;
    }

    public AlumnoInternacional(){
        super();
        System.out.println("Alumno Internacional: inicializando constructor de la clase");
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public String saludar(){
        String saludoPersona = super.saludar();
        return saludoPersona + ", soy extranjero del pais: " +getPais();
    }

    @Override
    public double promedioNotas(){
        System.out.println("Promedio de: " + AlumnoInternacional.class.getCanonicalName());
        return ((super.promedioNotas() * 3) + getNotaIdiomas()) / 4;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\npais='" + pais + '\'' +
                ", notaIdiomas=" + notaIdiomas +
                ", promedio = " + this.promedioNotas();
    }
}
