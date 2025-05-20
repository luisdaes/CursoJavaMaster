package ARREGLOS;

import java.util.Scanner;

public class EjemploArreglosBuscarNumero {

    public static void main(String[] args) {

        int[] arreglo = new int[10];
        Scanner s = new Scanner(System.in);

        for (int i=0; i < arreglo.length; i++){
            System.out.print("Ingrese un numero: ");
            arreglo[i] = s.nextInt();
        }
        System.out.print("\r\nIngrese un numero a buscar: ");
        int num = s.nextInt();

        //Buscar numero con WHILE
        int i =0;
        while (i < arreglo.length && arreglo[i] != num){
            i++;
        }
        if (i == arreglo.length){
            System.out.println("Numero no encontrado");
        }else if(arreglo[i] == num){
            System.out.println("Encontrado en la posicion: " + i);
        }
    }
}
