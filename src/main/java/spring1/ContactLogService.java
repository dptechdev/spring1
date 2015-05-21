package spring1;


import java.io.FileNotFoundException;


import java.io.FileOutputStream;
import java.io.PrintStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;


@Service
public class ContactLogService { 

	final String LOGFILE = "contact-log.txt";
	
	@Autowired
	ContactService contactService;
	
	//@Scheduled(fixedDelay=5000)
	public void logAll()  {
	 Iterable<Contact> contactsToLog = contactService.getAll();
	
	 
	 
		 for (Contact contact : contactsToLog) {
			LogAllDetails(contact, LOGFILE);
			System.out.println("Passing Job Off..LogAllDetails INIT[+OK]");
		 }
	 
	}
	
	protected void LogAllDetails(Contact contact, final String logFile) {
		PrintStream out;
		try {
			out = new PrintStream(new FileOutputStream(logFile));
			out.println("**************************\n");	//Don't want to use StringBuilder. Why another class?
			out.println("LOG ALL CONTACTS:\n");
			out.println("Name: " + contact.getName() + "\n");
			out.println("Telephone: " + contact.getTelephone() + "\n");
			out.println("Address: " + contact.getAddress() + "\n");
			out.println("**************************\n");
			
			out.close();
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		}
		
		
	}
	 
}
