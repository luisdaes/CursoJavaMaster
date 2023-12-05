package poo_interfaces.models;

public class Pagina extends Hoja implements Imprimible{
  public Pagina(String contenido) {
	super(contenido);
  }

  @Override
  public String imprimir() {
	return contenido;
  }
}
