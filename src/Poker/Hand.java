package Poker;

public class Hand {
	public Card[] cards;
	
	public Hand(Card[] cards) {
		this.cards = cards;
	}
	
	public String getBestHand() {
		return null;
	}
	
	public boolean hasFlush() {
		char suit = this.cards[0].getSuit();
		for(int i = 1; i < cards.length; i++) {
			if(suit != cards[i].getSuit()) {
				return false;
			}
		}
		return true;
	}
}
