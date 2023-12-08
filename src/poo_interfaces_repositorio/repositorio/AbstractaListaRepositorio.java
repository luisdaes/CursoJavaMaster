package poo_interfaces_repositorio.repositorio;

import java.util.ArrayList;
import java.util.List;

import poo_interfaces_repositorio.repositorio.excepciones.EscrituraAccesoDatoException;
import poo_interfaces_repositorio.repositorio.excepciones.LecturaAccesoDatoException;
import poo_interfaces_repositorio.repositorio.excepciones.RegistroDuplicadoAccesoDatoException;
import poo_interfaces_repositorio.repositorio.models.BaseEntity;

public abstract class AbstractaListaRepositorio<T extends BaseEntity> implements FullRepositorio<T>{

  protected List<T> dataSource;

  public AbstractaListaRepositorio(){
    this.dataSource = new ArrayList<>();
  }
  @Override
  public List<T> listar() {
	return dataSource;
  }

  @Override
  public T porId(Integer id) throws LecturaAccesoDatoException {
    //exepcion si es null el valor
    if (id == null || id <= 0){
      throw new LecturaAccesoDatoException("Id invalido, debe ser mayor a cero y distinto a null!");
    }

    T resultado = null;
    for (T cli: dataSource){
      if (cli.getId() != null && cli.getId().equals(id)){
        resultado =  cli;
        break;
      }
    }

    if(resultado == null){
      throw new LecturaAccesoDatoException("No existe el registro con ID: " + id);
    }
	return resultado;
  }

  @Override
  public void crear(T t) throws EscrituraAccesoDatoException {
    if (t == null) {
      throw new EscrituraAccesoDatoException("Error al insertar un objeto NULL");
    }
    if (this.dataSource.contains(t)) {
      throw new RegistroDuplicadoAccesoDatoException("Error al crear, el objeto con el ID: "
          + t.getId() + " ya existe en el repositorio");
    }
    this.dataSource.add(t);
  }

  @Override
  public void eliminar(Integer id) throws LecturaAccesoDatoException{
    this.dataSource.remove(this.porId(id));
  }

  @Override
  public List<T> listar(int desde, int hasta) {
    return dataSource.subList(desde, hasta);
  }

  @Override
  public int total() {
    return this.dataSource.size();
  }
}
