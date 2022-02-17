package ARREGLOS;

import java.util.Scanner;

public class EjemploArreglosBuscarString {

    public static void main(String[] args) {

        String[] arreglo = new String[4];
        Scanner s = new Scanner(System.in);

        for (int i=0; i < arreglo.length; i++){
            System.out.print("Ingrese un nombre: ");
            arreglo[i] = s.next();
        }
        System.out.print("\r\nIngrese un nombre a buscar: ");
        String nombre = s.next();

        //Buscar numero con WHILE
        int i =0;
        while (i < arreglo.length && !arreglo[i].equalsIgnoreCase(nombre)){
            i++;
        }
        if (i == arreglo.length){
            System.out.println("Texto no encontrado");
        }else if(arreglo[i].equalsIgnoreCase(nombre)){
            System.out.println("Encontrado en la posicion: " + i);
        }
    }
}
