package RECURSIVIDAD;

import java.util.stream.Stream;

import RECURSIVIDAD.Models.Componente;

public class EjemploRecursividad {

  public static void main(String[] args) {

	Componente pc = new Componente("Gabinete PC ATX");
	Componente fuentePoder = new Componente("Fuente de 700w");
	Componente placaMadre = new Componente("MainBoard Asus Sockets AMD");
	Componente cpu = new Componente("AMD Ryzen 5 2800");
	Componente ventilador = new Componente("Ventilador CPU");
	Componente disipador = new Componente("Disipador CPU");
	Componente tv = new Componente("Nvidia RTX 3080 8Gb");
	Componente gpu = new Componente("Nvidia RTX GPU");
	Componente gpuRam = new Componente("4Gb RAM");
	Componente gpuRam2 = new Componente("4Gb RAM");
	Componente gpuVentilador = new Componente("Ventiladores");
	Componente ram = new Componente("Memoria RAM 32Gb");
	Componente ssd = new Componente("Disco Solido 2T");

	cpu.addComponente(ventilador)
		.addComponente(disipador);
	tv.addComponente(gpu)
		.addComponente(gpuRam)
		.addComponente(gpuRam2)
		.addComponente(gpuVentilador);
	placaMadre.addComponente(cpu)
		.addComponente(tv)
		.addComponente(ram)
		.addComponente(ssd);
	pc.addComponente(fuentePoder)
		.addComponente(placaMadre)
		.addComponente(new Componente("Teclado"))
		.addComponente(new Componente("Mouse"));

	//metodoRecursividad(pc, 0);
	metodoRecursividadJava8(pc, 0).forEach(
		c -> System.out.println("\t".repeat(c.getNivel()) + c.getNombre()));

  }

  public static void metodoRecursividad(Componente c, int nivel) {
	System.out.println("\t".repeat(nivel) + c.getNombre());
	if (c.tieneHijos()){
	  for (Componente hijo: c.getHijos()){
		metodoRecursividad(hijo, nivel + 1);
	  }
	}
  }

  public static Stream<Componente> metodoRecursividadJava8(Componente c, int nivel) {

	c.setNivel(nivel);
	return Stream.concat(Stream.of(c),
		c.getHijos().stream().flatMap(hijo -> metodoRecursividadJava8(hijo, nivel + 1)));

  }

}
