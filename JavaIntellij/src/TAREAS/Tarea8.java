package TAREAS;

import java.util.Scanner;

public class Tarea8 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String[] nomEstudiantes = new String[2];
        String[] nomAsignaturas = {"castellano", "matematicas", "ingles"};
        double[] calAsignaturas = new double[3];
        double[] proEstudiantes = new double[2];

        //bucle para recopilar nombres de los estudiantes
        for(int i=0; i<nomEstudiantes.length; i++){
            double numero = 0;
            System.out.println("Nombre del estudiante: ");
            nomEstudiantes[i] = s.next();

            //bucle para recopilar calificaciones en las asignaturas
            for(int j=0; j< nomAsignaturas.length; j++){
                System.out.println("nota de " + nomAsignaturas[j] +":");
                numero += calAsignaturas[j] = s.nextDouble();
            }
            proEstudiantes[i] = numero/3;
            System.out.println("promedio de: " + nomEstudiantes[i]+ " calculado");
        }

        for (int i=0; i<nomEstudiantes.length; i++){
            System.out.println("EL promedio de: " + nomEstudiantes[i] + " = " + proEstudiantes[i]);
        }
    }
}
