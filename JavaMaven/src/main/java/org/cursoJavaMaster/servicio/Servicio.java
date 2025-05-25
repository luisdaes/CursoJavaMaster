package org.cursoJavaMaster.servicio;

import java.sql.SQLException;
import java.util.List;

import org.cursoJavaMaster.modelo.Categoria;
import org.cursoJavaMaster.modelo.Producto;

public interface Servicio {

  List<Producto> listarProducto() throws SQLException;

  Producto guardarProducto(Producto producto) throws SQLException;

  Producto buscarProductoPorId(Long idProducto) throws SQLException;

  void eliminarProducto(Long idProducto) throws SQLException;

  List<Categoria> listarCategoria() throws SQLException;

  Categoria buscarCategoriaPorId(Long idCategoria) throws SQLException;

  Categoria guardarCategoria(Categoria categoria) throws SQLException;

  void eliminarCategoria(Long idCategoria) throws SQLException;

  void guardarProductoConCategoria(Producto producto, Categoria categoria) throws SQLException;

}
