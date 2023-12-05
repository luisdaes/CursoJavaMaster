package poo_interfaces_repositorio.repositorio;

import java.util.List;

import poo_interfaces_repositorio.models.Cliente;
import poo_interfaces_repositorio.models.DireccionEnum;

public interface OrdenableRepositorio {
  List<Cliente> listar(String campo, DireccionEnum direccion);

  default int ordenar(Cliente a, Cliente b, String campo) {
    int resultado = 0;
    switch (campo) {
      case "id" -> resultado = a.getId().compareTo(b.getId());
      case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
      case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
    }
    return resultado;
  }
}
