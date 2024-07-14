package LAMBDA;

import LAMBDA.ARITMETIC.Aritmetic;
import LAMBDA.ARITMETIC.Calculator;

public class EjemploIntefaceFunctional {

  public static void main(String[] args) {

	Aritmetic plus = (a, b) -> a + b;
	Aritmetic minus = (a, b) -> a - b;
	Aritmetic multiply = (a, b) -> a * b;
	Aritmetic divide = (a, b) -> a / b;
	Aritmetic module = (a, b) -> a % b;
	Aritmetic porcenta = (a, b) -> a / b;

	Calculator calculator = new Calculator();
	System.out.println(calculator.compute(10, 1, minus));
	System.out.println(calculator.compute(12, 4, plus));

	System.out.println(calculator.computeBiFunction(12, 5, (a, b) -> a + b));
  }
}
