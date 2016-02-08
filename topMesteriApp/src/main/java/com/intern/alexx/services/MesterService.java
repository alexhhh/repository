/**
 * 
 */
package com.intern.alexx.services;

import java.util.Collection;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.intern.alexx.model.Mester;
import com.intern.alexx.model.MesterSearchCriteria;
import com.intern.alexx.services.impl.MyPage;;

/**
 * @author malex
 *
 */
public interface MesterService {

	
	Page<Mester> searchMester(MesterSearchCriteria searchCriteria);
	
	//TODO add crud methods 
	
}
