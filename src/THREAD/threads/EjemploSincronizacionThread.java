package THREAD.threads;

import THREAD.runnable.ImprimirFrasesRunnable;

public class EjemploSincronizacionThread {

  public static void main(String[] args) {
	new Thread(new ImprimirFrasesRunnable("Hey ", " Que tal?")).start();
	new Thread(new ImprimirFrasesRunnable("¿quien eres ", " tu?")).start();
	new Thread(new ImprimirFrasesRunnable("Muchas ", " Gracias amigo!")).start();
  }

  public synchronized static void imprimirFrases(String frase1, String frase2){
	System.out.print(frase1);

	try {
	  Thread.sleep(500);
	} catch (InterruptedException e) {
	  throw new RuntimeException(e);
	}
	System.out.println(frase2);
  }
}
