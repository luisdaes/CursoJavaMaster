public class EjemploStringConcatenacion {

    public static void main(String[] args) {

        String curso = "Programación Java";
        String estudiante = "Luis Escorcia";

        String detalle = "Estudiante: "+estudiante + " del curso de Udemy: "+curso;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 4;

        //tiene en cuenta la presedencia de los datos para concatenar
        System.out.println(detalle +" "+ (numeroA + numeroB));
        System.out.println(numeroA + numeroB + " " +detalle);

        String detalle2 = curso.concat(" de: ").concat(estudiante);
        System.out.println("detalle2 = " + detalle2);

    }
}
