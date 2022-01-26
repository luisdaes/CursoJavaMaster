public class OperadoresAsignacion {

    public static void main(String[] args) {
        
        //asignacion de variable
        int i = 5;
        int j = i + 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        //forma resumida
        i += 2; // i = i + 2;
        System.out.println("i = " + i);
        
        j -= 4;
        System.out.println("j = " + j);
        
        i *= 3;
        System.out.println("i = " + i);

        String sqlstring = "select * from clientes as c";
        sqlstring += " where c.nombre = 'Andres'";
        sqlstring += " and c.activo = 1";

        System.out.println("sqlstring = " + sqlstring);

    }
}
