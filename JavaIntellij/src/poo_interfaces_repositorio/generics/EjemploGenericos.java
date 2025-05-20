package poo_interfaces_repositorio.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import poo_interfaces_repositorio.repositorio.models.Cliente;


public class EjemploGenericos {
  public static void main(String[] args) {

	List<Cliente> clientes = new ArrayList<>();
	clientes.add(new Cliente("LuisDa", "Escorcia"));
	Cliente luisCliente = clientes.iterator().next();

	//Cliente generico
	Cliente[] clienteArreglo = {new Cliente("JesusDa", "Julio"),
		new Cliente("Davide", "Escorcia")};

	Integer[] enteroArreglo =  {1, 2, 3, 4};


	//usando el metodo generico para convertir un arregle a lista
	List<Cliente> clienteLista = fromArrayToList(clienteArreglo);
	List<Integer> enterosLista = fromArrayToList(enteroArreglo);

	clienteLista.forEach(System.out::println);
	enterosLista.forEach(System.out::println);

	//
	List<String> nombres = fromArrayToList(new String[]
		{"LuisDa", "JesusDa", "Dee", "Lucho"}, enteroArreglo);

	nombres.forEach(System.out::println);

	//implementamos el metodo generico para cliente
	List<ClientePremium> clientePremiumsLista = fromArrayToList(new ClientePremium[]
		{new ClientePremium("Davide", "Escorcia")});

	imprimirClientes(clientePremiumsLista);


	//Comparar argumentos
	System.out.println("Maximo de 4, 6, 8 es: " + maximo(4, 6, 8));
	System.out.println("Maximo de LuisDa, Dee, JesusDa es: " + maximo("LuisDa", "Dee", "JesusDa"));
  }

  public static <T> List<T> fromArrayToList(T[] t){
	return Arrays.asList(t);
  }
  public static <T extends Number> List<T> fromArrayToList(T[] t){
	return Arrays.asList(t);
  }

  public static <T extends Cliente & Comparator<T>> List<T> fromArrayToList(T[] t){
	return Arrays.asList(t);
  }

  public static <T, G> List<T> fromArrayToList(T[] t, G[] g){
	for (G elemento: g){
	  System.out.println(elemento);
	}
	return Arrays.asList(t);
  }

  public static void imprimirClientes(List<? extends Cliente> clientes){
	clientes.forEach(System.out::println);
  }

  public static <T extends Comparable<T>> T maximo(T a, T b, T c){
	T max = a;
	if (b.compareTo(max) > 0){
	  max = b;
	}
	if (c.compareTo(max) > 0){
	  max = c;
	}
	return max;
  }
}
