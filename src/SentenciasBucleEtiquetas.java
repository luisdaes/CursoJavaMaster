public class SentenciasBucleEtiquetas {

    public static void main(String[] args) {


        bucle:

        for (int i =0; i<5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                //se salta la iteracion numero 2
                if (i == 2) {
                    System.out.print("aqui va la iteracion "+ i);
                    continue bucle;
                }
                System.out.print("[i= " + i + " j= "+ j+ "], ");
            }
        }

        System.out.println("\n=================================================");

        bucle1:
        for (int i=1; i<=7; i++){
            int j = 1;
            while (j <=8 ){
                if (i==6|| i==7){
                    System.out.println("Dia " + i + ": Descanso de fin de semana!");
                    continue bucle1;
                }
                System.out.println("Dia " + i + ": trabajando a las "+ j + "Hrs.");
                j++;
            }

        }
    }
}
