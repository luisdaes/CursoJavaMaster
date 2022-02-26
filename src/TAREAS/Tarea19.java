package TAREAS;

import java.util.Scanner;

public class Tarea19 {

    public static void main(String[] args) {

        /*
        Tarea: Imprimir silla ( h ) en un arreglo
         */

        int matriz[][] =  new int[5][5];
        int mitadMatriz = matriz.length/2;

        //h en matriz
        System.out.println("=== h MATRIZ ===");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == mitadMatriz || j == 0 || (j == matriz.length-1 && i >= mitadMatriz)){
                    matriz[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                //System.out.print(matriz[i][j] + " = " + "(" + i + "," + j +")"  + "\t");
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("La mitad de la fila: " + mitadMatriz);

        /*
        //cruz
        System.out.println("=== CRUZ MATRIZ ===");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == mitadMatriz || j == mitadMatriz){
                    matriz[i][j] = 1;
                }
                //System.out.print(matriz[i][j] + " = " + "(" + i + "," + j +")"  + "\t");
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

         */

    }
}
