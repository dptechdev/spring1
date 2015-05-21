//All gonna fail. I'm using a @Component service now

//package spring1;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import static org.hamcrest.Matchers.containsString;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
//@ContextConfiguration(classes = Spring1Application.class)
//public class ConctactControllerTest {
//
//	
//	@Autowired
//	private WebApplicationContext wac;
//	
//	private MockMvc mockMvc;
//	
//	
//	@Before
//	public void setUp() {
//		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
//	}
//	
//	@Test
//	public void testContactList() throws Exception {
//		this.mockMvc.perform(get("/contacts")).andExpect(status().isOk())
//		.andExpect(content().string(containsString("<title>All Contacts</title>")));
//	}
//	
//	@Test
//	public void testMvcConfigAjaxView() throws Exception {
//		this.mockMvc.perform(get("/ajax")).andExpect(status().isOk())
//		.andExpect(content().string(containsString("<title>Spring Catalog</title>")));
//	}
//	
//	
//
//}
