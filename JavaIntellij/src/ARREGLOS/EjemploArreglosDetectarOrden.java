package ARREGLOS;

import java.util.Scanner;

public class EjemploArreglosDetectarOrden {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] enteros = new int[7];
        System.out.println("Ingrese 7 numeros: ");

        for (int i=0; i<enteros.length; i++) {
            enteros[i] = s.nextInt();
        }
        boolean ascendente = false;
        boolean descendente = false;
        for (int i=0; i < enteros.length-1; i++){
            if (enteros[i] > enteros[i+1]){
                descendente = true;
            }
            if (enteros[i] < enteros[i+1]){
                ascendente =  true;
            }
        }

        if (ascendente == true && descendente == true){
            System.out.println("Arreglo = desordenado");
        }
        if (ascendente == false && descendente == false){
            System.out.println("Arreglo = Iguales");
        }
        if (ascendente == false && descendente == true){
            System.out.println("Arreglo = Descendente");
        }
        if (ascendente == true && descendente == false){
            System.out.println("Arreglo = Ascendente");
        }
    }
}
