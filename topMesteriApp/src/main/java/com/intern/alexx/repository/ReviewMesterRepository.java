/**
 * 
 */
package com.intern.alexx.repository;


import com.intern.alexx.model.Client;
import com.intern.alexx.model.Mester;
import com.intern.alexx.model.ReviewMester;
import com.intern.alexx.repository.impl.MesterSearchCriteria;
 

/**
 * @author malex
 *
 */
public interface ReviewMesterRepository {
	
	  void insert(Client client, Mester mester,ReviewMester reviewMester);
	  void update(Client client, Mester mester, ReviewMester reviewMester);
	  void delete(ReviewMester reviewMester);
	  ReviewMester getBy(MesterSearchCriteria searchCriteria);

}
 