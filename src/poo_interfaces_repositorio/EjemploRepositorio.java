package poo_interfaces_repositorio;

import java.util.List;

import poo_interfaces_repositorio.models.Cliente;
import poo_interfaces_repositorio.models.DireccionEnum;
import poo_interfaces_repositorio.repositorio.ClienteListaRepositorio;
import poo_interfaces_repositorio.repositorio.CrudRepositorio;
import poo_interfaces_repositorio.repositorio.OrdenableRepositorio;
import poo_interfaces_repositorio.repositorio.PaginableRepositorio;

public class EjemploRepositorio {
  public static void main(String[] args) {

	CrudRepositorio repo = new ClienteListaRepositorio();
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
	List<Cliente> ordenCliente = ((OrdenableRepositorio) repo).listar("apellido", DireccionEnum.ASC);
	for (Cliente cli: ordenCliente){
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
	//((OrdenableRepositorio) repo).listar("apellido", DireccionEnum.ASC).forEach(System.out::println);

	System.out.println("----------------TOTAL REPOSITORIO-------------");
	System.out.println("Total: " + ((ClienteListaRepositorio) repo).total());

  }
}
