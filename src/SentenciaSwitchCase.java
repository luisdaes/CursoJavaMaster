public class SentenciaSwitchCase {

    public static void main(String[] args) {

        int num = 3;
        switch (num){
            case 0:
                System.out.println("El numero es cero");
                break;
            case 1:
                System.out.println("El numero es uno");
                break;
            case 2:
                System.out.println("El numero es dos");
                break;
            case 3:
                System.out.println("El numero es tres");
                break;
            default:
                System.out.println("Numemro desconocido");
        }

        String nombre = "Luis";

        switch (nombre){
            case "Admi":
                System.out.println("Incorrecto");
            case "David":
                System.out.println("Incorrecto");
            case "Luis":
                System.out.println("Correcto");
            default:
                System.out.println("Defeaul");
        }

        int semana = 7;
        switch (semana){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("dia de la semana no identificado!");
        }

    }

}
