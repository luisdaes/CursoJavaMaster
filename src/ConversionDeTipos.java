public class ConversionDeTipos {

    public static void main(String[] args) {

        //Conversion De tipos de datos

        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr =  "true"; //"1", "0"
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        //Conversion de tipo primitivo a cadena

        int otroNumeroInt =  180;
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        //otra metodo de numeros(primitivos) a string
        otroNumeroStr = String.valueOf(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroNumeroStr = String.valueOf(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        //conversion de datos primitivos a primitivos

        int i = 10000;
        short s = (short)i; //cast: forzar la conversion de tipo de datos
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);

        boolean b = true;
    }
}
