public class WrapperOperadoresRelacionales {

    public static void main(String[] args) {

        /*las variables primitivas comparan su valor
          mietras que las variables de referencia comparan el objeto

          java hasta '127' compara (AutoBoxing) por valor
         */

        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? "+ (num1 == num2));

        num2 = 1000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? "+ (num1 == num2));

        //con el metodo EQUALS se comparan cualquier valor
        System.out.println("tienen eñl mismo valor? "+ (num1.equals(num2)));
        System.out.println("tienen eñl mismo valor? "+ (num1.intValue() == num2.intValue()));

        // cuando comparamos condiciones -> AutoAnboxing
        boolean condicion = num1 > num2;
        System.out.println("condicion = " + condicion);

    }
}
