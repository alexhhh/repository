package comm.intern.alexx.test3REST;


import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
/**
 * Hello world!
 *
 */


@Configuration
@EnableWebMvc
@RestController
public class App 
{
protected RestTemplate restTemplate;
	
	 

	@RequestMapping("/hello/{name}")
	public String sayHi(@PathVariable String name){
		return "Neata "+ name;		
	}
	
}
