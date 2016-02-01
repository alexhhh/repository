/**
 * 
 */
package com.intern.alexx.services.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import com.intern.alexx.model.Mester;
import com.intern.alexx.repository.MesterRepository;
import com.intern.alexx.services.MesterService;

/**
 * @author malex
 *
 */
@Component
public class MesterServiceImp implements MesterService {

	@Autowired
	private MesterRepository mesterRepository;

	@Override
	public Collection<Mester> searchMester(Mester mester, int pageSize, int pageNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
