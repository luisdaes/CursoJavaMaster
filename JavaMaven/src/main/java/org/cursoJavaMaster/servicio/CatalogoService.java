package org.cursoJavaMaster.servicio;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.cursoJavaMaster.modelo.Categoria;
import org.cursoJavaMaster.modelo.Producto;
import org.cursoJavaMaster.repositorio.CategoriaRepositorioImpl;
import org.cursoJavaMaster.repositorio.ProductoRepositorioImpl;
import org.cursoJavaMaster.repositorio.Repositorio;
import org.cursoJavaMaster.util.ConexionBaseDatos;

public class CatalogoService implements Servicio {

  private Repositorio<Producto> productoRepositorio;
  private Repositorio<Categoria> categoriaRepositorio;

  public CatalogoService() {
	this.productoRepositorio = new ProductoRepositorioImpl();
	this.categoriaRepositorio = new CategoriaRepositorioImpl();
  }

  @Override
  public List<Producto> listarProducto() throws SQLException {
	try (Connection conn = ConexionBaseDatos.getPoolConnection()) {
	  productoRepositorio.setConn(conn);
	  return productoRepositorio.listar();
	}
  }

  @Override
  public Producto guardarProducto(Producto producto) throws SQLException {
	try (Connection conn = ConexionBaseDatos.getPoolConnection()) {
	  productoRepositorio.setConn(conn);
	  if (conn.getAutoCommit()) {
		conn.setAutoCommit(false);
	  }
	  Producto nuevoProducto = null;
	  try {
		nuevoProducto = productoRepositorio.guardar(producto);
		conn.commit();
	  } catch (SQLException e) {
		conn.rollback();
		e.printStackTrace();
	  }
	  return nuevoProducto;
	}
  }

  @Override
  public Producto buscarProductoPorId(Long idProducto) throws SQLException {
	try (Connection conn = ConexionBaseDatos.getPoolConnection()) {
	  productoRepositorio.setConn(conn);
	  return productoRepositorio.buscarPorId(idProducto);
	}
  }

  @Override
  public void eliminarProducto(Long idProducto) throws SQLException {
	try (Connection conn = ConexionBaseDatos.getPoolConnection()) {
	  productoRepositorio.setConn(conn);
	  if (conn.getAutoCommit()) {
		conn.setAutoCommit(false);
	  }
	  try {
		productoRepositorio.eliminar(idProducto);
		conn.commit();
	  } catch (SQLException e) {
		conn.rollback();
		e.printStackTrace();
	  }
	}
  }

  @Override
  public List<Categoria> listarCategoria() throws SQLException {
	try (Connection conn = ConexionBaseDatos.getPoolConnection()) {
	  categoriaRepositorio.setConn(conn);
	  return categoriaRepositorio.listar();
	}
  }

  @Override
  public Categoria buscarCategoriaPorId(Long idCategoria) throws SQLException {
	try (Connection conn = ConexionBaseDatos.getPoolConnection()) {
	  categoriaRepositorio.setConn(conn);
	  return categoriaRepositorio.buscarPorId(idCategoria);
	}
  }

  @Override
  public Categoria guardarCategoria(Categoria categoria) throws SQLException {
	try (Connection conn = ConexionBaseDatos.getPoolConnection()) {
	  categoriaRepositorio.setConn(conn);
	  if (conn.getAutoCommit()) {
		conn.setAutoCommit(false);
	  }
	  Categoria nuevaCategoria = null;
	  try {
		nuevaCategoria = categoriaRepositorio.guardar(categoria);
		conn.commit();
	  } catch (SQLException e) {
		conn.rollback();
		e.printStackTrace();
	  }
	  return nuevaCategoria;
	}
  }

  @Override
  public void eliminarCategoria(Long idCategoria) throws SQLException {
	try (Connection conn = ConexionBaseDatos.getPoolConnection()) {
	  categoriaRepositorio.setConn(conn);
	  if (conn.getAutoCommit()) {
		conn.setAutoCommit(false);
	  }
	  try {
		categoriaRepositorio.eliminar(idCategoria);
		conn.commit();
	  } catch (SQLException e) {
		conn.rollback();
		e.printStackTrace();
	  }
	}

  }

  @Override
  public void guardarProductoConCategoria(Producto producto, Categoria categoria)
	  throws SQLException {
	try (Connection conn = ConexionBaseDatos.getPoolConnection()) {
	  productoRepositorio.setConn(conn);
	  categoriaRepositorio.setConn(conn);
	  if (conn.getAutoCommit()) {
		conn.setAutoCommit(false);
	  }

	  try {
		Categoria nuevaCategoria = categoriaRepositorio.guardar(categoria);
		producto.setCategoria(nuevaCategoria);
		productoRepositorio.guardar(producto);
		conn.commit();
	  } catch (SQLException e) {
		conn.rollback();
		e.printStackTrace();
	  }
	}

  }
}
