package ARREGLOS;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArregosForInversoMutable {

    public static void arregloInverso(String[] arreglo){
        int total = arreglo.length;
        int total2 = arreglo.length;
        for (int i=0; i < total2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }
    }
    public static void main(String[] args) {


        String[] productos = {"Kingston pendrive 6GB","Samsumg galaxy",
                "Disco duro SSD samsumg externo","Asus notebook",
                "Macbook air","Chromecast 4ta generacion","Bicicleta oxford"};

        int total = productos.length;

        Arrays.sort(productos);
        arregloInverso(productos);
        //Collections.reverse(Arrays.asList(productos));

        /*
        for (int i=0; i < total/2; i++){
            String actual = productos[i];
            String inverso = productos[total-1-i];
            productos[i] = inverso;
            productos[total-1-i] = actual;
        }*/

        System.out.println("=== Usando for 3 ===");
        for (int i=0; i < total;i++ ){
            System.out.println("para indice [" + i + "] : " + productos[i]);
        }

    }
}
