package com.intern.alexx.repository;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.intern.alexx.model.Mester;

 

public class Main {

	 
		public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("appContext.xml");
		MesterRepository mersterRepository = (MesterRepository) context.getBean("mester");
		Mester mester = new Mester(2, "Bbb", "Baa", "ceva", "Cj");
		mersterRepository.insert(mester);
		 
		}
		 

}
