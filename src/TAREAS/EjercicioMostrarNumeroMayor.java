package TAREAS;

import java.util.Scanner;

public class EjercicioMostrarNumeroMayor {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese primer numero: ");
        int priNumero = s.nextInt();
        System.out.println("Ingrese segundo numero: ");
        int segNumero = s.nextInt();
        System.out.println("Ingrese tercer numero: ");
        int tercNumero = s.nextInt();

        int max = 0, seg = 0, min = 0;

        //operador ternario para hallar valor mayor
        max = (priNumero > segNumero) ? priNumero: segNumero;
        max = (max > tercNumero) ? max : tercNumero;

        //operador ternario para hallar valor menor
        min = priNumero < segNumero ? priNumero: segNumero;
        min = min < tercNumero ? min: tercNumero;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }

}
