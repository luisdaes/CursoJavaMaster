import java.util.Random;

public class EjemploClaseMathRandom {

    public static void main(String[] args) {


        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};

        double random = Math.random();
        System.out.println("random = " + random);

        random *= colores.length;
        System.out.println("random = " + random);
        
        random = Math.floor(random);
        System.out.println("random = " + random);

        //hacemos un cast
        System.out.println("colores = " + colores[(int) random]);

        //clase RANDOM

        Random randomObj = new Random();
        int randomInt = 15 + randomObj.nextInt(25-15); //rango de 15 a 25, si quiero incluir el 25 lo sumo
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("Colores = " + colores[randomInt]);

    }
}
