package ARREGLOS;

import java.util.Arrays;

public class EjemploArregosFor {

    public static void main(String[] args) {

        String[] productos = new String[7]; //valores por defecto null
        int total = productos.length;

        productos[0] = "Kingston pendrive 6GB";
        productos[1] = "Samsumg galaxy";
        productos[2] = "Disco duro SSD samsumg externo";
        productos[3] = "Asus notebook";
        productos[4] = "Macbook air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicicleta oxford";

        Arrays.sort(productos);

        System.out.println("=== Usando for ===");
        for (int i=0; i<total;i++ ){
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        System.out.println("=== Usando for each ===");
        for (String prod: productos) {
            System.out.println("prod = " + prod);
        }

        System.out.println("=== Usando while ===");
        int i =0;
        while (i < total){
            System.out.println("para indice = " + i + ": " + productos[i]);
            i++;
        }
        System.out.println("=== Usando do while ===");
        int j =0;
        do {
            System.out.println("para indice = " + j + ": " + productos[j]);
            j++;
        }while (j < total);

        /*
        *
        */

        int[] numeros = new int[10];
        int totalNum = numeros.length;;
        for (int k=0; k < totalNum; k++){
            numeros[k] = k*3;
        }

        for (int k=0; k < totalNum; k++){
            System.out.println("numero[" + k + "] =" +numeros[k]);
        }

    }
}
