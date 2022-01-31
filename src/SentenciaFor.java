public class SentenciaFor {

    public static void main(String[] args) {


        for (int i=0; i<=10; i++){
            System.out.println("i = " + i);
        }

        for (int i=10; i>=0; i--) {
            System.out.println("i= " + i);
        }

        for (int i=1, j=10; i<j; i++,j--){
            System.out.println(i + " - " + j);

        }

        //otra manera de tranajar con el for
        /*
        int i = 0;
        for (; ; ){
            if (i > 5){
                break;
            }
            System.out.println("i = " + i);
        }
        */

    }
}
