package ARREGLOS;

public class EjemploArregloForOrdenamientoBurbuja {

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


    public static void sortBurbuja(Object[] arreglo){
        //metodo BURBUJA 2

        int contIterativo = 0;
        for (int i=0; i < arreglo.length; i++){
            for (int j=0; j < arreglo.length-1-i; j++){
                if (((Comparable) arreglo[j+1]).compareTo(arreglo[j]) < 0){ //cast de int(primitivo) a Integer(referencia)
                    Object aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
                contIterativo++;
            }
        }
        System.out.println("contIterativo = " + contIterativo);
    }

    public static void main(String[] args) {

        String[] productos = {"Kingston pendrive 6GB","Samsumg galaxy",
                "Disco duro SSD samsumg externo","Asus notebook",
                "Macbook air","Chromecast 4ta generacion","Bicicleta oxford"};

        Integer[] numeros = new Integer[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf(7);
        numeros[2] = 35;
        numeros[3] = -1;

        int total = productos.length;
        int contIterativo = 0;

        //metodo BURBUJA 1
        /*
        for (int i=0; i < total; i++){
            for (int j=0; j < total; j++){
                if (productos[i].compareTo(productos[j]) < 0){
                    String aux = productos[i];
                    productos[i] = productos[j];
                    productos[i] = aux;
                }
                contIterativo++;
            }
        }
         */

        sortBurbuja(numeros);

        System.out.println("=== Usando for 3 ===");
        for (int i=0; i < numeros.length;i++ ){
            System.out.println("para indice [" + i + "] : " + numeros[i]);
        }

    }
}
