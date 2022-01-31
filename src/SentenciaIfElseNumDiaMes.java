import java.util.Scanner;

public class SentenciaIfElseNumDiaMes {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int numeroDias = 0;
        System.out.println("Ingrese mes: ");
        int mes = s.nextInt();//2;
        System.out.println("Ingrese año: ");
        int anio = s.nextInt();//2024;

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            numeroDias = 31;
        }else if(mes == 4 || mes == 6 || mes == 9 || mes ==11){
            numeroDias = 30;
        }else if(mes == 2){
            if((anio % 400 == 0) || (anio % 4 == 0) && !(anio % 100 == 0)){
                numeroDias = 29;
            }else {
                numeroDias = 28;
            }
        }

        System.out.println("dias del mes: " + numeroDias);

    }

}
