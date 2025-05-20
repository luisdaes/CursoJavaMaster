package TAREAS;

import java.util.Scanner;

public class Tarea18 {

    public static void main(String[] args) {

        /*
        Tarea: imprimir X en una matriz
         */
        String matriz[][] = {
                {"0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0"}
        };

        int numMatriz = matriz.length;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int aux = i + 1;
                if (i == j || j == (numMatriz - aux)){
                    matriz[i][j] = "x";
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
