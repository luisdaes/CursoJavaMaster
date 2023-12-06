package poo_interfaces_repositorio.repositorio.lista;

import java.util.ArrayList;
import java.util.List;

import poo_interfaces_repositorio.repositorio.models.Cliente;
import poo_interfaces_repositorio.repositorio.models.DireccionEnum;
import poo_interfaces_repositorio.repositorio.FullRepositorio;

public class ClienteListaRepositorio implements FullRepositorio<Cliente> {

  private List<Cliente> dataSource;

  public ClienteListaRepositorio(){
    this.dataSource = new ArrayList<>();
  }
  @Override
  public List<Cliente> listar() {
	return dataSource;
  }

  @Override
  public Cliente porId(Integer id) {
    Cliente resultado = null;
    for (Cliente cli: dataSource){
      if (cli.getId() != null && cli.getId().equals(id)){
        resultado =  cli;
        break;
      }
    }
	return resultado;
  }

  @Override
  public void crear(Cliente cliente) {
    this.dataSource.add(cliente);
  }

  @Override
  public void editar(Cliente cliente) {
    Cliente cli = this.porId(cliente.getId());
    cli.setNombre(cliente.getNombre());
    cli.setApellido(cliente.getApellido());
  }

  @Override
  public void eliminar(Integer id) {
    Cliente c = this.porId(id);
    this.dataSource.remove(c);
  }

  @Override
  public List<Cliente> listar(String campo, DireccionEnum direccion) {
    List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
    this.dataSource.sort((a, b) -> {
        int resultado = 0;
        if (direccion == DireccionEnum.ASC) {
          resultado = ordenar(a, b, campo);
        } else if (direccion == DireccionEnum.DESC) {
          resultado = ordenar(b, a, campo);
        }
        return resultado;
    });
    return listaOrdenada;
  }

  @Override
  public List<Cliente> listar(int desde, int hasta) {
    return dataSource.subList(desde, hasta);
  }

  @Override
  public int total() {
    return this.dataSource.size();
  }
}
