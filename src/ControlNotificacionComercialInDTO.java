import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO con la información de entrada para control de notificacion al comercial CC298164
 *
 * NOTIFICACION_PAGO_CANALEJECUTIVO_VALOREJECUTIVO_NIVELLIDER_VALORLIDER
 *
 * @author Luis David Escorcia Avila <lescorcia@heinsohn.com.co>
 * @version 1.0
 */
public class ControlNotificacionComercialInDTO implements Serializable {

  /**
   * Atributo de serializacion
   */
  private static final long serialVersionUID = 1L;
  /**
   * Indica el nombre Canal
   */
  private String nombreCanal;
  /**
   * Indica el tope de valor para Control Ejecutivo
   */
  private BigDecimal valorControlEjecutivo;
  /**
   * Indica el nivel Lider
   */
  private String nivelLider;
  /**
   * Indica el tope de valor para Control Lider
   */
  private BigDecimal valorControlLider;

  /**
   * Constructor de la clase ControlNotificacionComercialInDTO.
   *
   * Este constructor inicializa un objeto ControlNotificacionComercialInDTO
   *
   * @param nombreCanal El nombre del canal, que debe ser una cadena de texto que representa
   *                    el nombre del canal.
   * @param valorControlEjecutivo El valor del control ejecutivo, representa la cantidad
   *                              asociada al control ejecutivo para el canal.
   * @param nivelLider El nivel del líder, rol del líder correspondiente al canal.
   * @param valorControlLider El valor asociado al control del líder, representa la cantidad
   *                          relacionada con el control de liderazgo dentro del canal.
   *
   * @author Luis David Escorcia Avila <lescorcia@heinsohn.com.co>
   */
  public ControlNotificacionComercialInDTO(String nombreCanal, BigDecimal valorControlEjecutivo,
	  String nivelLider, BigDecimal valorControlLider) {

	this.nombreCanal = nombreCanal;
	this.valorControlEjecutivo = valorControlEjecutivo;
	this.nivelLider = nivelLider;
	this.valorControlLider = valorControlLider;
  }

  /**
   * Metodo encargado de retornar el valor del atributo nombreCanal
   *
   * @return El nombreCanal asociado a la clase
   */
  public String getNombreCanal() {
	return nombreCanal;
  }
  /**
   * Metodo encargado de modificar el valor del atributo nombreCanal
   *
   * @param nombreCanal El nuevo nombreCanal a modificar.
   */
  public void setNombreCanal(String nombreCanal) {
	this.nombreCanal = nombreCanal;
  }
  /**
   * Metodo encargado de retornar el valor del atributo valorControlEjecutivo
   *
   * @return El valorControlEjecutivo asociado a la clase
   */
  public BigDecimal getValorControlEjecutivo() {
	return valorControlEjecutivo;
  }
  /**
   * Metodo encargado de modificar el valor del atributo valorControlEjecutivo
   *
   * @param valorControlEjecutivo El nuevo valorControlEjecutivo a modificar.
   */
  public void setValorControlEjecutivo(BigDecimal valorControlEjecutivo) {
	this.valorControlEjecutivo = valorControlEjecutivo;
  }
  /**
   * Metodo encargado de retornar el valor del atributo nivelLider
   *
   * @return El nivelLider asociado a la clase
   */
  public String getNivelLider() {
	return nivelLider;
  }
  /**
   * Metodo encargado de modificar el valor del atributo nivelLider
   *
   * @param nivelLider El nuevo nivelLider a modificar.
   */
  public void setNivelLider(String nivelLider) {
	this.nivelLider = nivelLider;
  }
  /**
   * Metodo encargado de retornar el valor del atributo valorControlLider
   *
   * @return El valorControlLider asociado a la clase
   */
  public BigDecimal getValorControlLider() {
	return valorControlLider;
  }
  /**
   * Metodo encargado de modificar el valor del atributo valorControlLider
   *
   * @param valorControlLider El nuevo valorControlLider a modificar.
   */
  public void setValorControlLider(BigDecimal valorControlLider) {
	this.valorControlLider = valorControlLider;
  }
}
