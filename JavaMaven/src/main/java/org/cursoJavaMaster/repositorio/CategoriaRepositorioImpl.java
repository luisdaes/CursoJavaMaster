package org.cursoJavaMaster.repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.cursoJavaMaster.modelo.Categoria;
public class CategoriaRepositorioImpl implements Repositorio<Categoria> {


  private Connection connection;

  public CategoriaRepositorioImpl() {
  }

  public CategoriaRepositorioImpl(Connection connection) {
	this.connection = connection;
  }

  public void setConn(Connection connection) {
	this.connection = connection;
  }

  public Connection getConn(){
	return connection;
  }

  @Override
  public List<Categoria> listar() throws SQLException {

	List<Categoria> categoria = new ArrayList<>();
	try (Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM categorias")) {

	  while (resultSet.next()) {
		categoria.add(crearCategoria(resultSet));
	  }
	}
	return categoria;
  }

  @Override
  public Categoria buscarPorId(Long idCategoria) throws SQLException {

	Categoria categoria = null;
	String sql = "SELECT * FROM categorias WHERE id_categoria = ?";

	try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
	  preparedStatement.setLong(1, idCategoria);

	  try (ResultSet resultSet = preparedStatement.executeQuery()) {
		if (resultSet.next()) {
		  categoria = crearCategoria(resultSet);
		}
	  }
	}
	return categoria;
  }

  @Override
  public Categoria guardar(Categoria categoria) throws SQLException {

	String sql = null;
	boolean actualizarCategoria =
		categoria.getIdCategoria() != null && categoria.getIdCategoria() > 0;

	if (actualizarCategoria) {
	  sql = "UPDATE categorias SET nombre = ? WHERE id_categoria = ?";
	} else {
	  sql = "INSERT INTO categorias (nombre) VALUES (?)";
	}
	try (PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

	  preparedStatement.setString(1, categoria.getNombre());
	  if (actualizarCategoria) {
		preparedStatement.setLong(2, categoria.getIdCategoria());
	  }
	  preparedStatement.executeUpdate();

	  if (categoria.getIdCategoria() == null) {
		try (ResultSet resultSet = preparedStatement.getGeneratedKeys()) {
		  if (resultSet.next()) {
			categoria.setIdCategoria(resultSet.getLong(1));
		  }
		}
	  }
	}
	return categoria;
  }

  @Override
  public void eliminar(Long t) throws SQLException {

  }

  private Categoria crearCategoria(ResultSet resultSet) throws SQLException {
	Categoria categoria = new Categoria();
	categoria.setIdCategoria(resultSet.getLong("id_categoria"));
	categoria.setNombre(resultSet.getString("nombre"));
	return categoria;
  }
}
