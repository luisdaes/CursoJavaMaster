public class EjemploStringInmutable {

    public static void main(String[] args) {

        String curso = "Programación Java";
        String estudiante = "Luis Escorcia";

        String resultado = curso.concat(estudiante);
        System.out.println("curso = " + curso);
        System.out.println(curso == resultado);

        //resibe una funcion
        String resultado2 = curso.transform(c ->{
            return c + " de: " + estudiante;
        });
        System.out.println("resultado2 = " + resultado2);

        String resultado3 = resultado.replace("a", "A");
        System.out.println("resultado3 = " + resultado3);
        
    }
}
