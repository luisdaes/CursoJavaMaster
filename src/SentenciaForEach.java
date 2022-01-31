public class SentenciaForEach {
    public static void main(String[] args) {

        //FOR EACH es para arreglos
        int[] numeros = {1, 2, 5, 7, 9, 11, 13, 15};

        for(int num: numeros){
            System.out.println("num = " + num);
        }

        String[] nombres = {"david", "deivi", "michell", "analcy", "Enrique"};

        for (String nombre: nombres) {
            System.out.println("nombre = " + nombre);
        }

    }
}
