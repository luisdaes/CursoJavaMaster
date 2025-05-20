class Persona{
    private String nombre;

    public void modifcarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }

}

public class PasarPorReferencia2 {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modifcarNombre("Andres");

        System.out.println("iniciamos el metodo main con i = ");

        System.out.println("Persona.leerNombre = " + persona.leerNombre());
        test(persona);
        System.out.println("Despues de llamar al metodo test");
        System.out.println("Persona.leerNombre = " + persona.leerNombre());
        System.out.println("finaliza el metodo main con los datos del arreglo modificados!");

    }

    public static void test(Persona persona){

        System.out.println("iniciamos el metodo test");
        persona.modifcarNombre("pepe");
        System.out.println("finaliza el metodo test");


    }
}
