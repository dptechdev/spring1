package spring1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Contact {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String telephone;
	private String address;
	
	protected Contact() {} //hibernate complained
	
	public Contact(String name, String telephone, String address) {
		this.name = name;
		this.telephone = telephone;
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	public String getName() {
		return name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	

	
	

}
