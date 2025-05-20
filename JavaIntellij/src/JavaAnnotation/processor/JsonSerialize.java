package JavaAnnotation.processor;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

import JavaAnnotation.JsonAttribute;
import JavaAnnotation.exception.JsonSerializerException;

public class JsonSerialize {

  /**
   *Method serializer
   **/
  public static String Serializer (Object object) {

	if(Objects.isNull(object)){
	  throw new JsonSerializerException("object could be not null");
	}

	Field[] allFields = object.getClass().getDeclaredFields();

	return Arrays.stream(allFields)
		.filter(f -> f.isAnnotationPresent(JsonAttribute.class))
		.map(f -> {
		  f.setAccessible(true);
		  String name = f.getAnnotation(JsonAttribute.class).name().isEmpty()
			  ? f.getName()
			  : f.getAnnotation(JsonAttribute.class).name();
		  try {

			Object value = f.get(object);
			if (f.getAnnotation(JsonAttribute.class).capitalize()
				&& value instanceof String) {

			  // way working
			  String capitalized = value.toString().substring(0, 1).toUpperCase()
				  + value.toString().substring(1).toLowerCase();

			  // another working
			  String capitalizeValue = (String) value;
			  capitalizeValue = String.valueOf(capitalizeValue.charAt(0)).toUpperCase()
				  + capitalizeValue.substring(1).toLowerCase();

			  // another work it
			  capitalizeValue = Arrays.stream(capitalizeValue.split(" "))
				  .map(word -> word.substring(0, 1).toUpperCase()
					  + word.substring(1).toLowerCase()).collect(Collectors.joining(" "));

			  f.set(object, capitalizeValue);//f.set(object, capitalizeValue);
			}

			return "\"" + name + "\":\"" + f.get(object) + "\"";
		  } catch (IllegalAccessException e) {
			throw new JsonSerializerException("Error to serialize: " + e.getMessage());
		  }
		}).reduce("{", (a, b) -> {
		  if ("{".equals(a)) {
			return a + b;
		  }
		  return a + ", " + b;
		}).concat("}");
  }
}
