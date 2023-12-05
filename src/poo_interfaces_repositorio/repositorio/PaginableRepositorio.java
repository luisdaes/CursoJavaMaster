package poo_interfaces_repositorio.repositorio;

import java.util.List;

import poo_interfaces_repositorio.models.Cliente;

public interface PaginableRepositorio {
  List<Cliente> listar(int desde, int hasta);
}
