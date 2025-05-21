package org.javamaster;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import org.cursoJavaMaster.modelo.Producto;
import org.cursoJavaMaster.repositorio.ProductoRepositorioImpl;
import org.cursoJavaMaster.repositorio.Repositorio;
import org.cursoJavaMaster.util.ConexionBaseDatos;

public class EjemploJDBC {

  public static void main(String[] args) {


	//Ejemplo 1
	/*
	try (Connection connection = ConexionBaseDatos.getInstance();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from productos")) {

	  while (resultSet.next()) {
		System.out.print(resultSet.getInt("idProducto") + " | ");
		System.out.print(resultSet.getString("nombre") + " | ");
		System.out.print(resultSet.getInt("precio") + " | ");
		System.out.println(resultSet.getDate("fecha_producto"));
	  }
	} catch (SQLException e) {
	  e.printStackTrace();
	}*/

	try (Connection connection = ConexionBaseDatos.getInstance()) {

	  Repositorio<Producto> productoRepo = new ProductoRepositorioImpl();

	  System.out.println("-------guardar-------");
	  productoRepo.guardar(new Producto(6L, "Mini Macintosh M3", 500L, new Date()));

	  /*productoRepo.listar().forEach(producto -> {
		System.out.println(producto.getNombre() + " | " + producto.getPrecio());
	  });*/
	  System.out.println("-------listar-------");
	  productoRepo.listar().forEach(System.out::println);

	  System.out.println("-------buscarPorId-------");
	  System.out.println(productoRepo.buscarPorId(2L));

	  System.out.println("-------eliminar-------");
	  //productoRepo.eliminar(6L);


	} catch (SQLException e) {
	  throw new RuntimeException(e);
	}
  }
}
