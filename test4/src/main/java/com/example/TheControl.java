package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class TheControl {

	@RequestMapping("/hi")
	 public @ResponseBody String salutaFrumos() {
		return (" Noh Serus !");
	}
}
