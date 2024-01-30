package thread;

public class EjemploInterfaceRunnableJAVA8 {
  public static void main(String[] args) {

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
	new Thread(viajar,"Playa Linda").start();
	new Thread(viajar,"Peñol").start();
	new Thread(viajar,"Manizales").start();
	new Thread(viajar,"Bogota").start();
  }
}
