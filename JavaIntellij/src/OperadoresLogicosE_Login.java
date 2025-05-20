import java.util.Scanner;

public class OperadoresLogicosE_Login {

    public static void main(String[] args) {

        //EJEMPLO 1
        /*
        String username = "LuisDa";
        String password = "12345";

        String userAdmi = "admi";
        String passAdmi = "54321";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.next();

        System.out.println("Ingrese el password");
        String p = scanner.next();

        boolean esAutenticado = false;

        if (username.equals(u) && password.equals(p) ||
                userAdmi.equals(u) && passAdmi.equals(p)){

            esAutenticado = true;
        }

        if (esAutenticado){

            System.out.println("Bienvenido usario: ".concat(u).concat("!"));
        }else {

            System.out.println("Usario incorrecto!");
        }
        */

        //EJEMPLO 2
        /*
        //Arreglo
        String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "LuisDa";
        passwords[0] = "12345";

        usernames[1] = "admi";
        passwords[1] = "54321";

        usernames[2] = "David";
        passwords[2] = "0000";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.next();

        System.out.println("Ingrese el password");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i=0; i<usernames.length; i++){
            if (usernames[i].equals(u) && passwords[i].equals(p)){

                esAutenticado = true;
                break;
            }
        }

        if (esAutenticado){

            System.out.println("Bienvenido usario: ".concat(u).concat("!"));
        }else {

            System.out.println("Usario o contraseña incorrecto!");
            System.out.println("Lo Siento, Requiere autenticacion!");
        }

         */

        //EJEMPLO 3

        String[] usernames = {"LuisDa", "admi", "David"};
        String[] passwords = {"1", "2", "3"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.next();

        System.out.println("Ingrese el password");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i=0; i<usernames.length; i++){

            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p)) ? true: esAutenticado;

        }

        String mensaje = esAutenticado ? "Bienvenido usario: ".concat(u).concat("!"):
        "Usario o contraseña incorrecto!\nLo Sentimos, Requiere autenticacion!";

        System.out.println(mensaje);

    }
}
