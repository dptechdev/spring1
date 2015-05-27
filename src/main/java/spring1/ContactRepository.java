package spring1;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
	
	//This single interface serves as the contract and takes care of the 
	//basic CRUD implementation. No more IMPL's!
	
	//Customize the repo with specific methods for looking up Entities
	//if you want to add your own functionality.
	
	public Contact findByName(String name);
	public Contact findByAddress(String address);

}
