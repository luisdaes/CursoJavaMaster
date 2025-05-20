package PATRONES_DISENO.decorator.decoradores;

abstract public class TextoDecorador implements Formateable {

  protected Formateable texto;

  public TextoDecorador(Formateable texto) {
	this.texto = texto;
  }
}
