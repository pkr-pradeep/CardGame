package game.colors.deck.cards.category;

import java.util.Arrays;
import java.util.List;
/**
 * 
 * @author pkrpr
 * <class> ECardDeck </class>
 * <return> card content of each category </return>
 */
public enum ECardDeck {
	/**
	 * SPADE is having 13 cards highest is 'A' then from 'K' to '2' in descending order
	 */
	SPADES(Arrays.asList("SP_A","SP_2","SP_3","SP_4","SP_5",
			"SP_6","SP_7","SP_8","SP_9","SP_10","SP_J","SP_Q","SP_K")),
	/**
	 * DIAMOND is having 13 cards highest is 'A' then from 'K' to '2' in descending order
	 */
	DIAMONDS(Arrays.asList("DI_A","DI_2","DI_3","DI_4","DI_5",
			"DI_6","DI_7","DI_8","DI_9","DI_10","DI_J","DI_Q","DI_K")),
	/**
	 * CLUB is having 13 cards highest is 'A' then from 'K' to '2' in descending order
	 */
	CLUBS(Arrays.asList("CL_A","CL_2","CL_3","CL_4","CL_5",
			"CL_6","CL_7","CL_8","CL_9","CL_10","CL_J","CL_Q","CL_K")),
	/**
	 * HEART is having 13 cards highest is 'A' then from 'K' to '2' in descending order
	 */
	HEARTS(Arrays.asList("HE_A","HE_2","HE_3","HE_4","HE_5",
			"HE_6","HE_7","HE_8","HE_9","HE_10","HE_J","HE_Q","HE_K")),
	/**
	 * JOCKER is the largest among all
	 */
	JOKER(Arrays.asList("JO"));
	/**
	 * <Object> deck </Object>
	 * <return> 13 cards for each category </return>
	 */
	public List<String> deck;
	
	/**
	 * 
	 * @param deck parameterized Constructor
	 */
	ECardDeck(List<String> deck) {
		this.deck = deck;
	}
}
