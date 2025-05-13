import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import STREAM.MODELS.User;

public class DecodificadorConstante {

  public static void main(String[] args) {

	String constante = "GESTION PATRIMONIAL-NUEVO-LÍDER-3000000,AHORRO PARA EL RETIRO-2000000-LÍDER-10000000,GRANDES EMPLEADORES-2500000-LÍDER-10000000, n";

	List<ControlNotificacionComercialInDTO> lista = obtenerInformacionControl(constante);
	lista.forEach(System.out::println);

  }

  /**|
   * Método encargado de obtener la constante de notificación cliente
   */
  private static List<ControlNotificacionComercialInDTO> obtenerInformacionControl(String constante) {

	List<ControlNotificacionComercialInDTO> listaControlNotificacion = new ArrayList<>();

	String[] informacionControl = constante.split(",");

	for (String control : informacionControl) {

	  control = control.trim();

	  // Separar por guion medio
	  String[] datos = control.split("-");

	  System.out.println("");
	  System.out.println("-----------------------------INICIO-----------------------------");

	  // Validar los 4 datos (nombreCanal, valorControlEjecutivo, nivelLider, valorControlLider)
	  if (datos.length == 4) {
		try {
		  String nombreCanal = datos[0].trim();
		  BigDecimal valorControlEjecutivo = new BigDecimal(datos[1].trim());
		  String nivelLider = datos[2].trim();
		  BigDecimal valorControlLider = new BigDecimal(datos[3].trim());

		  System.out.println("Procesando: " + control);
		  System.out.println("Nombre canal           : " + nombreCanal);
		  System.out.println("Valor control ejecutivo: " + valorControlEjecutivo);
		  System.out.println("Nivel lider            : " + nivelLider);
		  System.out.println("Valor control lider    : " + valorControlLider);

		  // Crear el DTO y agregarlo a la lista
		  listaControlNotificacion.add(new ControlNotificacionComercialInDTO(nombreCanal,
			  valorControlEjecutivo, nivelLider, valorControlLider));
		}catch (NumberFormatException ex){
		  System.out.println("Error: " + ex.getMessage());
		}
	  } else {
		String msjError = "Error en el método obtenerInformacionControl(): Contenido Inconmpletos en la constante: "+ control;
		System.out.println(msjError);
	  }
	  System.out.println("-----------------------------FINAL-----------------------------");
	  System.out.println("");
	}
	return listaControlNotificacion;
  }
}
