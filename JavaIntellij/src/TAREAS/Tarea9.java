package TAREAS;

import java.util.Scanner;

public class Tarea9 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int total = 0;

        System.out.println("ingrese numero 1:");
        int num1 = s.nextInt();

        System.out.println("ingrese numero 2:");
        int num2 = s.nextInt();

        for(int i=0; i<num1; i++){
            total += num2;
        }

        System.out.println(num1 + " por " + num2 + " = "+ total);


    }
}
