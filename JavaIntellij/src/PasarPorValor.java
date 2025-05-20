public class PasarPorValor {

    public static void main(String[] args) {

        //Las clases son inmutables de tipo NUMBER
        Integer i = 10;

        System.out.println("iniciamos el metodo main con i = " + i);
        test(i);
        System.out.println("finaliza el metodo main con el valor de i: " + i);

    }

    public static void test(Integer i){

        System.out.println("iniciamos el metodo test con i: " + i);
        i = 35;
        System.out.println("finaliza el metodo test de i: " + i);


    }
}
