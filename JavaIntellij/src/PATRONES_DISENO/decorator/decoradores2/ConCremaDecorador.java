package PATRONES_DISENO.decorator.decoradores2;

public class ConCremaDecorador extends CafeDecorador{
  public ConCremaDecorador(Configurable cafe) {
	super(cafe);
  }

  @Override
  public float getPrecioBase() {
	return cafe.getPrecioBase() + 5f;
  }

  @Override
  public String getIngredientes() {
	return cafe.getIngredientes() + ", Crema";
  }
}
