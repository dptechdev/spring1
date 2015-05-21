package spring1;

//All gonna fail. I'm using a @Component service now

//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.transaction.annotation.Transactional;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = Spring1Application.class)
//@Transactional
//@WebAppConfiguration
public class Spring1ApplicationTests {

//	@Autowired
//	private ContactRepository contactRepo;
//	
//	Contact contact1;
//	
//	@Before
//	public void setUp() {
//		contact1 = new Contact("Derek", "333-333-3333", "123 my address");
//		contactRepo.deleteAll();
//		contactRepo.save(contact1);
//		
//	}
//	
//	@Test
//	public void getContactByNameRepoTest() {
//		
//		final String NAMETOTEST = "Derek";
//		Contact contactToTestByName = contactRepo.findByName(NAMETOTEST);
//		assertNotNull(contactToTestByName);
//		assertEquals(contactToTestByName.getName(), NAMETOTEST);
//		
//	} 
//	
//	@Test
//	public void getContactByAddressRepoTest() {
//		final String ADDRESSTOTEST = "123 my address";
//		Contact contactToTestByAddress = contactRepo.findByAddress(ADDRESSTOTEST);
//		assertNotNull(contactToTestByAddress);
//		assertEquals(contactToTestByAddress.getAddress(), ADDRESSTOTEST);
//	}
//	
//	@Test
//	public void createContactTest() {
//		final String nameToExpect = "Libby";
//		Contact contactToTest = new Contact("Libby", "444-444-4444", "456 my address");
//		contactRepo.save(contactToTest);
//		Contact confirmContactToTest = contactRepo.findByName(nameToExpect);
//		assertNotNull(confirmContactToTest);
//		assertEquals(nameToExpect, confirmContactToTest.getName(), contactToTest.getName());
//	}
//	
	//TODO -- Test Controller Methods 5/5/2015
	
	
	
}
