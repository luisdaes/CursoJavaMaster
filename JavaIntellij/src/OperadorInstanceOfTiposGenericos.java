public class OperadorInstanceOfTiposGenericos {

    public static void main(String[] args) {

        Object texto = "Crenado un objecto de la clase String...que tal!";
        //
        Number num = 7; // -> Integer.valueOf(7);

        Boolean b1 =  texto instanceof String;
        System.out.println("Texto es del tipo String: " +b1);

        b1 = texto instanceof Object;
        System.out.println("Texto es del tipo Object: " + b1);

        b1 = texto  instanceof Integer;
        System.out.println("texto es del tipo Integer: " + b1);

        b1 = num  instanceof Integer;
        System.out.println("num es del tipo Integer: " + b1);

        b1 = num instanceof Number;
        System.out.println("Num es del tipo Number: " + b1);

        b1 = num instanceof Object;
        System.out.println("Num es del tipo Object: " + b1);

        b1 = num instanceof Long;
        System.out.println("Num es del tipo Long = " + b1);

        Number decimal = 45.54;
        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number" + decimal);

    }
}
