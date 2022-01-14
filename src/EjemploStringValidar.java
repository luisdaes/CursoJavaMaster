public class EjemploStringValidar {

    public static void main(String[] args) {

        //no se puede concatenar un string null
        String curso = null;

        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        if(!esNulo == false){
            //System.out.println(curso.toUpperCase());
            curso = "";//""Programación Java";
            System.out.println("Bienvenido al curso "+curso);
        }

        //validar si la instacia del string es vacia
        boolean esVacio = curso.length() == 0;

        if (!esVacio){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso "+curso);

        }

        //empty
        boolean esVacio2 = curso.isEmpty();

        if (!esVacio2){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso "+curso);
        }

        //isBlanck

        boolean enBlanco = curso.isBlank();
        if (!enBlanco){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso "+curso);
        }


        //concat solo se usa cuando la instacia no es nula
        //System.out.println(curso.concat(" desde cero!"));



    }
}
