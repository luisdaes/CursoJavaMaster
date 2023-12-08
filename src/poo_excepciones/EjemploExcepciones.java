package poo_excepciones;

import javax.swing.*;

import poo_excepciones.excepciones.DivisionPorZeroeException;
import poo_excepciones.excepciones.FormatoNumeroException;

public class EjemploExcepciones {
  public static void main(String[] args) {


	Calculadora cal = new Calculadora();
	String numerador = JOptionPane.showInputDialog("Ingrese un numerador: ");
	String denominador = JOptionPane.showInputDialog("Ingrese un denominador: ");

	try {
	  double division2 = cal.dividir(numerador, denominador);
	  System.out.println("Division : " +division2);
	}catch (DivisionPorZeroeException de){
	  System.out.println("Error en la division: " + de.getMessage());
	  main(args);
	}catch (NumberFormatException nfe){
	  System.out.println("Error al ingresar valor: " + nfe.getMessage());
	  main(args);
	} catch (FormatoNumeroException ef) {
	  System.out.println("Error, Ingrese numeros validos: " + ef.getMessage());
	  main(args);
	} finally {
	  System.out.println("Mensaje que siempre se muestra!");
	}
	System.out.println("Flujo final del codigo!");
  }
}
