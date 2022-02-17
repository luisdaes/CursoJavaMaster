package ARREGLOS;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2b {

    public static void main(String[] args) {

        int[] arreglo = new int[5];
        int elemento, posicion, ultimo;
        Scanner leer = new Scanner(System.in);

        for (int i=0; i < arreglo.length; i++){
            System.out.print("Ingrese un numero: ");
            arreglo[i] = leer.nextInt();
        }
        System.out.println("Nuevo numero");
        elemento = leer.nextInt();

        System.out.println("Posicion donde agregar en nuevo numero (0 - 9)");
        posicion = leer.nextInt();

        ultimo = arreglo[arreglo.length-1];

        //Moviendo los valores de arreglo, con el nuevo valor en la posicion indicada
        for (int i = arreglo.length -2; i >= posicion; i--){
            arreglo[i+1] = arreglo[i];
        }

        int[] nuevoArreglo = new int[arreglo.length+1];
        System.arraycopy(arreglo, 0, nuevoArreglo, 0, arreglo.length);
        nuevoArreglo[posicion] = elemento;
        nuevoArreglo[nuevoArreglo.length-1] = ultimo;

        for (int i = 0; i < nuevoArreglo.length; i++){
            System.out.println("Indice ["+i+"] = " + nuevoArreglo[i]);
        }
    }
}
