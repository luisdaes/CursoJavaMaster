package JavaAnnotation.models;

import java.time.LocalDate;

import JavaAnnotation.JsonAttribute;

public class Product {

  @JsonAttribute(name = "Description", capitalize = true)
  String name;

  @JsonAttribute
  Long value;

  LocalDate date;

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }

  public Long getValue() {
	return value;
  }

  public void setValue(Long value) {
	this.value = value;
  }

  public LocalDate getDate() {
	return date;
  }

  public void setDate(LocalDate date) {
	this.date = date;
  }
}
