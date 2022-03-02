package POO.AUTOMOVIL_UML;

import java.util.Arrays;

public class EjemploAutomovilArreglo {

    public static void main(String[] args) {

        //Subaru
        Persona conSubaru = new Persona("Luis", "Escorcia");
        Motor motorSubaru = new Motor(2, TipoMotor.BENCINA);
        Automovil subaru = new Automovil("Subaru", "Impresa");
        subaru.setMotor(motorSubaru);//(new Motor(2, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conSubaru);

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

        //Nissan
        Persona conNissan = new Persona("Bea", "Escorcia");
        Motor motorNissan = new Motor(4, TipoMotor.DIESEL);
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, motorNissan,
                new Estanque(50), conNissan, null);
        nissan.setConductor(conNissan);
        nissan.setTipo(TipoAutomovil.PICKUP);

        //susuki
        Persona conSusuki = new Persona("Lalo", "Escorcia");
        Automovil susuki = new Automovil("Susuki", "Navara", Color.GRIS,
                new Motor(1.6, TipoMotor.DIESEL), new Estanque(50));
        susuki.setConductor(conSusuki);
        susuki.setColor(Color.AMARILLO);
        susuki.setTipo(TipoAutomovil.SUV);
        Automovil.setColorPatente(Color.AZUL);

        //audi
        Automovil audi = new Automovil("Audi", "A3");
        audi.setConductor(new Persona("David", "Escorcia"));

        Automovil autos[] = new Automovil[5];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = susuki;
        autos[4] = audi;

        Arrays.sort(autos);

        for (int i = 0; i < autos.length; i++) {
            System.out.println(autos[i]);
        }

        for (Automovil auto: autos) {
            System.out.println(auto);
        }


    }
}
