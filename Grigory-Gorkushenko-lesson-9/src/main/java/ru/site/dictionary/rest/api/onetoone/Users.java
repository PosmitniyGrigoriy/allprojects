package ru.site.dictionary.rest.api.onetoone;

import javax.persistence.*;

@Entity
public class Users {

    @Id
    @GeneratedValue
    private Long users_id;
    
    private String firstName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;
    
    public Users(){
    }

    public Users(String firstName) {
        this.firstName = firstName;
    }
    
    public Long getId() {
        return users_id;
    }
    
    public void setId(Long user_id) {
        this.users_id = user_id;
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
		return "User [users_id=" + users_id + ", firstName=" + firstName + ", address=" + address + "]";
	}
	
}