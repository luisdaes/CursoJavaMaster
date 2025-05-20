package PATRONES_DISENO.observer;

public class EjemploObserver2 {
  public static void main(String[] args) {

	UsuarioRepositorio repositorio = new UsuarioRepositorio();

	repositorio.addObserver((o, user) -> System.out.println("Enviando email al usuario " + user));
	repositorio.addObserver((o, user) -> System.out.println("Enviando email al administrador"));
	repositorio.addObserver((o, user) -> System.out.println("Registrando LOG de información de creación " + user + " gitnen logs"));
	repositorio.crearUsuario("Luisda");
  }
}
