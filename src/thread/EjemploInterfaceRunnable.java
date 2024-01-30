package thread;

import thread.runnable.ViajeTareaRunnable;

public class EjemploInterfaceRunnable {
  public static void main(String[] args) {
	new Thread(new ViajeTareaRunnable("Playa Linda")).start();
	new Thread(new ViajeTareaRunnable("Peñol")).start();
	new Thread(new ViajeTareaRunnable("Manizales")).start();
	new Thread(new ViajeTareaRunnable("Bogota")).start();
  }
}
