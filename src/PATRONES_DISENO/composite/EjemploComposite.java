package PATRONES_DISENO.composite;

public class EjemploComposite {

  public static void main(String[] args) {

    Directorio doc = new Directorio("Documentos");
    Directorio java = new Directorio("Java");

    java.addComponente(new Archivo("patron-composite.docx"));
    Directorio stream = new Directorio("API Stream");
    stream.addComponente(new Archivo("stream-map.docx"));

    java.addComponente(stream);
    doc.addComponente(java);

    System.out.println(doc.mostrar(0));
  }
}
