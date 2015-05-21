//Null pointer exception

package spring1;

import static org.junit.Assert.assertNotNull;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public class JSONMapperTest {

//	@Autowired
//	private ContactRepository testContactRepo;
//	
//	
//	@Before
//	public void setUp() {
//		
//		testContactRepo.deleteAll();
//		Contact contactToTest = new Contact("Derek", "848-848-8484", "123 Address");
//		testContactRepo.save(contactToTest);
//		
//	}
//	
//	@Test
//	public void testJSONMapper() {
//		JSONMapper<Contact> testjsonMapper = new JSONMapper<Contact>();
//		Iterable<Contact> contacts = testContactRepo.findAll();
//		ResponseEntity<Map<String, Iterable<Contact>>> JSONOutput = testjsonMapper.Serialize("contacts", contacts);
//		assertNotNull(JSONOutput);
//	}

}
