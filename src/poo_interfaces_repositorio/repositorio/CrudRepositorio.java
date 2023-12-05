package poo_interfaces_repositorio.repositorio;

import java.util.List;

import poo_interfaces_repositorio.models.Cliente;

public interface CrudRepositorio {

  List<Cliente> listar();
  Cliente porId(Integer id);
  void crear(Cliente cliente);
  void eliminar(Integer id);
  void editar(Cliente cliente);
}
