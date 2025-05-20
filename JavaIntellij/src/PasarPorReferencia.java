public class PasarPorReferencia {

    public static void main(String[] args) {

        //Las clases son inmutables de tipo NUMBER
        int[] edad = {10,11, 12};

        System.out.println("iniciamos el metodo main con i = ");
        for (int i=0; i<edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Antes del llamar al metodo test");
        test(edad);
        System.out.println("Despues de llamar al metodo test");
        for (int i=0; i<edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("finaliza el metodo main con los datos del arreglo modificados!");

    }

    public static void test(int[] edadArr){

        System.out.println("iniciamos el metodo test");
        for (int i=0; i<edadArr.length; i++){
            edadArr[i] =  edadArr[i] + 20;
        }
        System.out.println("finaliza el metodo test");


    }
}
