package STREAM.MODELS;

public class User {

  private String name;
  private String lastName;
  private Integer id;
  private Facture facture;

  public Facture getFacture() {
	return facture;
  }

  public void setFacture(Facture facture) {
	this.facture = facture;
  }

  public Integer getId() {
	return id;
  }

  public void setId(Integer id) {
	this.id = id;
  }

  public User(String name, String lastName) {
	this.name = name;
	this.lastName = lastName;
  }

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }

  public String getLastName() {
	return lastName;
  }

  public void setLastName(String lastName) {
	this.lastName = lastName;
  }

  public Facture addFacture(Facture facture) {
	return facture;
  }

}
