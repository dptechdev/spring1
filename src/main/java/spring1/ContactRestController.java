package spring1;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactRestController {

	@Autowired
	private ContactRepository repo;

	private JSONMapper<Contact> jsonmap;

	public ContactRestController() {
		this.jsonmap = new JSONMapper<Contact>();
	}

	@RequestMapping(value = "/api/contacts", produces = { MediaType.APPLICATION_JSON_VALUE }, method = RequestMethod.GET)
	public Iterable<Contact> getAllContacts() {

		Iterable<Contact> contacts = repo.findAll();
		//return jsonmap.Serialize("contacts", contacts); Ember Data needs {contacts: [...]}
		return contacts;
	}

	@RequestMapping(value = "/api/contacts/{contactId}", produces = { MediaType.APPLICATION_JSON_VALUE }, method = RequestMethod.GET)
	public ResponseEntity<Contact> getContact(@PathVariable Long contactId) {
		Contact contact = repo.findOne(contactId);
		return new ResponseEntity<Contact>(contact, HttpStatus.OK);
	}

	@RequestMapping(value = "/api/contacts/{contactId}", produces = { MediaType.APPLICATION_JSON_VALUE }, method = RequestMethod.PUT)
	public ResponseEntity<Contact> updateContact(@PathVariable Long contactId,
			@Valid Contact contact) {
		repo.save(contact);
		return new ResponseEntity<Contact>(contact, HttpStatus.ACCEPTED);
	}

	@RequestMapping(value = "/api/contacts/{contactId}", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> deleteContact(@PathVariable Long contactId) {
		Contact contactToDelete = repo.findOne(contactId);
		repo.delete(contactToDelete);
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
	}

}