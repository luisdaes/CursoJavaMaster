package poo_interfaces_repositorio.repositorio;

import java.util.List;

import poo_interfaces_repositorio.repositorio.excepciones.AccesoDatosException;
import poo_interfaces_repositorio.repositorio.excepciones.LecturaAccesoDatoException;
import poo_interfaces_repositorio.repositorio.lista.ProductoListaRepositorio;
import poo_interfaces_repositorio.repositorio.models.Cliente;
import poo_interfaces_repositorio.repositorio.models.DireccionEnum;
import poo_interfaces_repositorio.repositorio.models.Producto;

public class EjemploRepositorioProducto {

  public static void main(String[] args) {

	try {
	  FullRepositorio<Producto> repo = new ProductoListaRepositorio();
	  repo.crear(new Producto("mesa", 4.88));
	  repo.crear(new Producto("silla", 5.80));
	  repo.crear(new Producto("lampara", 8.98));
	  repo.crear(new Producto("notebook", 6.85));
	  Producto carro =  new Producto("Tesla", 100.8);


	  //Excepcion para null
	  //repo.crear(null);
	  //Excepcion para duplicados
	  repo.crear(carro);
	  repo.crear(carro);
	  List<Producto> productos = repo.listar();
	  productos.forEach(System.out::println);
	  System.out.println("Paginable::::::::::::");
	  List<Producto> paginable = repo.listar(1, 4);
	  paginable.forEach(System.out::println);

	  System.out.println("Ordenar::::::::::::::");
	  List<Producto> productoDesc = repo.listar("precio", DireccionEnum.DESC);
	  for (Producto p : productoDesc) {
		System.out.println(p);
	  }

	  System.out.println("Editar:::::::::::::::");
	  Producto producto = new Producto("teclado mecanico", 20000.98);
	  producto.setId(2);
	  repo.editar(producto);
	  Producto nuevo = repo.porId(2);
	  System.out.println(nuevo);
	  repo.listar("descripcion", DireccionEnum.ASC).forEach(System.out::println);

	  System.out.println("Eliminar:::::::::::::::");
	  repo.eliminar(40);
	  repo.listar().forEach(System.out::println);

	  System.out.println("Total:::::::::::::::::::");
	  System.out.println("Total de prodcutos: " + repo.total());
	} catch (LecturaAccesoDatoException le) {
	  System.out.println("Error de lectura: " + le.getMessage());
	  le.printStackTrace();
	} catch (AccesoDatosException ae) {
	  System.out.println("Error generico: " + ae.getMessage());
	  ae.printStackTrace();
	}
  }
}
