public class WrapperBoolean {

    public static void main(String[] args) {

        //AutoBoxing
        Integer num1, num2;

        num1 = 1;
        num2 = 2;

        boolean priBoolean = num1 > num2;
        Boolean objBoolean = Boolean.valueOf(priBoolean);
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = false;

        System.out.println("priBoolean = " + priBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);

        //no se comporta igual en los enteros al comparar referencias
        System.out.println("comparando dos objetos boolena: " + (objBoolean == objBoolean2));
        System.out.println("comparando dos objetos boolena: " + (objBoolean.equals(objBoolean2)));
        System.out.println("comparando dos objetos boolena: " + (objBoolean.equals(objBoolean3)));

        //obtenemos el valor boolean como primitivo
        //AnBoxing
        boolean priBoolean2 = objBoolean2.booleanValue();


    }
}
