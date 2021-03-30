package Services;

public class CardServiceimpl {

	
	@Service
	public class CardServiceimpl implements CardService{
		
		@Autowired
		private CardRepo cardRepo;
		
		@Override
		public Caed addCard(Card card) throws CoustomException{
			
			try {
				String askedCardMunber= askCardNumber(card.getCardNumber);
				Card cardReturn =cardRepo.findById(card.getId()).orElse
						() -> new REsoursceNotFoundException("card not found");
						card.setCardNumber(askedCardNumber);
						terurn cardRepo.save(card);
			} catch(Exception e) {
				throw new CustomException(e.getMessage());
			}
		}
		
		// FOR SHORTING EXPIRY DATE
		
		
		@Override
		public List<Card> getCardList() throw CustomException{
			try {
				List<Card> cardlist = cardRepo.findAll();
				Collections.sort(cardlist);
				return cardlist;
			} catch (Exception e) {
				throws new CustomException(e.gerMessage());
			}
		}
		
		
		// FOR REPLACING NUMBER WITH X;
		
		public static String askrdCardNumber(String cardNumber , String ask) {
			int index=0;
			StringBuilder askedNumber= new StringBuilder();
			for(int i=0;i<=ask.length(); i++) {
				char c =ask.charAt(i);
				if(c=='#') {
					askedNumber.append(cardNumber.charAt(index));
					index++;
				}else if(c=='x') {
					askedNumber.append(c);
					index++;
				} else {
					askedNumber.append(c);
				}
			}
		}
	return askedNumber.toString();
}
