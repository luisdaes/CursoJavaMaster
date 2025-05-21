package org.cursoJavaMaster;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import org.cursoJavaMaster.modelo.Categoria;
import org.cursoJavaMaster.modelo.Producto;
import org.cursoJavaMaster.repositorio.ProductoRepositorioImpl;
import org.cursoJavaMaster.repositorio.Repositorio;
import org.cursoJavaMaster.util.ConexionBaseDatos;

public class EjemploJDBC_Singlenton {

  public static void main(String[] args) {

	Repositorio<Producto> productoRepo = new ProductoRepositorioImpl();

	System.out.println("-------listar-------");
	productoRepo.listar().forEach(System.out::println);

	System.out.println("-------guardar-------");
	productoRepo.guardar(new Producto(null, "Yahama MT15 ABS", 7750L,
		new Date(), new Categoria(1L)));

	System.out.println("-------listar-------");
	productoRepo.listar().forEach(System.out::println);

	System.out.println("-------buscarPorId-------");
	System.out.println(productoRepo.buscarPorId(9L));

	System.out.println("-------eliminar-------");
	//productoRepo.eliminar(3L);

  }
}
