package org.cursoJavaMaster.repositorio;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface Repositorio <T> {

  void setConn(Connection con);

  List<T> listar() throws SQLException;

  T buscarPorId(Long id) throws SQLException;

  T guardar(T t) throws SQLException;

  void eliminar(Long t) throws SQLException;

}
