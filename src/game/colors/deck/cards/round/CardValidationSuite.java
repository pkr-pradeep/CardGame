package game.colors.deck.cards.round;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import game.colors.deck.cards.player.CardPlayersVO;

public class CardValidationSuite {

	static Logger logger;
	
	public static void main(String[] args) {
		
	}
	
	public static String validateDistributedCards(CardPlayersVO cardPlayersVO) {
		Map<String, List<String>> detailCards = cardPlayersVO.getCards();
		for(Map.Entry<String, List<String>> cardDeckForAPlayer : detailCards.entrySet()){
			logger.info("=============================");
			logger.info(cardDeckForAPlayer.getKey());
			logger.info("=============================");
			for(String singleCard : cardDeckForAPlayer.getValue()){
				logger.info(singleCard);
			}
		}
		return "false";
	}
	
}
