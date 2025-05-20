package TAREAS;

import java.util.Scanner;

public class EjercicioNombreFamilia {

    public static void main(String[] args) {

        //calse que recopila informacion por consola
        Scanner s = new Scanner(System.in);

        //pregunta por consola la cantidad de familiares que tiene
        System.out.println("Cuantos integrantes tiene su familia? ");

        //Cantidad almacenada en la variable cantFamila
        int cantFamilia = s.nextInt();

        //arreglo que almacena parentezco y nombres de familiares
        String[] nomFamilia = new String[cantFamilia];
        String[] parenFamilia = new String[cantFamilia];

        //recoge la informacion
        for (int i=0; i<cantFamilia; i++){
            System.out.println("Parentesco: ");
            parenFamilia[i] = s.next();
            System.out.println("Nombre de ".concat(parenFamilia[i]));
            nomFamilia[i] = s.next();
        }
        //muestra la informacion
        for(int i=0; i<cantFamilia; i++){
            System.out.println(parenFamilia[i]+": ".concat(nomFamilia[i]));
        }


    }
}
