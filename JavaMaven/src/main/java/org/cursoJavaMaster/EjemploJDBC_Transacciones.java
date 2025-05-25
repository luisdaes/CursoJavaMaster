package org.cursoJavaMaster;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import org.cursoJavaMaster.modelo.Categoria;
import org.cursoJavaMaster.modelo.Producto;
import org.cursoJavaMaster.repositorio.CategoriaRepositorioImpl;
import org.cursoJavaMaster.repositorio.ProductoRepositorioImpl;
import org.cursoJavaMaster.repositorio.Repositorio;
import org.cursoJavaMaster.util.ConexionBaseDatos;

public class EjemploJDBC_Transacciones {

  public static void main(String[] args) throws SQLException {

	try (Connection connection = ConexionBaseDatos.getInstance()) {

	  if (connection.getAutoCommit()) {
		connection.setAutoCommit(false);
	  }
	  try {

		//Creaciones de categoria en repositorio
		Repositorio<Categoria> categoriaRepo = new CategoriaRepositorioImpl(connection);
		System.out.println("-------CATEGORIAS-------");
		System.out.println("-------listar-------");
		categoriaRepo.listar().forEach(System.out::println);

		System.out.println("-------guardar-------");

		Categoria categoria = new Categoria();
		categoria.setNombre("Educación");
		categoriaRepo.guardar(categoria);

		System.out.println("-------guardado con éxito: "+categoria.getIdCategoria()+"-------");

		System.out.println("-------listar-------");

		categoriaRepo.listar().forEach(System.out::println);

		//Creaciones de productos en repositorio
		Repositorio<Producto> productoRepo = new ProductoRepositorioImpl(connection);
		System.out.println("-------PRODUCTOS-------");
		System.out.println("-------listar-------");
		productoRepo.listar().forEach(System.out::println);

		System.out.println("-------guardar-------");

		Producto producto = new Producto();
		producto.setNombre("Curso de JavaMaster Udemy");
		producto.setPrecio(25L);
		producto.setFechaRegistro(new Date());
		producto.setCategoria(new Categoria(categoria.getIdCategoria()));
		producto.setSku("SKU-25");
		productoRepo.guardar(producto);

		System.out.println("-------guardado con éxito: "+producto.getIdProducto()+"-------");

		System.out.println("-------listar-------");
		productoRepo.listar().forEach(System.out::println);

		System.out.println("-------actualizar-------");

		productoRepo.guardar(new Producto(producto.getIdProducto(), "Curso Spring Framework y Spring Boot Udemy",
			56L, new Date(), new Categoria(categoria.getIdCategoria()), "SKU-LD11"));

		System.out.println("-------actualizado con éxito: "+producto.getIdProducto()+"-------");

		System.out.println("-------eliminar-------");
		//productoRepo.eliminar(6L);

		System.out.println("-------buscarPorId-------");
		//System.out.println(productoRepo.buscarPorId(2L));

		connection.commit();
	  } catch (SQLException e) {
		connection.rollback();
		e.printStackTrace();
	  }

	}

	// Categorías principales del sistema

	// 1. Deportes
	// - Fútbol, Baloncesto, Tenis, Running, eSports

	// 2. Computación
	// - Hardware, Software, Redes, Programación, Seguridad

	// 3. Tecnología
	// - Gadgets, IoT, Realidad Virtual, Automatización, Robótica

	// 4. Salud y Bienestar
	// - Nutrición, Ejercicio, Salud mental, Medicina

	// 5. Educación
	// - Cursos, Plataformas, Tutoriales, Certificaciones

	// 6. Entretenimiento
	// - Películas, Series, Videojuegos, Música, Streaming

	// 7. Ciencia
	// - Física, Biología, Astronomía, Medio Ambiente

	// 8. Negocios y Finanzas
	// - Emprendimiento, Inversión, Fintech, Economía

	// 9. Arte y Cultura
	// - Literatura, Pintura, Cine, Historia del arte

	// 10. Viajes y Turismo
	// - Destinos, Hoteles, Reseñas, Consejos

	// 11. Hogar y Jardín
	// - Decoración, Mantenimiento, Jardinería

	// 12. Moda y Belleza
	// - Estilo, Cuidado personal, Tendencias

	// 13. Automóviles y Transporte
	// - Coches, Motos, Tecnología automotriz

	// 14. Gastronomía
	// - Recetas, Restaurantes, Ingredientes

	// 15. Política y Sociedad
	// - Gobierno, Leyes, Opinión, Derechos humanos

	// 16. Psicología y Desarrollo Personal
	// - Motivación, Productividad, Inteligencia emocional

  }
}
