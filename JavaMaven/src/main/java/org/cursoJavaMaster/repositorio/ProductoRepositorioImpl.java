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


  private Connection connection;

  private Connection getConnection() throws SQLException {
	return ConexionBaseDatos.getInstance();
  }

  private Connection getConnectionSinglenton() throws SQLException {
	return ConexionBaseDatos.getInstanceSinglenton();
  }

  private Connection getConnectionPool() throws SQLException {
	return ConexionBaseDatos.getPoolConnection();
  }

  public ProductoRepositorioImpl() {
  }

  public ProductoRepositorioImpl(Connection connection) {
	this.connection = connection;
  }

  public void setConn(Connection connection) {
	this.connection = connection;
  }

  public Connection getConn(){
	return connection;
  }

  @Override
  public List<Producto> listar() throws SQLException {

	String sql = "SELECT pro.*, cat.nombre AS categoria FROM productos pro " +
		" INNER JOIN categorias cat ON (pro.categoria_id = cat.id_categoria)";
	List<Producto> productos = new ArrayList<>();
	try (Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql)) {

	  while (resultSet.next()) {
		productos.add(crearProducto(resultSet));
	  }

	}
	return productos;
  }

  @Override
  public Producto buscarPorId(Long id) throws SQLException {

	String sql = "select pro.*, cat.nombre AS categoria FROM productos pro "+
		"INNER JOIN categorias cat ON (pro.categoria_id = cat.id_categoria) where id_producto=?";

	Producto producto = null;
	try (PreparedStatement pStatement = connection.prepareStatement(sql)) {

	  pStatement.setLong(1, id);
	  try (ResultSet resultSet = pStatement.executeQuery()) {
		if (resultSet.next()) {
		  producto = crearProducto(resultSet);
		}
	  }
	}
	return producto;
  }

  @Override
  public Producto guardar(Producto producto) throws SQLException {

	String sql = null;
	if (producto.getIdProducto() != null && producto.getIdProducto() > 0) {
	  sql = "UPDATE productos SET nombre=?,  precio=?, categoria_id=?, sku=? WHERE id_producto = ?";
	} else {
	  sql = "INSERT INTO productos (nombre, precio, categoria_id, sku, fecha_registro) VALUES (?,?,?,?,?)";
	}

	try (PreparedStatement pStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

	  pStatement.setString(1, producto.getNombre());
	  pStatement.setLong(2, producto.getPrecio());
	  pStatement.setLong(3, producto.getCategoria().getIdCategoria());
	  pStatement.setString(4, producto.getSku());

	  if (producto.getIdProducto() != null && producto.getIdProducto() > 0) {
		pStatement.setLong(5, producto.getIdProducto());
	  } else {
		pStatement.setDate(5, new Date(producto.getFechaRegistro().getTime()));
	  }

	  pStatement.executeUpdate();

	  if (producto.getIdProducto() == null){
		try (ResultSet resultSet = pStatement.getGeneratedKeys()) {
		  if (resultSet.next()) {
			producto.setIdProducto(resultSet.getLong(1));
		  }
		}
	  }

	  return producto;
	}
  }

  @Override
  public void eliminar(Long idProducto) throws SQLException {

	String sql = "DELETE FROM productos WHERE id_producto = ?";
	try (PreparedStatement pStatement = connection.prepareStatement(sql)) {

	  pStatement.setLong(1, idProducto);
	  pStatement.executeUpdate();

	}

  }

  private Producto crearProducto(ResultSet resultSet) throws SQLException {
	Producto producto = new Producto();
	producto.setIdProducto(resultSet.getLong("id_producto"));
	producto.setNombre(resultSet.getString("nombre"));
	producto.setPrecio(resultSet.getLong("precio"));
	producto.setFechaRegistro(resultSet.getDate("fecha_registro"));

	Categoria categoria = new Categoria();
	categoria.setIdCategoria(resultSet.getLong("categoria_id"));
	categoria.setNombre(resultSet.getString("categoria"));

	producto.setCategoria(categoria);
	producto.setSku(resultSet.getString("sku"));
	return producto;
  }
}
