package PATRONES_DISENO.decorator.decoradores;

public class SubrayadoDecorador extends TextoDecorador {
  public SubrayadoDecorador(Formateable texto) {
	super(texto);
  }

  @Override
  public String darFormato() {
	int largo =  texto.darFormato().length();
	StringBuilder sb = new StringBuilder(texto.darFormato());
	sb.append("\n");
	for (int i = 0; i < largo; i++) {
	  sb.append("_");
	}
	return sb.toString();
  }
}
