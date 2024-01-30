package thread.runnable;

public class ViajeTareaRunnable implements Runnable{

  private String nombre;

  public ViajeTareaRunnable(String nombre) {
	this.nombre = nombre;
  }

  public String getNombre() {
	return nombre;
  }

  @Override
  public void run() {
	for (int i = 0; i < 10; i++) {
	  System.out.println(i + " - " + nombre);
	  try {
		Thread.sleep((long)(Math.random() * 1000));
	  } catch (InterruptedException e) {
		e.printStackTrace();
		throw new RuntimeException(e);
	  }
	  System.out.println("Debo irme de viaje a:  " + nombre);
	}
  }
}
