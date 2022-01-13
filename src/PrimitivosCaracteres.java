public class PrimitivosCaracteres {

    public static void main(String[] args) {

        char caracter = '\u0040'; //codifo unidode - secuencia de escape : @
        char decimal = 64;  //codifo decimal @
        char simbolo = '@';

        System.out.println("caracter = " + caracter);
        System.out.println("caracter = " + caracter + " decimal = "+decimal + " simbolo =" + simbolo );

        System.out.println("char corresponde en byte a = " + Character.BYTES);
        System.out.println("char corresponde en bites a = " + Character.SIZE);
        System.out.println("valor maximo de char = " + Character.MAX_VALUE);
        System.out.println("valor minimo de char = " + Character.MIN_VALUE);

        //caracteres especiales
        //los caracteres especiales se pueden usar dentro de una cadeda de string

        char espacio = ' ';// vacio\u0020
        char retroceso = '\b'; // elimina el ultimo caracter
        char tabulador = '\t'; //tabular
        char nuevaLinea = '\n'; //salto de linea
        char retornoCarro = '\r'; //limpia la linea escrita antes

        System.out.println("caracter de" + espacio +"espacio");
        System.out.println("eliminara el ultimo caracter =" +  retroceso);
        System.out.println("texto de tabulador con el caracter" + tabulador+"especial");
        System.out.println("nueva linea" + nuevaLinea );
        System.out.println("retorno del carro = " + retornoCarro + "linea final");





    }
}
