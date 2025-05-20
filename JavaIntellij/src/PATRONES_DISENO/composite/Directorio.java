package PATRONES_DISENO.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Directorio extends Componente{

  private List<Componente> hijos;

  public Directorio(String nombre) {
	super(nombre);
	this.hijos = new ArrayList<>();
  }

  public Componente addComponente(Componente componente){
	hijos.add(componente);
	return this;
  }

  public void removerComponente(Componente componente){
	hijos.remove(componente);
  }

  @Override
  public String mostrar(int nivel) {

	StringBuilder sb = new StringBuilder("\t".repeat(nivel));
	sb.append(nombre)
		.append("/")
		.append("\n");
	for (Componente hijo: this.hijos){
	  sb.append(hijo.mostrar(nivel+1));
	  if (hijo instanceof Archivo){
		sb.append("\n");
	  }
	}
	return sb.toString();
  }

  @Override
  public boolean buscar(String nombre) {

	if (this.nombre.equalsIgnoreCase(nombre)) {
	  return true;
	}

	/*for (Componente hijo : this.hijos) {
	  if (hijo.buscar(nombre)) {
		return true;
	  }
	}
	return false;	*/

	return hijos.stream().anyMatch(h -> h.buscar(nombre));
  }
}
