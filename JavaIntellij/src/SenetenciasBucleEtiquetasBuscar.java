public class SenetenciasBucleEtiquetasBuscar {

    public static void main(String[] args) {

        String frase = "trabalengutres de trigotrigo: tres tristes tigres tragan trigo en un trigaltrigo";

        //buscar la cantidad de veces que esta un carater en una frase
        int cantidad = 0;
        int max = frase.length();
        for (int i = 0; i < max; i++) {

            if (frase.charAt(i) != 't') {
                continue;
            }
            cantidad++;
        }

        System.out.println("E1: Encotrado= " + cantidad + " Veces \'t\' en la frase");

        //buscar la cantidad de veces que esta un palabra
        cantidad = 0;
        String palabra = "trigo";
        int maxFrase = frase.length();
        int maxPalabra = palabra.length();

        buscar:
        for (int i = 0; i < maxFrase; i++) {
            int k = i;
            for (int j=0; j<maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue buscar;
                }
            }
            cantidad++;
        }
        System.out.println("E2: Encotrado= " + cantidad + " Veces la \'"+palabra+"\' en la frase");

        //forma mas optimizada
         cantidad = 0;
         palabra = "trigo";
         maxPalabra = palabra.length();
         maxFrase = frase.length() - maxPalabra;

        buscar1:
        for (int i = 0; i <= maxFrase;) {
            int k = i;
            for (int j=0; j<maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue buscar1;
                }
            }
            cantidad++;
            i = i + maxPalabra;
        }

        System.out.println("E3: Encotrado= " + cantidad + " Veces la \'"+palabra+"\' en la frase");
    }
}
