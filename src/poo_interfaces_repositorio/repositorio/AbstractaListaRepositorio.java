package poo_interfaces_repositorio.repositorio;

import java.util.ArrayList;
import java.util.List;

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
  public T porId(Integer id) {
    T resultado = null;
    for (T cli: dataSource){
      if (cli.getId() != null && cli.getId().equals(id)){
        resultado =  cli;
        break;
      }
    }
	return resultado;
  }

  @Override
  public void crear(T t) {
    this.dataSource.add(t);
  }

  @Override
  public void eliminar(Integer id) {
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
