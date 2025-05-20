import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

public class ChiperExample {
  // Ruta física del archivo que contiene la clave DES
  private static final String RUTA_KEY_FISICA = "cargueArchivos/clave.key"; // Ruta del archivo que contiene la clave DES

  public static void main(String[] args) {
	try {
	  // Leer la clave desde el archivo
	  byte[] keyBytes = readKeyFromFile();

	  // Verificar que la longitud de la clave sea de 56 bits (8 bytes)
	  if (keyBytes.length != 8) {  // 8 bytes -> 56 bits
		throw new IllegalArgumentException("La longitud de la clave debe ser de 56 bits (8 bytes).");
	  }

	  // Crear la clave secreta para DES
	  SecretKeySpec secretKey = new SecretKeySpec(keyBytes, "DES");

	  // Crear un objeto Cipher para el cifrado DES
	  Cipher cipher = Cipher.getInstance("DES");
	  cipher.init(Cipher.ENCRYPT_MODE, secretKey); // Inicializar para cifrado

	  // Texto a cifrar
	  String text = "oqIbulGbmAaVt68S5cB2ygSYHV41nBOuKkm3YAIX6sT2wC3m82VWW86/KVUFOoCM";//""Texto de prueba para cifrado DES";

	  System.out.println("Texto para ser cifrado: " + text);
	  byte[] encryptedBytes = cipher.doFinal(text.getBytes()); // Cifrado

	  // Convertir el texto cifrado a Base64 para que sea legible
	  String encryptedText = Base64.getEncoder().encodeToString(encryptedBytes);
	  System.out.println("Texto cifrado (Base64): " + encryptedText);

	  String base64Prod =  "FP5P9Yo6gRReCzMMGeAkD7nVGZuglcuzg2/Gr4p9zL7PyK6EvtMjiM6/KVUFOoCM";
	  String base64Pruebas = "oqIbulGbmAaVt68S5cB2ygSYHV41nBOuKkm3YAIX6sT2wC3m82VWW86/KVUFOoCM";
	  if (isBase64(encryptedText)) {
		System.out.println("La cadena es válida Base64.");
	  } else {
		System.out.println("La cadena no es válida Base64.");
	  }
	  // Crear un objeto Cipher para el descifrado DES
	  Cipher dcipher = Cipher.getInstance("DES");
	  dcipher.init(Cipher.DECRYPT_MODE, secretKey); // Inicializar para descifrado

	  // Descifrar el texto cifrado
	  byte[] decryptedBytes = dcipher.doFinal(Base64.getDecoder().decode(encryptedText)); // Descifrado

	  // Convertir los bytes descifrados a texto
	  String decryptedText = new String(decryptedBytes);
	  System.out.println("Texto descifrado: " + decryptedText);

	} catch (Exception e) {
	  e.printStackTrace();
	}
  }

  public static boolean isBase64(String str) {
	try {
	  // Intentamos decodificar la cadena Base64
	  Base64.getDecoder().decode(str);
	  return true;
	} catch (IllegalArgumentException e) {
	  // Si ocurre un error, significa que no es una cadena Base64 válida
	  System.out.println("Entrada no válida Base64: " + str);
	  return false;
	}
  }

  // Método para leer la clave desde un archivo
  private static byte[] readKeyFromFile() throws IOException {
	try (FileInputStream fis = new FileInputStream(ChiperExample.RUTA_KEY_FISICA)) {
	  byte[] keyBytes = new byte[8]; // DES requiere una clave de 8 bytes (56 bits)
	  int bytesRead = fis.read(keyBytes); // Leer hasta 8 bytes

	  // Verificar si leímos la cantidad correcta de bytes
	  if (bytesRead != 8) {
		throw new IllegalArgumentException(
			"El archivo de clave debe contener exactamente 8 bytes.");
	  }

	  return keyBytes;
	}
  }

}
