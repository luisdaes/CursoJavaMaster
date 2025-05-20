package ARREGLOS;

import java.util.Scanner;

public class EjemploArregloNotasAlumnos {

    public static void main(String[] args) {

        double[] claseMatematicas, claseLenguaje, claseHistoria;
        double sumaMatematicas =0, sumaHistoria =0, sumaLenguaje =0;
        claseMatematicas =  new double[7];
        claseLenguaje = new double[7];
        claseHistoria = new double[7];

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese las notas de matematicas");
        for (int i=0; i < claseMatematicas.length; i++){
            System.out.print("nota ["+i+"]: ");
            claseMatematicas[i] = s.nextDouble();
        }
        System.out.println("Ingrese las notas de historia");
        for (int i=0; i < claseHistoria.length; i++){
            System.out.print("nota ["+i+"]: ");
            claseHistoria[i] = s.nextDouble();
        }
        System.out.println("Ingrese las notas de lenguaje");
        for (int i=0; i < claseLenguaje.length; i++){
            System.out.print("nota ["+i+"]:");
            claseLenguaje[i] = s.nextDouble();
        }

        for (int i=0; i<7; i++){
            sumaMatematicas += claseMatematicas[i];
            sumaHistoria += claseHistoria[i];
            sumaLenguaje += claseLenguaje[i];
        }
        double promedioMateticas,promedioHistoria, promedioLenguaje, promedioTotal;
        promedioMateticas = sumaMatematicas / claseMatematicas.length;
        promedioHistoria = sumaHistoria / claseHistoria.length;
        promedioLenguaje = sumaLenguaje / claseLenguaje.length;
        promedioTotal = (sumaMatematicas + sumaHistoria + sumaLenguaje) / 3;

        System.out.println("pomedio matematicas: " + promedioMateticas);
        System.out.println("promedio historia: " +promedioHistoria);
        System.out.println("promedio lenguaje: " + promedioLenguaje);
        System.out.println("promedio total: " +promedioTotal);

        System.out.println("ingrese indentificador del alumno (0 - 6)");
        int id = s.nextInt();
        double promedioAlumno = (claseMatematicas[id]+claseHistoria[id]+claseLenguaje[id]) / 3;
        System.out.println("Promedio del alumno Nro["+id+"] = "+promedioAlumno);

    }
}