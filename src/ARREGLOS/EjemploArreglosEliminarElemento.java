package ARREGLOS;

import java.util.Scanner;

public class EjemploArreglosEliminarElemento {

    public static void main(String[] args) {

        int[] arreglo = new int[5];
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < arreglo.length; i++){
            System.out.print("Ingrese un numero: ");
            arreglo[i] = leer.nextInt();
        }
        System.out.println("Ingrese una posicion a eliminar entre (0 - 9)");
        int posicion = leer.nextInt();

        for (int i = posicion; i < arreglo.length-1; i++){
            arreglo[i] = arreglo[i+1];
        }

        System.out.println("=== ARREGLO ===");
        for (int i = 0; i < arreglo.length; i++){
            System.out.println("Indice ["+ i +"] = " + arreglo[i]);
        }

        //creamos un nuevo arreglo y copiamos el arreglo anterior con un elemento menos
        int[] nuevoArreglo = new int[arreglo.length-1];
        System.arraycopy(arreglo, 0, nuevoArreglo, 0, nuevoArreglo.length); //copia el arreglo
        System.out.println("=== NUEVO ARREGLO ===");
        for (int i = 0; i < nuevoArreglo.length; i++){
            System.out.println("Indice ["+i+"] = " +nuevoArreglo[i]);
        }

    }
}
