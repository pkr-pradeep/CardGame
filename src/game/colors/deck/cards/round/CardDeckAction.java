package game.colors.deck.cards.round;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.google.common.collect.Lists;

import gae.colors.deck.cards.logger.CardLogger;
import game.colors.deck.cards.category.ECardCategory;
import game.colors.deck.cards.category.ECardDeck;
import game.colors.deck.cards.manager.CardsManager;
import game.colors.deck.cards.player.CardPlayersVO;

public class CardDeckAction {

	static CardPlayersVO cardPlayersVO;
	public static CardLogger cardLogger = new CardLogger();
	
	public static String doGetColorCard(){
		List<ECardCategory> cardSuits = new ArrayList<>(Arrays.asList(ECardCategory.values()));
		cardSuits.remove(ECardCategory.JOKER);
		Collections.shuffle(cardSuits);
		return cardSuits.get(0).toString();
	}

	public static List<String> dogetCardDeck(CardPlayersVO cardPlayersVO){
		List<String> cardsDeck = new ArrayList<>();
		cardsDeck.addAll(ECardDeck.SPADES.deck);
		cardsDeck.addAll(ECardDeck.DIAMONDS.deck);
		cardsDeck.addAll(ECardDeck.HEARTS.deck);
		cardsDeck.addAll(ECardDeck.CLUBS.deck);
		cardsDeck.addAll(ECardDeck.JOKER.deck);
		cardsDeck.remove("SP_2");
		cardPlayersVO.setCard(cardsDeck);
		return cardsDeck;
	}

	public static List<String> doGetShuffled(List<String> cardDeck,CardPlayersVO cardPlayersVO) {
		if(!cardDeck.isEmpty())
			Collections.shuffle(cardDeck);
		cardPlayersVO.setCard(cardDeck);
		return cardDeck;
	}

	public static void doGetSubstitute(List<String> cardDeck, List<String> players) {
		List<List<String>> cardsForEachPlayer = Lists.partition(cardDeck, 13);

		Map<String, List<String>> substituteMap = new HashMap<>();
		for(List<String> cardsforEach : cardsForEachPlayer) {
			for(String playerName : players) {
				substituteMap.put(playerName, cardsforEach);
				break;
			}
		}
		cardPlayersVO.setCards(substituteMap);
	}

	public static void doGetPlayerList(){
		Properties prop = new Properties();
		InputStream input = null;
		List<String> playerList = new ArrayList<String>();
		
		try {
			input = CardsManager.class.getResourceAsStream("/game/colors/deck/cards/properties/playername.properties");
			prop.load(input);
			

			for (Map.Entry<Object, Object> entry : prop.entrySet())
			{
				playerList.add((String) entry.getValue());
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		cardPlayersVO.setPlayer(playerList);
	}
	
	public static String doGenerateMessage(){
		String fullClassName = Thread.currentThread().getStackTrace()[2].getClassName();
	    String className = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
	    String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
	    int lineNumber = Thread.currentThread().getStackTrace()[2].getLineNumber();
	    Date logGenerateDate = new Date();
	    System.out.println(fullClassName);
	    String message = className + ".java-" + methodName+"()"  + " : Line"+lineNumber + " : "+logGenerateDate+" >>";
	    return message;
	}
}
