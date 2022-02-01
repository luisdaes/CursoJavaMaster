package TAREAS;

public class Tarea7 {

    public static void main(String[] args) {

        int[] numEnteros = {100, 23, 11, 43, 56, 21, 67, 21, -65, 11};
        int cant = numEnteros.length;
        int menor = numEnteros[0];

        for (int i=0; i<cant; i++){

            if(numEnteros[i] < menor) {
                menor = numEnteros[i];
            }
        }
        System.out.println("Numero menor = " + menor);

    }
}
