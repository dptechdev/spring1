package spring1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.context.ApplicationContext;

//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.scheduling.annotation.EnableAsync;
//import org.springframework.scheduling.annotation.EnableScheduling;




@Configuration
@ComponentScan
@EnableAutoConfiguration(exclude = { JacksonAutoConfiguration.class })
//@EnableAsync
//@EnableScheduling
//@SpringBootApplication
public class Spring1Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Spring1Application.class, args);
        ContactRepository repo = ctx.getBean(ContactRepository.class);
        //ContactLogService logService = ctx.getBean(ContactLogService.class);
        
        
        Contact contact1 = new Contact("Derek", "939-939-8383", "123 Road");
        
        repo.save(contact1);
        
       
        
        //logService.logAll();
    }
    

    
   
  
    
}

