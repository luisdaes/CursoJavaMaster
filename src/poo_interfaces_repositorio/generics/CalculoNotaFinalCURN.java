package poo_interfaces_repositorio.generics;

import java.util.Scanner;

public class CalculoNotaFinalCURN {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	// Solicitar al usuario ingresar las calificaciones
	System.out.print("Ingrese la calificación de OTRAS EVALUACIONES PP (13.5%): ");
	double otrasEvalPP = scanner.nextDouble();

	System.out.print("Ingrese la calificación de EXAMEN ESCRITO PP (16.5%): ");
	double examenEscritoPP = scanner.nextDouble();

	System.out.print("Ingrese la calificación de OTRAS EVALUACIONES SP (13.5%): ");
	double otrasEvalSP = scanner.nextDouble();

	System.out.print("Ingrese la calificación de EXAMEN ESCRITO SP (16.5%): ");
	double examenEscritoSP = scanner.nextDouble();

	System.out.print("Ingrese la calificación de OTRAS EVALUACIONES EF (14%): ");
	double otrasEvalEF = scanner.nextDouble();

	System.out.print("Ingrese la calificación de EXAMEN FINAL EF (26%): ");
	double examenFinalEF = scanner.nextDouble();

	// Calcular la nota final
	double notaFinal = calcularNotaFinal(otrasEvalPP, examenEscritoPP, otrasEvalSP, examenEscritoSP, otrasEvalEF, examenFinalEF);

	// Mostrar la nota final
	System.out.println("La nota final es: " + notaFinal);

	scanner.close();
  }

  // Función para calcular la nota final
  private static double calcularNotaFinal(double otrasEvalPP, double examenEscritoPP,
	  double otrasEvalSP, double examenEscritoSP,
	  double otrasEvalEF, double examenFinalEF) {
	// Aplicar las ponderaciones y calcular la nota final
	double notaFinal = (otrasEvalPP * 0.135) + (examenEscritoPP * 0.165) +
		(otrasEvalSP * 0.135) + (examenEscritoSP * 0.165) +
		(otrasEvalEF * 0.14) + (examenFinalEF * 0.26);

	return notaFinal;
  }
}
