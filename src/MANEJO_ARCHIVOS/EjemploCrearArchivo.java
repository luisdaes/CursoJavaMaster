package MANEJO_ARCHIVOS;

public class EjemploCrearArchivo {

  public static void main(String[] args) {

	String nombre = "/Users/luisdaesco/Studies/Java/CursoJavaMaster/ArchivosCurso/cursoJava.txt";
	ArchivoServicio archivoServicio = new ArchivoServicio();
	//archivoServicio.crearArchivoBufferWriter(nombre);
	//archivoServicio.crearArchivoPrintWriten(nombre);
	System.out.println(archivoServicio.leerArchivo(nombre));
  }
}
