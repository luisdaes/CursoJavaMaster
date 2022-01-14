public class EjemploStringExtensionArchico {

    public static void main(String[] args) {
     
        String archivo = "algun.archivo.pdf";
        int i = archivo.indexOf(".");
        int b = archivo.lastIndexOf(".");

        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo con indexOf = " + archivo.substring(i+1));
        System.out.println("archivo con lastIndexOf = " + archivo.substring(b+1));

        
    }
}
