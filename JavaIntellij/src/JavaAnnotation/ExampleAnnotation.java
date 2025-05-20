package JavaAnnotation;

import java.time.LocalDate;

import JavaAnnotation.models.Product;
import JavaAnnotation.processor.JsonSerialize;

public class ExampleAnnotation {
  public static void main(String[] args) {

	Product product = new Product();
	product.setName("small table");
	product.setValue(12000L);
	product.setDate(LocalDate.now());

	/*Field[] allFields = product.getClass().getDeclaredFields();

	String attributeJson = Arrays.stream(allFields)
		.filter(f -> f.isAnnotationPresent(JsonAttribute.class))
		.map(f -> {
		  f.setAccessible(true);
		  String name = f.getAnnotation(JsonAttribute.class).name().isEmpty()
			  ? f.getName()
			  : f.getAnnotation(JsonAttribute.class).name();
		  try {
			return "\"" + name + "\":\"" + f.get(product) + "\"";
		  } catch (IllegalAccessException e) {
			throw new RuntimeException("Error to serialize: " + e.getMessage());
		  }
		}).reduce("{", (a, b) -> {
		  if ("{".equals(a)) {
			return a + b;
		  }
		  return a + ", " + b;
		}).concat("}");*/

	System.out.println("Attribute: " + JsonSerialize.Serializer(product));
  }
}
