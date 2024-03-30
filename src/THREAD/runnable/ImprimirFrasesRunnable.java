package THREAD.runnable;

import static THREAD.threads.EjemploSincronizacionThread.imprimirFrases;

public class ImprimirFrasesRunnable implements Runnable{

  String frase1, frase2;

  public ImprimirFrasesRunnable(String frase1, String frase2) {
	this.frase1 = frase1;
	this.frase2 = frase2;
  }

  @Override
  public void run() {
	imprimirFrases(frase1, frase2);
  }
}
