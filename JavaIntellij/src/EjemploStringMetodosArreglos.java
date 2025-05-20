public class EjemploStringMetodosArreglos {

    public static void main(String[] args) {
        
        String trabaLenguas = "trabalenguas";
        System.out.println("trabaLenguas.toCharArray() = " + trabaLenguas.toCharArray());

        char[] arreglo = trabaLenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);

        for (int i=0; i<largo; i++) {
            System.out.print(arreglo[i]);

        }
        System.out.println("\ntrabaLenguas = " + trabaLenguas.split("a"));

        String[] arreglo2 = trabaLenguas.split("a");
        int largo2 = arreglo2.length;
        for (int j=0; j<largo2; j++) {
            System.out.println(arreglo2[j]);
        }

        String archivo = "algun.archivo.pdf";
        String[] archivoArreglo = archivo.split("\\.");
        int largoArchivo = archivoArreglo.length;
        for (int k=0; k<largoArchivo; k++) {
            System.out.println(archivoArreglo[k]);
        }
        System.out.println("extension = "+ archivoArreglo[largoArchivo-1]);

    }
}
