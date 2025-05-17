package PATRONES_DISENO.decorator.decoradores2;

public class ConChocolateDecorador extends CafeDecorador{
  public ConChocolateDecorador(Configurable cafe) {
	super(cafe);
  }

  @Override
  public float getPrecioBase() {
	return cafe.getPrecioBase() + 3.5f;
  }

  @Override
  public String getIngredientes() {
	return cafe.getIngredientes() + ", Chocolate";
  }
}
