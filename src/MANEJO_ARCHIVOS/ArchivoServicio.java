package MANEJO_ARCHIVOS;

import javax.crypto.CipherOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ArchivoServicio {

  public void crearArchivoBufferWriter(String nombreArchivo) {
	File archivo = new File(nombreArchivo);
	try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(archivo, true))) {

	  bufferedWriter.append("Primer texto del archivo\n")
		  .append("Segundo texto del archivo\n")
		  .append("Tercer texto del archivo\n");

	  System.out.println("Archivo creado!");
	} catch (IOException e) {
	  throw new RuntimeException(e);
	}
  }

  public void crearArchivoPrintWriten(String nombreArchivo) {
	File archivo = new File(nombreArchivo);
	try (PrintWriter printWriter = new PrintWriter(new FileWriter(archivo, true))) {

	  printWriter.append("Primer texto del archivo\n");
	  printWriter.println("Segundo texto del archivo\n");
	  printWriter.printf("Tercer %s del archivo\n", "texto");

	  System.out.println("Archivo creado!");
	} catch (IOException e) {
	  throw new RuntimeException(e);
	}
  }

  public String leerArchivo(String nombreArchivo) {
	StringBuilder sb = new StringBuilder();
	File archivo = new File(nombreArchivo);
	try (BufferedReader bufferedReader = new BufferedReader(new FileReader(archivo))) {
	  String lineaArchivo;
	  while ((lineaArchivo = bufferedReader.readLine()) != null) {
		sb.append(lineaArchivo).append("\n");
	  }
	} catch (IOException e) {
	  e.printStackTrace();
	}
	return sb.toString();
  }

}
