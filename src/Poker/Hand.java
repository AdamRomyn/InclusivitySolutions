package Poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Hand {
	public ArrayList<Card> cards;
	public ArrayList<Integer> groups;
	
	public Hand(ArrayList<Card> cards) {
		this.cards = cards;
		this.groups = getAllPairs();
	}
	
	public String getBestHand() {
		int groupSize;
		if(this.groups.size() == 1) {
			groupSize = this.groups.get(0);
			if(groupSize > 3) {
				System.out.println(groupSize + " of a Kind");
			}
		}
	}
	
	public boolean hasFiveOfAKind() {
		if(this.groups.size() == 1 && this.groups.get(0) == 5) {
			return true;
		}
		return false;
	}
	
	public boolean hasFourOfAKind() {
		if(this.groups.size() == 1 && this.groups.get(0) == 4) {
			return true;
		}
		return false;
	}
	
	public boolean hasFullHouse() {
		if(this.groups.size() == 2 && (this.groups.get(0) == 3 || this.groups.get(1) == 3)) {
			return true;
		}
		return false;
	}
	
	public boolean hasThreeOfAKind() {
		if(this.groups.size() == 1 && this.groups.get(0) == 3) {
			return true;
		}
		return false;
	}
	
	public boolean hasTwoPair() {
		if(this.groups.size() == 2 && this.groups.get(0) == 2 && this.groups.get(0) == 2) {
			return true;
		}
		return false;
	}
	
	public boolean hasOnePair() {
		if(this.groups.size() == 1 && this.groups.get(0) == 2) {
			return true;
		}
		return false;
	}
	
	public Card getHighestCard() {
		Collections.sort(this.cards);
		return this.cards.get(this.cards.size() - 1);
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
	
	private ArrayList<Integer> getAllPairs() {
		//Create a dictionary of cards based on the card symbol and how many cards of that symbol exist
		Map<String,Integer> groups = new HashMap<String,Integer>();
		for(Card card : cards) {
			if(!groups.containsKey(card.getSymbols())) {
				groups.put(card.getSymbols(), 1);
			} else {
				int count = groups.get(card.getSymbols());
				groups.replace(card.getSymbols(), count + 1);
			}
		}
		
		// Only add the groups that are 2 or more cards into the return array.
		ArrayList<Integer> finalGroups = new ArrayList<Integer>();
		for (Map.Entry<String, Integer> entry : groups.entrySet()) {
			int amountOfCardsInGroup = entry.getValue();
			if(amountOfCardsInGroup > 1) {
				finalGroups.add(amountOfCardsInGroup);
			}
		}
		Collections.sort(finalGroups);
		return finalGroups;
	}
}
