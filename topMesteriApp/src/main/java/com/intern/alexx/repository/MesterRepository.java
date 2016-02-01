/**
 * 
 */
package com.intern.alexx.repository;
import com.intern.alexx.model.Mester;
/**
 * @author malex
 *
 */
public interface MesterRepository {

	  void insert(Mester mester);
	  void update(Mester mester);
	  void delete(Mester mester);
	  Mester getById(Integer id);
	 
	
}
