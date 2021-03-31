package ru.kirillch.springdata.entity;

import javax.persistence.*;

@Entity
public class People {

    @Id
    @GeneratedValue
    private int id;

    private String firstName;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    public People() {
    }

    public People(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "\nPeople [id=" + id + ", firstName=" + firstName + ", address=" + address + "]";
	}
	
}