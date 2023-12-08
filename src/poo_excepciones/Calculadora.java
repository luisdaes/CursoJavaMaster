package poo_excepciones;

import poo_excepciones.excepciones.DivisionPorZeroeException;
import poo_excepciones.excepciones.FormatoNumeroException;

public class Calculadora {

  public double dividir(int numerador, int dividendo) throws DivisionPorZeroeException {
	if(dividendo == 0){
	  throw new DivisionPorZeroeException("No se puede dividir por cero");
	}
	return numerador / (double) dividendo;
  }

  public double dividir(String numerador, String divisor) throws DivisionPorZeroeException,
	  FormatoNumeroException {
	int num;
	int div;
	try{
	  num = Integer.parseInt(numerador);
	  div = Integer.parseInt(divisor);
	  return this.dividir(num, div);
	}catch (NumberFormatException nfe){
	  throw new FormatoNumeroException("Debe ingresar un numero en numerador y divisor");
	}

  }
}
