public class EjemploStringMetodos {

    public static void main(String[] args) {
        
        String nombre = "Luisda";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Luisda\") = " + nombre.equals("Luisda"));
        System.out.println("nombre.equals(\"luisda\") = " + nombre.equals("luisda"));
        System.out.println("nombre.equalsIgnoreCase(\"LuisDa\") = " + nombre.equalsIgnoreCase("LuisDa"));
        System.out.println("nombre.compareTo(\"david\") = " + nombre.compareTo("david"));
        System.out.println("nombre.charAt(4) = " + nombre.charAt(4));
        System.out.println("nombre.charAt(nombre.length()) = " + nombre.charAt(nombre.length()-1)); //obtenemos el ultimo valor
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(4));
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));
        
        String trabaLenguas = "trabalengua";

        System.out.println("trabaLenguas.replace(\"a\", \".\") = " + trabaLenguas.replace("a", "."));
        System.out.println("trabaLenguas.indexOf('a') = " + trabaLenguas.indexOf('a')); //entraga el primer caracter
        System.out.println("trabaLenguas.lastIndexOf('a') = " + trabaLenguas.lastIndexOf('a')); //ultimo caracter
        System.out.println("trabaLenguas.indexOf('lenguas') = " + trabaLenguas.indexOf("lenguas"));
        System.out.println("trabaLenguas.contains(\"t\") = " + trabaLenguas.contains("t"));
        System.out.println("trabaLenguas.startsWith(\"traba\") = " + trabaLenguas.startsWith("traba"));
        System.out.println("trabaLenguas.endsWith(\"uas\") = " + trabaLenguas.endsWith("uas"));

        trabaLenguas = " trabaLenguas ";
        System.out.println("trabaLenguas.trim() = " + trabaLenguas.trim()); //elimina los espacios
        
    }
}
