package poo_interfaces_repositorio.repositorio;

import java.util.List;

import poo_interfaces_repositorio.repositorio.excepciones.AccesoDatosException;
import poo_interfaces_repositorio.repositorio.excepciones.EscrituraAccesoDatoException;
import poo_interfaces_repositorio.repositorio.excepciones.LecturaAccesoDatoException;

public interface CrudRepositorio<T> {

  List<T> listar();
  T porId(Integer id) throws AccesoDatosException;
  void crear(T objeto) throws EscrituraAccesoDatoException;
  void eliminar(Integer id) throws AccesoDatosException;
  void editar(T objeto) throws LecturaAccesoDatoException;
}
