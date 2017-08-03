package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by amarendrakumar on 25/07/17.
 */
@Entity
public class Person {

  @Id
  @GeneratedValue
  private Long id;

  private String firstName;

  private String lastName;

  private String address;

  private Date dateOfBirth;

  public Person() {
  }

  public Person(String firstName, String lastName, String address, Date dateOfBirth) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.dateOfBirth = dateOfBirth;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Person person = (Person) o;

    if (id != null ? !id.equals(person.id) : person.id != null) return false;
    if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
    if (lastName != null ? !lastName.equals(person.lastName) : person.lastName != null) return false;
    if (address != null ? !address.equals(person.address) : person.address != null) return false;
    return dateOfBirth != null ? dateOfBirth.equals(person.dateOfBirth) : person.dateOfBirth == null;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
    result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
    result = 31 * result + (address != null ? address.hashCode() : 0);
    result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Person{" +
      "id=" + id +
      ", firstName='" + firstName + '\'' +
      ", lastName='" + lastName + '\'' +
      ", address='" + address + '\'' +
      ", dateOfBirth=" + dateOfBirth +
      '}';
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
}
