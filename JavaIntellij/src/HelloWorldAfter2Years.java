public class HelloWorldAfter2Years {

    public static void main(String[] args) {

        String saludar = "Hola Mundo nuevamente despues de 2 años :(";
        System.out.println(saludar);

        System.out.println("Saludar: "+ saludar.toUpperCase());

        int numero = 10;
        System.out.println("numero = " + numero);

        boolean valor =  true;

        if (valor){
            System.out.println("valor = " + valor);
        }

        String nombre;

        nombre = "luis";

        if(numero >= 10){

            nombre = "David";
        }
        System.out.println("nombre = " + nombre);

        int edadPersona = 24;

        /*comentarios
            de
                bloques
                        completos*/

        var numeroPrueba = 5;
        var stringPrueba = "cadena";

        /*
         * TIPOS DE DATOS PRIMITIVOS
         * Enteros, flotantes, caracteres, boleanos
         * se declaran siempre en minuscula
         */

        boolean a= false;
        boolean b= true;

        /*
         * Secuencia de escape:
         * \b retroceso
         * \n nueva linea
         * \r retorno del carro
         * \t tabulador
         * \\ diagonal invertida
         * \" comillas dobles
         */

        char c= 'a';
        char d= '1';
        char e='\u0021';

        /*
         * byte 127
         * short 32767
         * int 2147483647
         * long 9223372036854775807*/

        byte entero1= 127;
        short entero2= 32767;
        int entero3= 2147483647;
        long entero4= 909999999;

        float realFloat = 3.1416f;
        double realDouble = 4.7029235e3;





    }

}


