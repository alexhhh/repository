package com.intern.alexx.services.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.intern.alexx.model.Mester;
import com.intern.alexx.repository.MesterRepository;


public class MyPage {

	private List<Mester> contentPage ;
	private int pageSize;
	private int pageNumber;
	
	 
	
	public MyPage(List<Mester> contentPage, int pageSize, int pageNumber ){
		this.contentPage=contentPage;
		this.pageNumber=pageNumber;
		this.pageSize=pageSize;
	}
	
	

	
	public List <?> getPage(List<Mester> contentMesteri) {
		contentPage = contentMesteri;
		int index= pageSize*(pageNumber-1);
		int i=0;
		
		Iterator<Mester> it = contentPage.iterator();
		
		while (i<index && it.hasNext()){
			it.next();
			it.remove();
			i++;
		}
		while (it.hasNext() && i<index+pageSize){
			it.next();
			i++;
		}
		while(it.hasNext()){
			it.next();
			it.remove();
		}
		
 
		return contentPage;
	}

	public MyPage getPreviousPage() {
		
		return null;
	}

	
	public MyPage getNextpage() {
		 
		return null;
	}

}
