public class SentenciaWhile {

    public static void main(String[] args) {

        int i=0;
        while(i<5){
            System.out.println("while como un for: i = " + i);
            i++;
        }

        boolean prueba = true;

        while (prueba){
            if(i == 7){
                prueba = false;
            }
            System.out.println("while: i = " + i);
            i++;
        }

        do{
            if (i == 10){
                prueba = false;
            }
            System.out.println("do while: i = " + i);
            i++;
        }while (prueba);
    }
}
