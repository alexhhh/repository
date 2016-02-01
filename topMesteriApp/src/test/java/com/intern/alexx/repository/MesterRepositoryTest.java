package com.intern.alexx.repository;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.intern.alexx.model.Mester;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/appContext.xml")
public class MesterRepositoryTest {

	@Autowired
	private MesterRepository mesterRepository;

	@Test
	public void canInsertMesterIntoDB() {

		Mester mester = createMester();
		mesterRepository.insert(mester);
		Mester dbMester = mesterRepository.getById(22);
		assertNotNull(dbMester);
		assertEquals(mester.getLocation(), dbMester.getLocation());

	}

	private Mester createMester() {

		Mester mester = new Mester();
		
		mester.setFirstName("Ion");
		mester.setLastName("Pop");
		mester.setLocation("Cluj");
		return mester;
	}
	
	@Test
	public void canDeleteMesterFromDB(){
		
		Mester dbMester = mesterRepository.getById(28);
		assertNotNull(dbMester);
		mesterRepository.delete(dbMester);
		
		
	}
	
	@After
	public void verify(){

	}
	
}
