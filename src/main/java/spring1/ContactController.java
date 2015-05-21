package spring1;


import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
//@SessionAttributes("contact")
public class ContactController {	

	private ContactRepository contactRepo;
	
	private ContactLogService cLogger;
	
	@Autowired
	public ContactController(ContactRepository contactRepo, ContactLogService logService) {
		this.contactRepo = contactRepo;
		this.cLogger = logService;
	}
	
	@RequestMapping(value="/contacts", method=RequestMethod.GET)
	public String contacts(Map<String, Object> model) {
		Iterable<Contact> contacts = contactRepo.findAll();
		model.put("contacts", contacts);
		cLogger.logAll();
		return "contacts";
	}
	
	//@ModelAttribute("contact")
	
	@RequestMapping(value="/contacts/add", method=RequestMethod.POST)
	public String createContact(@Valid Contact contact, BindingResult result) {
		if(result.hasErrors()) {
			return "/contacts/add";
		}
		
		contactRepo.save(contact);
		return "redirect:contacts";
	}
	
	@RequestMapping(value="/contacts/add", method=RequestMethod.GET)
	public String newContact() {
		return "newContact";
	}
	
}
