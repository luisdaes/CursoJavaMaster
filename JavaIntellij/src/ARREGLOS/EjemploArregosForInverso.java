package ARREGLOS;

import java.util.Arrays;

public class EjemploArregosForInverso {

    public static void main(String[] args) {

        //String[] productos = new String[7]; //valores por defecto null
        String[] productos = {"Kingston pendrive 6GB","Samsumg galaxy",
                "Disco duro SSD samsumg externo","Asus notebook",
                "Macbook air","Chromecast 4ta generacion","Bicicleta oxford"};
        int total = productos.length;

        /*
        productos[0] = "Kingston pendrive 6GB";
        productos[1] = "Samsumg galaxy";
        productos[2] = "Disco duro SSD samsumg externo";
        productos[3] = "Asus notebook";
        productos[4] = "Macbook air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicicleta oxford";
         */

        Arrays.sort(productos);

        System.out.println("=== Usando for ===");
        for (int i=0; i < total;i++ ){
            System.out.println("para indice " + i + " : " + productos[i]);
        }
        System.out.println("=== Usando for inverso ===");
        for (int i=0; i < total;i++ ){
            System.out.println("para i [" + (total-1-i) + "] : " + productos[total-1-i]);
        }

        System.out.println("=== Usando for inverso 2 ===");
        for (int i=total-1; i >= 0;i--){
            System.out.println("para indice [" + i + "] : " + productos[i]);
        }

    }
}
