package ru.site.dictionary.rest.api.onetoone;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private Long address_id;
    private String addressPeople;

    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
    private Users users;
    
    public Address(){
    }

    public Address(String addressPeople) {
        this.addressPeople = addressPeople;
    }
    
    public Users getUser() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}
	
    public Long getAddress_id() {
        return address_id;
    }
    
    public void setAddress_id(Long address_id) {
        this.address_id = address_id;
    }
    
    public String getAddressPeople() {
        return addressPeople;
    }
    
    public void setAddressPeople(String addressPeople) {
        this.addressPeople = addressPeople;
    }
    
    @Override
	public String toString() {
		return "\nPassport [address_id=" + address_id + ", addressPeople=" + addressPeople + "]";
	}
    
}