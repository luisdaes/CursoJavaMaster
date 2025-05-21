package org.cursoJavaMaster.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos {

  private static final String URL =
	  "jdbc:mysql://localhost:3306/Curso_javamaster?serverTimezone=America/Bogota";
  private static final String USER = "root";
  private static final String PASSWORD = "mysql-25";
  private static Connection connection;

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
}
