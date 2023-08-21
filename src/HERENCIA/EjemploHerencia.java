package HERENCIA;

public class EjemploHerencia {


    public static void main(String[] args) {

        System.out.println("=========================Creando instancia de alumno=========================");
        Alumno alumno = new Alumno();
        alumno.nombre = ("LuisDa"); //Declarado como protected se puede acceder directamente cuando es una sublcase heredada (desde el mismo paquete)
        alumno.setApellido("Escorcia");
        alumno.setEdad(26);
        alumno.setEmail("Example@hotmail.com");
        alumno.setInstitucion("Col. Jesus Maestro SyO");
        alumno.setNotaCastellano(2.5);
        alumno.setNotaMatematica(5);
        alumno.setNotaHistoria(4);

        Alumno alumnoNuevo = new Alumno("Jesus", "Escorcia", 2, null);
        alumnoNuevo.setEmail("Example@gmail.com");

        System.out.println("=========================Creando instancia de alumno internacional=========================");
        AlumnoInternacional alumnoInter = new AlumnoInternacional();
        alumnoInter.nombre = "Deivis";
        alumnoInter.setApellido("Escorcia");
        alumnoInter.setEdad(22);
        alumnoInter.setInstitucion("Col. Mercedes Abrego");
        alumnoInter.setNotaCastellano(1.5);
        alumnoInter.setNotaMatematica(4);
        alumnoInter.setNotaHistoria(3);
        alumnoInter.setNotaIdiomas(3.5);
        alumnoInter.setPais("Colombia");

        System.out.println("=========================Creando instancia de profesor=========================");
        Persona profe = new Profesor();
        profe.setNombre("David");
        profe.setApellido("Avila");
        ((Profesor)profe).setAsignatura("Matematica"); //usando la clase padre, hacemos un casting a la clase hija

        System.out.println("La institucion del alumno: " + alumno.getNombre() + alumno.getApellido() +
                " Es: " + alumno.getInstitucion());
        System.out.println("La asignatura del profesor: " + profe.getNombre() + profe.getApellido() +
                " Es: " + ((Profesor) profe).getAsignatura());

        Class clase = alumnoInter.getClass();
        while (clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " Es una clase hija de la clase padre: " + padre);

            clase = clase.getSuperclass();
        }
        System.out.println("::::::::::::::::::::Imprimiendo Instanciacion de personas:::::::::::::::::");
        imprimir(alumnoNuevo);

        System.out.println("::::::::::::::::::::Imprimiendo Saludos de personas:::::::::::::::::");
        System.out.println("Saludo: " + alumnoInter.saludar());
        System.out.println("Promedio: " + alumnoInter.promedioNotas());


        System.out.println("::::::::::::::::::::Imprimiendo toString() de personas:::::::::::::::::");
        System.out.println(alumnoInter.toString());
        
    }

    //Metodo estatico para imprimir la herencia de clases
    public static void imprimir(Persona persona){
        System.out.println("::::::::::::::::::::Imprimiendo persona:::::::::::::::::");
        System.out.println("Nombre: " + persona.getNombre() +
                ", Apellido: " + persona.getApellido() +
                ", Edad: " + persona.getEdad() +
                ", Email: " + persona.getEmail());
        if (persona instanceof Alumno){
            System.out.println("::::::::::::::::::::Imprimiendo alumno:::::::::::::::::");
            System.out.println("Institucion: " + ((Alumno) persona).getInstitucion() +
                    ", Nota Matematica: " + ((Alumno) persona).getNotaMatematica() +
                    ", Nota Histotia: " + ((Alumno) persona).getNotaHistoria() +
                    ", Nota Castellano: " + ((Alumno) persona).getNotaCastellano());
            if (persona instanceof AlumnoInternacional){
                System.out.println("::::::::::::::::::::Imprimiendo alumno internacional:::::::::::::::::");
                System.out.println("Nota Idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas() +
                        ", Pais: " + ((AlumnoInternacional) persona).getPais());
            }
        }
    }
}
