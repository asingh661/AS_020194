package card.services;

import java.util.List;

public class CaedServices {

	public interface Demo {
		
		Demo addCard(Demo card) throws Exception;
		
		List<Card> getCardList() throws Exception;	
		
	}
	
}
