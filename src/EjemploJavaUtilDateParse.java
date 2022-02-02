import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {

    public static void main(String[] args) {

        Scanner s =  new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("ingrese una fecha: yyyy-MM-dd");

        try {
            Date fecha = formato.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("fecha formato = " + formato.format(fecha));

            Date fecha2 = new Date();
            if (fecha.after(fecha2)){
                System.out.println("fecha es despues de la fecha2");
            }else if(fecha.before(fecha2)){
                System.out.println("fecha es anterior de la feche2");
            }else if(fecha.equals(fecha2)){
                System.out.println("fecha es igual a fecha2");
            }

            if (fecha.compareTo(fecha2) > 0){
                System.out.println("fecha es despues de la fecha2");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("fecha es anterior de la feche2");
            }else if(fecha.compareTo(fecha2) == 0){
                System.out.println("fecha es igual a fecha2");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
