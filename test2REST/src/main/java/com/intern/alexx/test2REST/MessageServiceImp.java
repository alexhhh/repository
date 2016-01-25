package com.intern.alexx.test2REST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageServiceImp {
	
	final private MessageService message ;
	
	@Autowired
	public MessageServiceImp(MessageService message){
		this.message=message;		
	}
	
	public void PrintTheMessage()
	{
		System.out.println(this.message.getMessage());	
	}
	
}
