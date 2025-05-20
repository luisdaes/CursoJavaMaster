package PATRONES_DISENO.decorator;

import PATRONES_DISENO.decorator.decoradores.Formateable;
import PATRONES_DISENO.decorator.decoradores.MayusculaDecorador;
import PATRONES_DISENO.decorator.decoradores.ReversaDecorador;
import PATRONES_DISENO.decorator.decoradores.SubrayadoDecorador;
import PATRONES_DISENO.decorator.decoradores.Texto;

public class EjemploDecorador1 {

  public static void main(String[] args) {

	Formateable texto = new Texto("Hola Desarrollador LuisDa");

	MayusculaDecorador mayusculaDecorador = new MayusculaDecorador(texto);
	ReversaDecorador reversaDecorador = new ReversaDecorador(mayusculaDecorador);
	SubrayadoDecorador subrayadoDecorador = new SubrayadoDecorador(reversaDecorador);

	System.out.println(subrayadoDecorador.darFormato());
  }
}
