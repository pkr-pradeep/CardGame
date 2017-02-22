package game.colors.deck.cards.player;

import java.util.List;
import java.util.Map;

public class CardPlayersVO {

	private List<String> card;
	private List<String> player;
	private Map<String,List<String>> cards;

	
	public List<String> getCard() {
		return card;
	}

	public void setCard(List<String> card) {
		this.card = card;
	}

	public List<String> getPlayer() {
		return player;
	}

	public void setPlayer(List<String> player) {
		this.player = player;
	}

	public Map<String, List<String>> getCards() {
		return cards;
	}

	public void setCards(Map<String, List<String>> cards) {
		this.cards = cards;
	}
	
}
