package POO;

public class EjemploAutomovil {

    public static void main(String[] args) {

        //Subaru
        Automovil subaru = new Automovil("Subaru", "Impresa");
        subaru.setColor(Color.BLANCO);
        subaru.setCilindrada(2.0);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        //Mazda
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.GRIS);
        mazda.setCilindrada(3.0);
        mazda.setTipo(TipoAutomovil.PICKUP);

        //Nissan
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
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
        System.out.println(Automovil.VELOCIDAD_CIUDAD);

        //Obtengo  subaru
        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("Tipo subaru: " + tipoSubaru.getNombre());
        System.out.println("Tipo descripcion subaru: " + tipoSubaru.getDescripcion());
    }
}
