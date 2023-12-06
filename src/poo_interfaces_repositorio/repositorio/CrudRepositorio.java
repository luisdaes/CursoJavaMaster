package poo_interfaces_repositorio.repositorio;

import java.util.List;

public interface CrudRepositorio<T> {

  List<T> listar();
  T porId(Integer id);
  void crear(T objeto);
  void eliminar(Integer id);
  void editar(T objeto);
}
