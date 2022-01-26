import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {

        //variable = condicion ? si es verdadero : si es falso;
        String variable = 7 == 5 ? "Si es verdadero": "si es Falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 6.2;

        estado = promedio >= 5.9 ? "Aprobado" : "Rechazado";
        System.out.println("Estado: "+estado);

        //es igual a un IF
        /*if(promedio >= 5.9){
            estado = "";
        }else {
            estado = "";
        }*/

        Scanner s = new Scanner(System.in);

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        System.out.println("Ingrese la nota de matematicas: entre 2.0 -  7.0");
        matematicas = s.nextDouble();
        System.out.println("Ingrese la nota de ciencias: entre 2.0 -  7.0");
        ciencias = s.nextDouble();
        System.out.println("Ingrese la nota de historia: entre 2.0 -  7.0");
        historia = s.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;

        estado = promedio >= 5.9 ? "Aprobado" : "Rechazado";
        System.out.println("promedio = " + promedio);
        System.out.println("estado = " + estado);
        
    }
}
