package ARREGLOS;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2 {

    public static void main(String[] args) {

        int[] arreglo = new int[10];
        int elemento, posicion;
        Scanner leer = new Scanner(System.in);

        for (int i=0; i < arreglo.length-1; i++){
            System.out.print("Ingrese un numero: ");
            arreglo[i] = leer.nextInt();
        }
        System.out.println("Nuevo numero");
        elemento = leer.nextInt();

        System.out.println("Posicion donde agregar en nuevo numero (0 - 9)");
        posicion = leer.nextInt();

        //Moviendo los valores de arreglo, con el nuevo valor en la posicion indicada
        for (int i = arreglo.length -2; i >= posicion; i--){
            arreglo[i+1] = arreglo[i];
        }

        arreglo[posicion] = elemento;

        for (int i = 0; i < arreglo.length; i++){
            System.out.println("Indice ["+i+"] = " + arreglo[i]);
        }
    }
}
