package POO.AUTOMOVIL_UML;

public class EjemploAutomovilEnum {

    public static void main(String[] args) {

        //Subaru
        Motor motorSubaru = new Motor(2, TipoMotor.BENCINA);
        Automovil subaru = new Automovil("Subaru", "Impresa");
        subaru.setMotor(motorSubaru);//(new Motor(2, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        //Mazda
        Motor motorMazda = new Motor(3, TipoMotor.DIESEL);
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.GRIS, motorMazda);
        mazda.setEstanque(new Estanque(45));
        mazda.setTipo(TipoAutomovil.PICKUP);

        //Nissan
        Motor motorNissan = new Motor(4, TipoMotor.DIESEL);
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, motorNissan,
                new Estanque(50));
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.DIESEL), new Estanque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);


        //metodo static de la clase Automovil (colorPatente)
        Automovil.setColorPatente(Color.VERDE);//Automivil.colorPatente = "Verde";

        System.out.println("=== Detalle Subura ===");
        System.out.println(subaru.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());

        System.out.println("=== Detalle mazda ===");
        System.out.println(mazda.verDetalle());
        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("=== Detalle Nissan ===");
        System.out.println(nissan.verDetalle());

        //comparamos con equals PRINCIPIO DE POLIMORFISMO
        System.out.println("=== equals ===");
        System.out.println("son iguales?: " + (nissan == nissan2));
        System.out.println("son iguales con equals?: " + (nissan.equals(nissan2)));
        //usando la sobreEscritura de toString
        System.out.println("=== toString ===");
        System.out.println(nissan.toString());

        //lectura de el metodo static de colorPatente
        System.out.println("Automovil.getColorPatente = " + Automovil.getColorPatente());

        //velocidad maxima en carretera, celocidad ciudad
        System.out.println(Automovil.VELOCIDAD_MAX_CARRETERA);
        //System.out.println(Automovil.VELOCIDAD_CIUDAD);

        //Obtengo  subaru
        TipoAutomovil tipo = mazda.getTipo();
        System.out.println("Tipo subaru: " + tipo.getNombre());
        System.out.println("Tipo descripcion subaru: " + tipo.getDescripcion());

        tipo = mazda.getTipo();

        switch (tipo){
            case CONVERTIBLE ->
                System.out.println("EL automovil es desportivo y descapotable de dos puertas");
            case COUPLE ->
                System.out.println("Es un automovil pequeño de dos puertas y tipocamente deportivo");
            case FURGON ->
                System.out.println("Es un automovil utilitario de transporte, de empresas");
            case HATCHBACK ->
                System.out.println("Es un automovil medio compactco, aspecto deportivo");
            case PICKUP ->
                System.out.println("Es un automovil de doble cabina y camioneta");
            case SEDAN ->
                System.out.println("Es un automovil mediano");
            case STATION_WAGON ->
                System.out.println("Es un automovil, mas grande con maleta grande");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for (TipoAutomovil ta: tipos) {
            System.out.print(ta + " => " + ta.name() + ", " +
                ta.getNombre() + ", " +
                ta.getDescripcion() + ", " +
                ta.getNumeroPuerta());
            System.out.println();
        }
    }
}