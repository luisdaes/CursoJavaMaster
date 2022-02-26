package MATRICES;

public class EjemploMatricesSumarFilasColumnas {

    public static void main(String[] args) {

        int sumaFila, sumaColumna;
        int matriz[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matriz.length; i++) {
            sumaFila = 0;
            sumaColumna = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
            }
            System.out.println("Total fila " + i + ": " + sumaFila);
            System.out.println("Total Columna " + i + ": " + sumaColumna);
        }

    }
}
