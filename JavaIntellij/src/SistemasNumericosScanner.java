import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        //String numString = scanner.nextLine();

        int numeroDecimal = 0;
        try {
            numeroDecimal = scanner.nextInt();//Integer.parseInt(numString);

        //Exception tratar todos los errores
        }catch (InputMismatchException e){
            System.out.println("Error: Debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        String mensaje = "numero decimal de "+numeroDecimal+" = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensaje);

    }
}
