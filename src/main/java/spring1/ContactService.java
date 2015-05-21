package spring1;

//Creating a service because the controller isn't the only one to use the
//repository. I don't want everything to be so close.

//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class ContactService {

	@Autowired
	ContactRepository repo;
	

	@Transactional
	public Iterable<Contact> getAll() {
		Iterable<Contact> contacts = repo.findAll();

		return contacts;

	}

}
