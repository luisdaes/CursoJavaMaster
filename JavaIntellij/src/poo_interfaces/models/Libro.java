package poo_interfaces.models;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{

  private Persona autor;
  private String titulo;
  private GeneroEnum genero;
  private List<Imprimible> paginas;

  public Libro(Persona autor, String titulo, GeneroEnum genero) {
	this.autor = autor;
	this.titulo = titulo;
	this.genero = genero;
	this.paginas = new ArrayList<>();
  }

  public Libro addPagina(Imprimible pagina){
	paginas.add(pagina);
	return this;
  }

  @Override
  public String imprimir(){
	StringBuilder sb = new StringBuilder("Titulo: ");
	sb.append(titulo).append("\n")
		.append("Autor: ").append(this.autor.toString()).append("\n")
		.append("Genero: ").append(genero).append("\n");
	for (Imprimible pag: this.paginas){
	  sb.append(pag.imprimir()).append("\n");
	}
	return sb.toString();
  }
}
