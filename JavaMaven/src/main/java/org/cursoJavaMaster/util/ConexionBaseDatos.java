package org.cursoJavaMaster.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public class ConexionBaseDatos {

  private static final String URL =
	  "jdbc:mysql://localhost:3306/Curso_javamaster?serverTimezone=America/Bogota";
  private static final String USER = "root";
  private static final String PASSWORD = "mysql-25";
  private static Connection connection;

  private static BasicDataSource pool;

  /**
   * Método que crea la única instancia para conexión a BD
   **/
  public static Connection getInstance() throws SQLException {
	if (connection == null){
	  connection = DriverManager.getConnection(URL, USER, PASSWORD);
	}
	return connection;
  }

  public static Connection getInstanceSinglenton() throws SQLException {
	return connection = DriverManager.getConnection(URL, USER, PASSWORD);
  }

  /**
   * Método que crea la única instancia para conexión a BD - pool
   **/
  public static BasicDataSource getPoolInstance() throws SQLException {
	if (pool == null){
	  pool = new BasicDataSource();
	  //pool.setDriverClassName("com.mysql.jdbc.Driver");
	  pool.setUrl(URL);
	  pool.setUsername(USER);
	  pool.setPassword(PASSWORD);
	  pool.setInitialSize(5);
	  pool.setMinIdle(5);
	  pool.setMaxIdle(10);
	  pool.setMaxTotal(10);
	  //pool.setMaxOpenPreparedStatements(10);
	}
	return pool;
  }

  public static Connection getPoolConnection() throws SQLException {
	return getPoolInstance().getConnection();
  }
}
