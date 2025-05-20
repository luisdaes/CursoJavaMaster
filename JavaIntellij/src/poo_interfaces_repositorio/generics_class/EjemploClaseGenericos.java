package poo_interfaces_repositorio.generics_class;

public class EjemploClaseGenericos {

  public static <T> void imprimirCamion(Camion<T> camion){
	System.out.println("instanceof-------------------------");
	for (T a : camion) {
	  if (a instanceof Animal){
	  System.out.println(((Animal)a).getNombre() + " tipo: " + ((Animal)a).getTipo());
	  }else if (a instanceof Maquinaria){
		System.out.println("Tipo maquina: " + ((Maquinaria)a).getTipo());
	  }else if (a instanceof Automovil){
		System.out.println("Marca del auto: " + ((Automovil)a).getMarca());
	  }
	}
  }

  public static void main(String[] args) {

	Camion<Animal> transCaballos = new Camion(5);
	transCaballos.add(new Animal("Peregrino", TipoAnimalEnum.CABALLO));
	transCaballos.add(new Animal("Grillo", TipoAnimalEnum.CABALLO));
	transCaballos.add(new Animal("Tunquen", TipoAnimalEnum.CABALLO));
	transCaballos.add(new Animal("Topocalma", TipoAnimalEnum.CABALLO));
	transCaballos.add(new Animal("longotoma", TipoAnimalEnum.CABALLO));

	/*for (Object o : transCaballos) {
	  Animal a = (Animal) o;
	  System.out.println(a.getNombre() + " tipo: " + a.getTipo());
	}*/

	System.out.println("------------ANIMAL-------------");
	for (Animal a : transCaballos) {
	  System.out.println(a.getNombre() + " tipo: " + a.getTipo());
	}

	imprimirCamion(transCaballos);

	Camion<Maquinaria> transMaquinas =  new Camion<>(3);
	transMaquinas.add(new Maquinaria("Bulldozer"));
	transMaquinas.add(new Maquinaria("Grua Horquilla"));
	transMaquinas.add(new Maquinaria("Perforadora"));

	System.out.println("------------MAQUINARIA-------------");
	for (Maquinaria m: transMaquinas){
	  System.out.println("Tipo maquina: " + m.getTipo());
	}
	imprimirCamion(transMaquinas);

	Camion<Automovil> transAutos = new Camion<>(3);
	transAutos.add(new Automovil("Toyota"));
	transAutos.add(new Automovil("Mazda"));
	transAutos.add(new Automovil("Chevrolet"));

	System.out.println("------------AUTOMOVILES-------------");
	for (Automovil a: transAutos){
	  System.out.println("Marca del auto: " + a.getMarca());
	}
	imprimirCamion(transAutos);
  }
}
