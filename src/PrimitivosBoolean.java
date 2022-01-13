public class PrimitivosBoolean {

    public static void main(String[] args) {

        boolean datoLogico= false;
        System.out.println("datoLogico = " + datoLogico);

        double d = 98765.43e-3;
        float f = 12345e2f;

        System.out.println("d = " + d);
        System.out.println("f = " + f);

        datoLogico = d < f;
        System.out.println("datoLogico = " + datoLogico);
        
        boolean operacion = 3-2 == 1;

        System.out.println("operacion = " + operacion);

        
    }
}
