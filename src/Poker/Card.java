package Poker;

public class Card implements Comparable<Card> {
	private String symbols;
	private char suit;
	private int rank;
	
	public Card(String cardText) {
		setupCard(cardText);
	}
	
	public void setupCard(String cardText) {
		int cardTextLength = cardText.length();
		this.suit = cardText.charAt(cardTextLength - 1);
		this.symbols = cardText.substring(0,cardTextLength - 1);
	}
	
	public String getSymbols() {
		return this.symbols;
	}
	
	public char getSuit() {
		return this.suit;
	}
	
	private int getCardRank() {
		switch(this.symbols){
			case "A":
				return 14;
			case "J":
				return 11;
			case "Q":
				return 12;
			case "K":
				return 13;
			default:
				return Integer.parseInt(this.symbols);
		}
	}

	@Override
	public int compareTo(Card otherCard) {
		// This function will get the card rank in number form and compare the rankings
		int currentCardRank = this.getCardRank();
		int otherCardRank = otherCard.getCardRank();
		return currentCardRank - otherCardRank;
	}
	
}
