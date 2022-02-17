package ARREGLOS;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion3b {

    public static void main(String[] args) {

        int[] arreglo = new int[5];
        int numero, posicion, ultimo;
        Scanner leer = new Scanner(System.in);

        //la ultima posicion del arreglo queda en 0
        for (int i = 0; i < arreglo.length; i++){
            System.out.print("Ingrese un numero: ");
            arreglo[i] = leer.nextInt();
        }

        System.out.println("Ingrese un numero a insertar: ");
        numero = leer.nextInt();
        ultimo = arreglo[arreglo.length-1];

        posicion = 0; //0:2,1:4,2:6,3:8,4:0 --> 5
        while (posicion < arreglo.length-1 && numero > arreglo[posicion]){
            posicion++;
        }

        for (int i= arreglo.length-2; i >= posicion; i--){
            arreglo[i+1] = arreglo[i];
        }
        int[] nuevoArreglo = new int[arreglo.length+1];
        //arreglo, indice donde inicia, nuevoArreglo, indice donde inicia, tamaño del arreglo a copiar
        System.arraycopy(arreglo, 0, nuevoArreglo, 0, arreglo.length);

        if (numero > ultimo){
            nuevoArreglo[nuevoArreglo.length-1] = numero;
        }else {
            nuevoArreglo[nuevoArreglo.length - 1] = ultimo;
            nuevoArreglo[posicion] = numero;
        }

        System.out.println("El arreglo ordenado con el nuevo numero");
        for (int i = 0; i < nuevoArreglo.length; i++){
            System.out.println("indice ["+i+"] = " + nuevoArreglo[i]);
        }
    }
}
