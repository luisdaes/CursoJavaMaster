package ARREGLOS;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion {

    public static void main(String[] args) {

        int[] arreglo = new int[10];
        int ultimo;
        Scanner leer = new Scanner(System.in);

        for (int i=0; i < arreglo.length; i++){
            System.out.print("Ingrese un numero: ");
            arreglo[i] = leer.nextInt();
        }
        //Moviendo posiciones del arreglo
        ultimo = arreglo[arreglo.length-1];
        for (int i = arreglo.length -2; i >= 0; i--){
            arreglo[i+1] = arreglo[i];
        }
        arreglo[0] = ultimo;
        for (int i = 0; i < arreglo.length; i++){
            System.out.println("indice ["+i+"] = " + arreglo[i]);
        }
    }
}
