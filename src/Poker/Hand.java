package Poker;

import java.util.ArrayList;
import java.util.Collections;

public class Hand {
	public ArrayList<Card> cards;
	
	public Hand(ArrayList<Card> cards) {
		this.cards = cards;
	}
	
	public String getBestHand() {
		return null;
	}
	
	public boolean hasFlush() {
		char suit = this.cards.get(0).getSuit();
		for(Card card : cards) {
			if(suit != card.getSuit()) {
				return false;
			}
		}
		return true;
	}
	
	public boolean hasStraight() {
		Collections.sort(cards);
		Card lowestCard = cards.get(0);
		for(int i = 1; i < cards.size() - 1; i++) {
			Card nextCard = cards.get(i);
			if(nextCard.getRank() - lowestCard.getRank() != i) {
				return false;
			}
		}
		return true;
	}
}
