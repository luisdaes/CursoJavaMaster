package POO.AUTOMOVIL_UML;

public class EjemploAutomovilRelacionesObjetos {

    public static void main(String[] args) {

        //Subaru
        Rueda ruedasSubaru[] = new Rueda[5];
        Persona conSubaru = new Persona("Luis", "Escorcia");
        Motor motorSubaru = new Motor(2, TipoMotor.BENCINA);
        Automovil subaru = new Automovil("Subaru", "Impresa");
        subaru.setMotor(motorSubaru);//(new Motor(2, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conSubaru);
        /*subaru.setRuedas(ruedasSubaru);
        for (int i = 0; i < ruedasSubaru.length; i++) {
            subaru.addRueda(new Rueda("Yokohoma", 16, 7.5));
        }*/

        //Mazda
        Rueda ruedasMazda[] = new Rueda[5];
        for (int i = 0; i < ruedasMazda.length; i++) {
            ruedasMazda[i] = new Rueda("Michelin", 18, 10.5);
        }
        Persona conMazda = new Persona("Pato", "Escorcia");
        Motor motorMazda = new Motor(3, TipoMotor.DIESEL);
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.GRIS, motorMazda);
        mazda.setEstanque(new Estanque(45));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setConductor(conMazda);
        //mazda.setRuedas(ruedasMazda);

        //Nissan
        Rueda rudasNissan[] = {new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5)};
        Persona conNissan = new Persona("Bea", "Escorcia");
        Motor motorNissan = new Motor(4, TipoMotor.DIESEL);
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, motorNissan,
                new Estanque(50), conNissan, null);
        nissan.setConductor(conNissan);
        //nissan.setRuedas(rudasNissan);


        //nissan 2
        Persona conNissan2 = new Persona("Lalo", "Escorcia");
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.DIESEL), new Estanque(50), conNissan2, null);
        nissan2.setTipo(TipoAutomovil.PICKUP);
        nissan2.setConductor(conNissan2);

        //metodo static de la clase Automovil (colorPatente)
        Automovil.setColorPatente(Color.VERDE);//Automivil.colorPatente = "Verde";

        System.out.println("=== Detalle Subura ===");
        System.out.println(subaru.verDetalle());
        System.out.println("=== Detalle mazda ===");
        System.out.println(mazda.verDetalle());
        System.out.println("=== Detalle Nissan ===");
        System.out.println(nissan.verDetalle());
        System.out.println("=== Detalle Nissan2 ===");
        System.out.println(nissan2.verDetalle());

        /*
        System.out.println("Conductor Subaru:" + subaru.getConductor());
        System.out.println("Ruedas Subaru: ");
        for (Rueda r: subaru.getRuedas()){
            System.out.println("Fabricante: "+r.getFabricante() + ", Aro: " + r.getAro() + ", Ancho: " + r.getAncho());
        }*/

    }
}
