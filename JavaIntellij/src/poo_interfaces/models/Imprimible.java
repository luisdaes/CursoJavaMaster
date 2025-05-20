package poo_interfaces.models;

public interface Imprimible {

  String TEXTO_DEFECTO = "Imprimiendo un valor por defecto";

  //String imprimir();

  default String imprimir(){
    return TEXTO_DEFECTO;
  }

  static void imprimir(Imprimible imprimible){
    System.out.println(imprimible.imprimir());
  }
}
