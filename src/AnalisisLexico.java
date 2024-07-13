import java.io.StreamTokenizer;
import java.io.StringReader;
import java.io.IOException;

public class AnalisisLexico {
  public static void main(String[] args) {
	String sourceCode = "public class Suma { public static void main(String[] args) { int a = 5; float b = 3.14f; System.out.println(a + b); } }";
	try {
	  StreamTokenizer tokenizer = new StreamTokenizer(new StringReader(sourceCode));
	  while (tokenizer.nextToken() != StreamTokenizer.TT_EOF) {
		System.out.println("Token: " + tokenizer.sval);
	  }
	} catch (IOException e) {
	  e.printStackTrace();
	}
  }
}
