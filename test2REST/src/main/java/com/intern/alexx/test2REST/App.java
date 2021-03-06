package com.intern.alexx.test2REST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.web.context.WebApplicationContext;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan
@SpringBootApplication
public class App {

	@Bean
	MessageService mockMessageService() {
		return new MessageService() {
			public String getMessage() {
				// TODO Auto-generated method stub
				return "Sa vedem daca merge";
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		WebApplicationContext context = (WebApplicationContext) new AnnotationConfigApplicationContext(App.class);
		MessageServiceImp printer = context.getBean(MessageServiceImp.class);
		printer.PrintTheMessage();

	}
}
