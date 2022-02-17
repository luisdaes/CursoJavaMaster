package ARREGLOS;

import java.util.Scanner;

public class EjemploArreglosParesImpares {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] a, pares, impares;
        a = new int[10];
        int totalPares = 0, totalImpares = 0;

        System.out.println("Ingrese 10 numeros");
        for (int i=0; i < a.length; i++){
            System.out.print("Ingrese el numero["+i+"] :");
            a[i] = s.nextInt();
        }

        for (int i=0; i < a.length; i++){
            if (a[i]%2 == 0){
                totalPares++;
            }else {
                totalImpares++;
            }
        }
        pares = new int[totalPares];
        impares = new int[totalImpares];
        int j = 0, k = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i]%2 == 0){
                pares[j++] = a[i];
            }else {
                impares[k++] = a[i];
            }
        }

        System.out.println("===  PARES  ===");
        for (int i=0; i < totalPares; i++){
            //System.out.print("Indice ["+i+"] : "+pares[i] + " ");
            System.out.print(pares[i] + " ");
        }
        System.out.println("\n=== IMPARES ===");
        for (int i=0; i < totalImpares; i++){
            //System.out.print("indice ["+i+"] : "+impares[i] + " ");
            System.out.print(impares[i] + " ");
        }

    }
}