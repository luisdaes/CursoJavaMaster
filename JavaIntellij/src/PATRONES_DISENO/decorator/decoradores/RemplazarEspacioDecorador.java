package PATRONES_DISENO.decorator.decoradores;

public class RemplazarEspacioDecorador extends TextoDecorador {

  public RemplazarEspacioDecorador(Formateable texto) {
	super(texto);
  }

  @Override
  public String darFormato() {
	return texto.darFormato().replace(" ", "_");
  }
}
