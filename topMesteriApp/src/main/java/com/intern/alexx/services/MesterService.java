/**
 * 
 */
package com.intern.alexx.services;

import java.util.Collection;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.intern.alexx.model.Mester;
import com.intern.alexx.repository.impl.MesterSearchCriteria;
import com.intern.alexx.services.impl.MyPage;;

/**
 * @author malex
 *
 */
public interface MesterService {

	Collection<Mester> searchMesterPage(Mester mester, int pageSize, int pageNumber);
	
	Collection<MyPage> searchMester(Mester mester, int pageSize, int pageNumber);
	Page<Mester> searchMester(MesterSearchCriteria searchCriteria);
	
	
	Page<Mester> returnAllMesteri(Pageable pageable);
}
