package LAMBDA.ARITMETIC;

import java.util.function.BiFunction;

public class Calculator {

  public Double compute(double a, double b, Aritmetic lambda){
	return lambda.operate(a, b);
  }

  public double computeBiFunction(double a, double b, BiFunction<Double, Double, Double> lambda){
	return lambda.apply(a, b);
  }
}
