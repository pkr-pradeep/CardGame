package game.colors.deck.cards.manager;

import java.util.List;

import gae.colors.deck.cards.logger.CardLogger;
import game.colors.deck.cards.player.CardPlayersVO;
import game.colors.deck.cards.round.CardDeckAction;

public class CardsManager {

	static CardPlayersVO cardPlayersVO;
	public static CardLogger cardLogger = new CardLogger();
	public static void main(String[] args) {
		cardPlayersVO = new CardPlayersVO();
		List<String> cardDeck = null;
		try {
			 cardDeck = CardDeckAction.dogetCardDeck(cardPlayersVO);
		} catch (Exception e){
			cardLogger.error(e.getMessage(), e);
		}
		String message = CardDeckAction.doGenerateMessage();
		cardLogger.info(message + "" +cardPlayersVO.getCard());
		List<String> shuffledCard = CardDeckAction.doGetShuffled(cardDeck, cardPlayersVO);
		cardLogger.info(message + "" +shuffledCard);
		String colorCard = CardDeckAction.doGetColorCard();
		cardLogger.info(message + "" +colorCard);
		cardLogger.info("color");
		
	}

}
