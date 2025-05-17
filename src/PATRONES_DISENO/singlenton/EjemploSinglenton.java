package PATRONES_DISENO.singlenton;

public class EjemploSinglenton {

  public static void main(String[] args) {

	ConexionBDSinglenton con = null;
	for (int i = 0; i < 10; i++) {
	  con = ConexionBDSinglenton.getInstance();
	  System.out.println("instancia: " + con);
	}

	ConexionBDSinglenton con2 = ConexionBDSinglenton.getInstance();
	ConexionBDSinglenton con3 = ConexionBDSinglenton.getInstance();

	boolean mismaIntancia = ((con == con2) && (con == con3));
	System.out.println(mismaIntancia);
  }
}
