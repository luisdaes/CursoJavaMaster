package TAREAS;

import java.util.Scanner;

public class Tarea14 {

    public static void main(String[] args) {
        /*
        Tarea: Imprima el numero mas alto del arreglo
         */
        int[] arreglo = new int[5];
        int max = 0;
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < arreglo.length; i++){
            System.out.print("Ingrese un numero: ");
            arreglo[i] = leer.nextInt();
        }
        //recoremos el arreglo y comparamos cada iteracion con el max
        for (int i = 0; i < arreglo.length; i++){
            max = arreglo[i];
            max = max > arreglo[i] ? max: arreglo[i];
        }

        System.out.println("El numero mayor del arreglo es: " + max);
    }
}
