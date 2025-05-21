package org.cursoJavaMaster.repositorio;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.cursoJavaMaster.modelo.Categoria;
import org.cursoJavaMaster.modelo.Producto;
import org.cursoJavaMaster.util.ConexionBaseDatos;

public class ProductoRepositorioImpl implements Repositorio<Producto> {

  private Connection getConnection() throws SQLException {
	return ConexionBaseDatos.getInstance();
  }


  private Connection getConnectionSinglenton() throws SQLException {
	return ConexionBaseDatos.getInstanceSinglenton();
  }


  @Override
  public List<Producto> listar() {

	String sql = "SELECT pro.*, cat.nombre AS categoria FROM productos pro " +
		" INNER JOIN categorias cat ON (pro.categoria_id = cat.id_categoria)";
	List<Producto> productos = new ArrayList<>();
	try (Connection connection = getConnectionSinglenton();
		Statement statement = connection.createStatement();
		//ResultSet resultSet = statement.executeQuery("select * from productos")) {
		ResultSet resultSet = statement.executeQuery(sql)) {

	  while (resultSet.next()) {
		Producto producto = crearProducto(resultSet);
		productos.add(producto);
	  }

	} catch (SQLException e) {
	  e.printStackTrace();
	}
	return productos;
  }

  @Override
  public Producto buscarPorId(Long id) {

	String sql = "select pro.*, cat.nombre AS categoria FROM productos pro "+
		"INNER JOIN categorias cat ON (pro.categoria_id = cat.id_categoria) where id_producto=?";

	Producto producto = null;
	try (Connection connection = getConnectionSinglenton();
		PreparedStatement pStatement = connection.prepareStatement(sql)) {

	  pStatement.setLong(1, id);
	  try (ResultSet resultSet = pStatement.executeQuery()) {
		if (resultSet.next()) {
		  producto = crearProducto(resultSet);
		}
	  }
	} catch (SQLException e) {
	  e.printStackTrace();
	}
	return producto;
  }

  @Override
  public void guardar(Producto producto) {

	String sql = null;
	if (producto.getIdProducto() != null && producto.getIdProducto() > 0) {
	  sql = "UPDATE productos SET nombre=?,  precio=?, categoria_id=? WHERE id_producto = ?";
	} else {
	  sql = "INSERT INTO productos (nombre, precio, categoria_id, fecha_registro) VALUES (?,?,?,?)";
	}

	try (Connection connection = getConnectionSinglenton();
		PreparedStatement pStatement = connection.prepareStatement(sql)) {

	  pStatement.setString(1, producto.getNombre());
	  pStatement.setLong(2, producto.getPrecio());
	  pStatement.setLong(3, producto.getCategoria().getId_categoria());

	  if (producto.getIdProducto() != null && producto.getIdProducto() > 0) {
		pStatement.setLong(4, producto.getIdProducto());
	  } else {
		pStatement.setDate(4, new Date(producto.getFechaRegistro().getTime()));
	  }
	  pStatement.executeUpdate();

	} catch (SQLException e) {
	  e.printStackTrace();
	}
  }

  @Override
  public void eliminar(Long idProducto) {

	try (PreparedStatement pStatement = getConnection()
		.prepareStatement("DELETE FROM productos WHERE id_producto = ?")) {

	  pStatement.setLong(1, idProducto);
	  pStatement.executeUpdate();

	}catch (SQLException e){
	  e.printStackTrace();
	}

  }

  private Producto crearProducto(ResultSet resultSet) throws SQLException {
	Producto producto = new Producto();
	producto.setIdProducto(resultSet.getLong("id_producto"));
	producto.setNombre(resultSet.getString("nombre"));
	producto.setPrecio(resultSet.getLong("precio"));
	producto.setFechaRegistro(resultSet.getDate("fecha_registro"));

	Categoria categoria = new Categoria();
	categoria.setId_categoria(resultSet.getLong("categoria_id"));
	categoria.setNombre(resultSet.getString("categoria"));

	producto.setCategoria(categoria);
	return producto;
  }
}
