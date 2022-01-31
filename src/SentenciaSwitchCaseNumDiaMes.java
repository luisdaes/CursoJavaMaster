import java.util.Scanner;

public class SentenciaSwitchCaseNumDiaMes {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int numeroDias = 0;

        System.out.println("Ingrese numero del mes");
        int mes = s.nextInt();
        System.out.println("Ingrese numero del año");
        int anio = s.nextInt();

        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias = 30;
                break;
            case 2:
                if((anio % 400 == 0) || (anio % 4 == 0) && !(anio % 100 == 0)){
                    numeroDias = 29;
                }else {
                    numeroDias = 28;
                }
                break;
            default:
                numeroDias = 0;


        }

        System.out.println("dias del mes: " + numeroDias);

    }

}
