package TAREAS;

import java.util.Scanner;

public class Tarea16 {

    public static void main(String[] args) {

        /*
        Tarea: Mayor ocurrencia en el arreglo, obtener el numero con mayor ocurrencia
         */

        int[] numeros = new int[5];
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Ingrese un numero: ");
            numeros[i] = leer.nextInt();
        }

        int contador = 0;
        int ocurencia = 0;
        int numRepeticiones = 0;
        for (int indice = 0; indice < numeros.length; indice++){
            int aux = 0;

            for(int j=0; j < numeros.length; j++) {
                contador++;
                if(numeros[indice]==numeros[j]) {
                    aux++;
                }
                if( aux > numRepeticiones) {
                    ocurencia = numeros[indice];
                    numRepeticiones = aux;
                }
            }
        }

        System.out.println("Numero de iteraciones: " + contador);
        System.out.println("Ocurrencia: " + ocurencia + ", Numero de Repeticiones: "+numRepeticiones);
    }
}
