package game.colors.deck.cards.manager;

import gae.colors.deck.cards.logger.CardLogger;
import game.colors.deck.cards.player.CardPlayersVO;
import game.colors.deck.cards.round.CardDeckAction;

public class CardsManager {

	static CardPlayersVO cardPlayersVO;
	public static CardLogger cardLogger = new CardLogger();
	public static void main(String[] args) {
		cardPlayersVO = new CardPlayersVO();
		CardDeckAction.dogetCardDeck(cardPlayersVO);
		cardLogger.info(cardPlayersVO.getCard());
	}

}
