package comm.intern.alexx.test7;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Hello world!
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan
@RestController
public class App // implements WebApplicationInitializer 
{

	
	@RequestMapping("/hello/{name}")
	public String sayHi(@PathVariable String name){
		return "Neata "+ name;		
	}
		
	 @RequestMapping
	 public String helloWorld(Model model) {
	        model.addAttribute("message", "Hello Ticule!");
	        return "helloWorld";
	        
	 }      
//    public void onStartup(ServletContext container) {
//        ServletRegistration.Dynamic registration = container.addServlet("dispatcher", new String());
//        registration.setLoadOnStartup(1);
//        registration.addMapping("/hello/*");
//    }
	  
//	@RequestMapping(value = "/hello/{Cristi}", method = RequestMethod.GET)
//	public String sayHii(@PathVariable String name ){
//		
//		return "Cristi! Ba "+ name;		
//	}
//		
	
}