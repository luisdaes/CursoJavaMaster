package MATRICES;

public class EjemploMatricesStringFor {

    public static void main(String[] args) {

        String nombres[][] = new String[3][2];
        nombres[0][0] = "Pepe";
        nombres[0][1] = "Pepa";
        nombres[1][0] = "Jose";
        nombres[1][1] = "Josefa";
        nombres[2][0] = "Luis";
        nombres[2][1] = "Luisa";

        System.out.println("===  Iterando con for ===");
        for (int i = 0; i < nombres.length; i++){

            for (int j = 0; j < nombres[i].length; j++){
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("=== Iterando con foreach ===");
        for (String[] fila: nombres){
            for (String nombre: fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }

    }
}
