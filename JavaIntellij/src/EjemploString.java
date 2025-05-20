public class EjemploString {

    public static void main(String[] args) {

        String curso = "Programación Java";
        String curso2 = new String("Programación Java");
        
        //toma en cuenta el objeto
        boolean esIgual = curso==curso2;
        System.out.println("curso==curso2 = " + esIgual);

        //toma en cuenta el valor del objeto
        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);
        
        //ignora las minusculas o mayusculas

        curso2 = "programacion java";
        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("curso.equalsIgnoreCase(curso2) = " + esIgual);

        String curso3 = "programacion java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + curso3);



    }

}
