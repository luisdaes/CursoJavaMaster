public class WrapperInteger {

    public static void main(String[] args) {

        int intPrimitivo = 32768;
        Integer intObjeto = Integer.valueOf(intPrimitivo); //forma obsoleta -> new Integer(9);
        Integer intObjeto2 = 32768;

        System.out.println("intObjeto2 = " + intObjeto2);

        int num = intObjeto; //forma implicita
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);

        String valorTvLCD = "32768";
        Integer valor = Integer.valueOf(valorTvLCD);
        System.out.println("valor = " + valor);

        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);

        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

    }
}
