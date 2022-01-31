import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.*;
import java.util.Locale;

public class SentenciaForArreglo {

    public static void main(String[] args) {

        String[] nombres = {"Luis", "david", "dee","miche"};

        int count = nombres.length;
        for (int i=0; i < count; i++){
            if(nombres[i].toLowerCase().contains("luis".toLowerCase()) ||
                    nombres[i].equals("miche")){ //equalsIgnoreCase
                continue;
            }
            System.out.println(i +": "+nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingreser un nombre, ejemplo \"pepe\"");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i=0; i<count; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null, buscar+": Enontrado");
        }else{
            JOptionPane.showMessageDialog(null, buscar+": No enontrado");
        }

    }
}
