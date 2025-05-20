package PATRONES_DISENO.decorator.decoradores2;

public class ConLecheDecorador extends CafeDecorador{
  public ConLecheDecorador(Configurable cafe) {
	super(cafe);
  }

  @Override
  public float getPrecioBase() {
	return cafe.getPrecioBase() + 4.5f;
  }

  @Override
  public String getIngredientes() {
	return cafe.getIngredientes() + ", Leche";
  }
}
