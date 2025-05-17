package PATRONES_DISENO.singlenton;

public class ConexionBDSinglenton {

  /*
  private static final ConexionBDSinglenton instance = new ConexionBDSinglenton();

  public static ConexionBDSinglenton getInstancia(){
	return instance;
  } */

  private static ConexionBDSinglenton instancia;

  private ConexionBDSinglenton(){
	System.out.println(" ... Unica instancia de la clase ConexionBDSinglenton ... ");
  }

  public static ConexionBDSinglenton getInstance() {

	if (instancia == null) {
	  instancia = new ConexionBDSinglenton();
	}
	return instancia;
  }
}
