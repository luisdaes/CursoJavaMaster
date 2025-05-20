

public class AnalisisSemantico{
	public static void main(String[] args) {
	  int a = 5;
	  float b = 3.14f;

	  if (a + b == (int)(a + b)) {
		System.out.println("La operación es válida");
	  } else {
		System.out.println("La operación no es válida");
	  }
	}
  }
