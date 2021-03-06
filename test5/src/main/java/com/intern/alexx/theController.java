/**
 * 
 */
package com.intern.alexx;

import java.awt.List;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.client.RestTemplate;

import com.gs.collections.api.list.primitive.IntList;

/**
 * @author malex
 *
 */
@Controller
public class theController implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(Application.class);
	// private String[] someValues = new String[10];
	private ArrayList<String> quotelist = new ArrayList<String>();
	boolean xx=false;
	
		
		
	public void run(String... strings) throws Exception {

		RestTemplate restTemplate = new RestTemplate();

		for (int i = 0; i < 10; i++) {
			Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
			log.info(quote.toString());
			quotelist.add(quote.getValue().getQuote());
			
			
		}
	}

	
	@RequestMapping("/Quote")
	public @ResponseBody ArrayList<String> showMeTheQuote() {
		return getQuotelist();
	}
	
	
	// re-run ?
	
	public ArrayList<String> getQuotelist() {
		return quotelist;
	}

	// /**
	// * @return the someValues
	// */
	// public String[] getSomeValues() {
	// return someValues;
	// }

}
