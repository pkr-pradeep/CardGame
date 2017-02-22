package game.colors.deck.cards.category;

/**
 * 
 * @author pkrpr
 * <class> ECardCategory </class>
 * <return> card category and category color</return>
 */
public enum ECardCategory {

	/**
	 * spades (♠)
	 */
	SPADE("black","S"),
	/**
	 * diamonds (♦)
	 */
	DIAMOND("red","D"),
	/**
	 * clubs (♣)
	 */
	CLUB("black","C"),
	/**
	 *  hearts (♥)
	 */
	HEART("red","H"),
	/**
	 *  joker
	 */
	JOKER("NC","Jr");
	
	
	String categoryColorCode;
	String categoryShortCode;
	
	ECardCategory(String categoryColorCode, String categoryShortCode) {
		this.categoryColorCode = categoryColorCode;
		this.categoryShortCode = categoryShortCode;
	}
}
