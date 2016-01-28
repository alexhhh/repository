/**
 * 
 */
package com.intern.alexx.configuration;
import java.util.*;
import org.springframework.context.annotation.ComponentScan;
 
import org.springframework.jdbc.datasource.DriverManagerDataSource;
 

/**
 * @author malex
 *
 */

public class Configuration {

	 
		
	 
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	//dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	//dataSource.setUrl("jdbc:hsqldb:hsql://localhost:3306");
	//dataSource.setUsername("root");
	//dataSource.setPassword("root");
}
