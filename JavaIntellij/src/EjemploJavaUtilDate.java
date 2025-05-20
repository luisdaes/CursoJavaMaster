import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {

    public static void main(String[] args) {

        Date fecha = new Date();

        System.out.println("fecha: " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("EEEE dd MMMM, yyyy");//"'FECHA: 'yyyy.MM.dd G ', HORA: ' HH:mm:ss z");
        String fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);

        long j = 0;
        for (int i=0; i<1000000; i++){
            j +=i;
        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("tiempo transcurrido en el for = " + tiempoFinal);

    }
}
