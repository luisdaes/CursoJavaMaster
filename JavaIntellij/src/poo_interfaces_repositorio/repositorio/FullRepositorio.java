package poo_interfaces_repositorio.repositorio;

public interface FullRepositorio<T>
	extends OrdenableRepositorio<T>, PaginableRepositorio<T>, CrudRepositorio<T>, ContableRepositorio {


}
