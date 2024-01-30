package thread;

import thread.threads.NombreThread;

public class EjemploExtendTread {
  public static void main(String[] args) throws InterruptedException {

    Thread hilo = new NombreThread("1er Hilo");
    hilo.start();

    //iterrumpir el hilo
    Thread.sleep(10000);

    Thread hilo2 = new NombreThread("2do Hilo");
    hilo2.start();
    System.out.println(hilo.getState());
  }
}
