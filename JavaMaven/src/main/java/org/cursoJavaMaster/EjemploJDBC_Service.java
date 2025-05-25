package org.cursoJavaMaster;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import org.cursoJavaMaster.modelo.Categoria;
import org.cursoJavaMaster.modelo.Producto;
import org.cursoJavaMaster.repositorio.CategoriaRepositorioImpl;
import org.cursoJavaMaster.repositorio.ProductoRepositorioImpl;
import org.cursoJavaMaster.repositorio.Repositorio;
import org.cursoJavaMaster.servicio.CatalogoService;
import org.cursoJavaMaster.servicio.Servicio;
import org.cursoJavaMaster.util.ConexionBaseDatos;

public class EjemploJDBC_Service {

  public static void main(String[] args) throws SQLException {


	//Servicios
	Servicio servicio = new CatalogoService();

	System.out.println("-------LISTA DE CATEGORIAS-------");
	servicio.listarCategoria().forEach(System.out::println);

	System.out.println("-------GUARDAR CATEGORIA-------");
	Categoria categoria = new Categoria();
	categoria.setNombre("Entretenimiento");
	servicio.guardarCategoria(categoria);
	System.out.println("-------Categoria guardada con éxito: " + categoria.getIdCategoria());

	System.out.println("-------NUEVA LISTA DE CATEGORIAS-------");
	servicio.listarCategoria().forEach(System.out::println);

	System.out.println("-------LISTA DE PRODUCTOS-------");
	servicio.listarProducto().forEach(System.out::println);

	System.out.println("-------GUARDAR PRODUCTO-------");
	Producto producto = new Producto();
	producto.setNombre("Pelicula de super héroes");
	producto.setPrecio(15L);
	producto.setFechaRegistro(new Date());
	producto.setCategoria(new Categoria(categoria.getIdCategoria()));
	producto.setSku("SKU-24");
	servicio.guardarProducto(producto);
	System.out.println("-------Producto guardado con éxito: " + producto.getIdProducto());

	System.out.println("-------NUEVA LISTA DE PRODUCTOS-------");
	servicio.listarProducto().forEach(System.out::println);

	servicio.guardarProductoConCategoria(producto, categoria);


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
