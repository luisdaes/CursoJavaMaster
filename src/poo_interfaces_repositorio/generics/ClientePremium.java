package poo_interfaces_repositorio.generics;

import java.util.Comparator;

import poo_interfaces_repositorio.repositorio.models.Cliente;

public class ClientePremium extends Cliente implements Comparator<ClientePremium> {
  public ClientePremium(String nombre, String apellido) {
	super(nombre, apellido);
  }

  @Override
  public int compare(ClientePremium o1, ClientePremium o2) {
	return 0;
  }
}
