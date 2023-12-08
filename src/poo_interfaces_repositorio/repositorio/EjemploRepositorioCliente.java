package poo_interfaces_repositorio.repositorio;

import java.util.List;

import poo_interfaces_repositorio.repositorio.excepciones.AccesoDatosException;
import poo_interfaces_repositorio.repositorio.excepciones.LecturaAccesoDatoException;
import poo_interfaces_repositorio.repositorio.models.Cliente;
import poo_interfaces_repositorio.repositorio.models.DireccionEnum;
import poo_interfaces_repositorio.repositorio.lista.ClienteListaRepositorio;

public class EjemploRepositorioCliente {
  public static void main(String[] args) {

	try {
	  FullRepositorio<Cliente> repo = new ClienteListaRepositorio();
	  repo.crear(new Cliente("LuisDa", "Escorcia"));
	  repo.crear(new Cliente("Davide", "Avila"));
	  repo.crear(new Cliente("JesusDa", "Julio"));

	  System.out.println("----------------LISTA-------------");
	  List<Cliente> clientes = repo.listar();
	  clientes.forEach(System.out::println);

	  System.out.println("----------------PAGINAS-------------");
	  List<Cliente> paginas = ((PaginableRepositorio) repo).listar(1, 2);
	  paginas.forEach(System.out::println);

	  System.out.println("----------------ORDENAR-------------");
	  List<Cliente> ordenCliente =
		  ((OrdenableRepositorio) repo).listar("apellido", DireccionEnum.ASC);
	  for (Cliente cli : ordenCliente) {
		System.out.println(cli);
	  }

	  System.out.println("----------------EDITAR CLIENTE-------------");
	  Cliente clienteActualizar = new Cliente("LuisEn", "Beltran");
	  clienteActualizar.setId(2);
	  repo.editar(clienteActualizar);
	  Cliente nuevo = repo.porId(2);
	  System.out.println(nuevo);

	  System.out.println("----------------ELIMINAR CLIENTE-------------");
	  repo.eliminar(2);
	  repo.listar().forEach(System.out::println);
	  //((OrdenableRepositorio) repo).listar("apellido", DireccionEnum.ASC).forEach(System
	  // .out::println);

	  System.out.println("----------------TOTAL REPOSITORIO-------------");
	  System.out.println("Total: " + ((ClienteListaRepositorio) repo).total());
	} catch (LecturaAccesoDatoException le) {
	  System.out.println(le.getMessage());
	  le.printStackTrace();
	} catch (AccesoDatosException ae) {
	  System.out.println(ae.getMessage());
	  ae.printStackTrace();
	}

  }
}
