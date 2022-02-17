package ARREGLOS;

import java.util.Scanner;

public class EjemploArreglosNumMayor {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] a = new int[5];

        System.out.println("ingrese 5 enteros: ");
        for (int i=0; i < a.length; i++){
            System.out.print("Ingrese numero["+ i +"]: ");
            a[i] = s.nextInt();
        }

        int max = 0;
        for (int i=0; i < a.length; i++){
            max = (a[max] > a[i])? max : i;
        }
        System.out.println("max = " + a[max]);
    }
}
