import javax.swing.*;
import java.sql.SQLOutput;

public class SistemasNumericos {

    public static void main(String[] args) {

        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("numero binario de "+numeroDecimal+" = " + Integer.toBinaryString(numeroDecimal));

        //0b para que el compilador de java interprete el valor como binario
        int numeroBinario = 0b111110100; //500
        System.out.println("numeroBinario = " + numeroBinario);
        System.out.println("numero octal de "+numeroBinario+" = " + Integer.toOctalString(numeroBinario));

        //0 para que java compile el numero como octal y no como un entero
        int numeroOctal = 0764; //500
        System.out.println("numeroOctal = " + numeroOctal);
        System.out.println("numero octal de "+ numeroOctal+" = " +Integer.toHexString(numeroOctal) );

        //0x para definir como hexadecimal un int
        int numeroHexaDecimal = 0x1f4; //500
        System.out.println("numeroHexaDecimal = " + numeroHexaDecimal);

        //Ventana de Dialogo

        String strDec = JOptionPane.showInputDialog(null, "Ingrese un numero entero");

        // try - catch: Exception de errores
        try {
            numeroDecimal = Integer.parseInt(strDec);
        }catch (NumberFormatException e){

            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }
        numeroDecimal = Integer.parseInt(strDec);

        String mensaje = "numero decimal de "+numeroDecimal+" = " + Integer.toBinaryString(numeroDecimal);
        JOptionPane.showMessageDialog(null, mensaje);

    }
}
