package org.cursoJavaMaster;

import java.util.Date;

import org.cursoJavaMaster.modelo.Categoria;
import org.cursoJavaMaster.modelo.Producto;
import org.cursoJavaMaster.repositorio.ProductoRepositorioImpl;
import org.cursoJavaMaster.repositorio.Repositorio;

public class EjemploJDBC_Pool {

  public static void main(String[] args) {

	Repositorio<Producto> productoRepo = new ProductoRepositorioImpl();

	System.out.println("-------listar-------");
	productoRepo.listar().forEach(System.out::println);

	System.out.println("-------eliminar-------");
	productoRepo.eliminar(10L);

	System.out.println("-------guardar-------");
	productoRepo.guardar(new Producto(null, "Diadema Logitech H390 USB", 50L,
		new Date(), new Categoria(3L)));

	System.out.println("-------listar-------");
	productoRepo.listar().forEach(System.out::println);

	System.out.println("-------buscarPorId-------");
	System.out.println(productoRepo.buscarPorId(11L));


  }
}
