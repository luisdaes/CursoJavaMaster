package poo_interfaces_repositorio.repositorio.lista;

import javax.sound.sampled.Port;
import java.util.ArrayList;
import java.util.List;

import poo_interfaces_repositorio.repositorio.AbstractaListaRepositorio;
import poo_interfaces_repositorio.repositorio.excepciones.LecturaAccesoDatoException;
import poo_interfaces_repositorio.repositorio.models.Cliente;
import poo_interfaces_repositorio.repositorio.models.DireccionEnum;
import poo_interfaces_repositorio.repositorio.models.Producto;

public class ProductoListaRepositorio extends AbstractaListaRepositorio<Producto> {
  @Override
  public void editar(Producto producto) throws LecturaAccesoDatoException {
	Producto p = porId(producto.getId());
	p.setDescripcion(producto.getDescripcion());
	p.setPrecio(producto.getPrecio());
  }

  @Override
  public List<Producto> listar(String campo, DireccionEnum direccion) {
	List<Producto> listaProdutos = new ArrayList<>(this.dataSource);
	this.dataSource.sort((a, b) -> {
	  int resultado = 0;
	  if (direccion == DireccionEnum.ASC) {
		resultado = ordenar(a, b, campo);
	  } else if (direccion == DireccionEnum.DESC) {
		resultado = ordenar(b, a, campo);
	  }
	  return resultado;
	});
	return listaProdutos;
  }

  public int ordenar(Producto a, Producto b, String campo) {
	int resultado = 0;
	switch (campo) {
	  case "id" -> resultado = a.getId().compareTo(b.getId());
	  case "descripcion" -> resultado = a.getDescripcion().compareTo(b.getDescripcion());
	  case "precio" -> resultado = a.getPrecio().compareTo(b.getPrecio());
	}
	return resultado;
  }
}
