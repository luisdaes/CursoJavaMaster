package THREAD.threads;

public class NombreThread extends Thread{

  public NombreThread(String nombre){
	super(nombre);
  }

  @Override
  public void run(){
	System.out.println("Inicia el metodo del HILO: " + getName());

	for (int i = 0; i < 5; i++){
	  System.out.println("Iteracion: "+i);
	}

	System.out.println("Finaliza el HILO: " + getName());
  }
}
