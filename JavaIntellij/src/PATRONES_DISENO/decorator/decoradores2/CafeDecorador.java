package PATRONES_DISENO.decorator.decoradores2;

abstract  public class CafeDecorador implements Configurable{

  protected Configurable cafe;

  public CafeDecorador(Configurable cafe) {
	this.cafe = cafe;
  }
}
