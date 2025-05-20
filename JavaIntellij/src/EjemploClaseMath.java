public class EjemploClaseMath {

    public static void main(String[] args) {
        
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);
        
        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        //redondea un numero asi arriba
        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);
        //redondea asi abajo
        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);
        
        //redondea a un numero entero
        long entero = Math.round(Math.PI);
        System.out.println("entero = " + entero);

        //trigonometria
        double exp = Math.exp(2);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("Log = " + log);

        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);

        double raizCuadrada = Math.sqrt(5);
        System.out.println("raizCuadrada = " + raizCuadrada);

        double grados = Math.toDegrees(1.57);
        System.out.println("Convertir de radianes a grados grados = " + grados);

        double radianes = Math.toRadians(90.00);
        System.out.println("Convertir de grados a radianes = " + radianes);

        //seno
        System.out.println("sin(90)" + Math.sin(radianes));
        //coseno
        System.out.println("coseno(90) " + Math.cos(radianes));

        radianes = Math.toRadians(180);
        System.out.println("cos(180): " + Math.cos(radianes));

        
    }
}
