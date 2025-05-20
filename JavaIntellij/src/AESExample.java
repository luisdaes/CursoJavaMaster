import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class AESExample {
  public static void main(String[] args) throws Exception {
	String textoPlano = "Hola mundo";

	// Generar una clave secreta
	KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
	keyGenerator.init(128); // Tamaño de la clave: 128 bits
	SecretKey claveSecreta = keyGenerator.generateKey();

	// Crear el cifrador
	Cipher cifrador = Cipher.getInstance("AES");

	// Cifrar el texto
	cifrador.init(Cipher.ENCRYPT_MODE, claveSecreta);
	byte[] textoCifrado = cifrador.doFinal(textoPlano.getBytes());

	// Convertir el texto cifrado a una representación en Base64
	String textoCifradoBase64 = Base64.getEncoder().encodeToString(textoCifrado);
	System.out.println("Texto cifrado: " + textoCifradoBase64);

	// Descifrar el texto
	cifrador.init(Cipher.DECRYPT_MODE, claveSecreta);
	byte[] textoDescifrado = cifrador.doFinal(Base64.getDecoder().decode(textoCifradoBase64));

	// Convertir el texto descifrado a String
	String textoDescifradoStr = new String(textoDescifrado);
	System.out.println("Texto descifrado: " + textoDescifradoStr);
  }
}
