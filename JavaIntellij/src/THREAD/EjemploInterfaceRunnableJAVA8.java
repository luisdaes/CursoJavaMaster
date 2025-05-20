package THREAD;

public class EjemploInterfaceRunnableJAVA8 {
  public static void main(String[] args) throws InterruptedException {

	Runnable viajar = new Runnable() {

	  String lugar = Thread.currentThread().getName();
	  @Override
	  public void run() {
		for (int i = 0; i < 10; i++) {
		  System.out.println(i + " - " + lugar);
		  try {
			Thread.sleep((long)(Math.random() * 1000));
		  } catch (InterruptedException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		  }
		  System.out.println("Debo irme de viaje a:  " + lugar);
		}
	  }
	};
	Thread v1 = new Thread(viajar,"Playa Linda");
	Thread v2 = new Thread(viajar,"Peñol");
	Thread v3 = new Thread(viajar,"Manizales");
	Thread v4 = new Thread(viajar,"Bogota");

	v1.start();
	v1.join(); // Es igual a metodo sleep, solo que detiene la instacia


	v2.start();
	v3.start();
	v4.start();

	Thread.sleep(15000); //detiene el hilo actual
	System.out.println("Continuando con la ejecucion de metodo main");
  }
}
