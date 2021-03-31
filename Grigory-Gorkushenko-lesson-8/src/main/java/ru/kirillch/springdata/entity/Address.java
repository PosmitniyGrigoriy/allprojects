package ru.kirillch.springdata.entity;


import javax.persistence.*;

@Entity
public class Address {

	@Id
	@GeneratedValue
	private int id;
	private String address;

	@OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
	private People people;
	
	public Address() {
	}

	public Address(String address) {
		this.address = address;
	}

	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "\nAddress [id=" + id + ", address=" + address + "]";
	}
	
}
