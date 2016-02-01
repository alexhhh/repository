/**
 * 
 */
package com.intern.alexx.services;

import java.util.Collection;

import com.intern.alexx.model.Mester;

/**
 * @author malex
 *
 */
public interface MesterService {

	Collection<Mester> searchMester(Mester mester, int pageSize, int pageNumber);
 
	
}
