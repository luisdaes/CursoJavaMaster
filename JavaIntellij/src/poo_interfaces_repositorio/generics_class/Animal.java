package poo_interfaces_repositorio.generics_class;

public class Animal {

  private String nombre;
  private TipoAnimalEnum tipo;

  public Animal(String nombre, TipoAnimalEnum tipo) {
	this.nombre = nombre;
	this.tipo = tipo;
  }

  public String getNombre() {
	return nombre;
  }

  public TipoAnimalEnum getTipo() {
	return tipo;
  }
}
