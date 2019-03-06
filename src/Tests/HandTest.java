package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import Poker.Card;
import Poker.Hand;

public class HandTest {

	@Before
	public void before() {
	}

	@Test
	public void testFiveOfAKind() {
		Hand hand = createHand(new String[] {"AS","AD","AH","AC","AS"});
		assertTrue(hand.hasFiveOfAKind());
	}
	
	@Test
	public void testFourOfAKind() {
		Hand hand = createHand(new String[] {"AS","AD","AH","AC","10S"});
		assertTrue(hand.hasFourOfAKind());
	}
	
	@Test
	public void testThreeOfAKind() {
		Hand hand = createHand(new String[] {"AS","AD","AH","JS","10S"});
		assertTrue(hand.hasThreeOfAKind());
	}
	
	@Test
	public void testTwoPair() {
		Hand hand = createHand(new String[] {"AS","AD","JH","JS","10S"});
		assertTrue(hand.hasTwoPair());
	}
	
	@Test
	public void testOnePair() {
		Hand hand = createHand(new String[] {"5S","AD","AH","JS","10S"});
		assertTrue(hand.hasOnePair());
	}
	
	@Test
	public void testFlush() {
		Hand hand = createHand(new String[] {"5S","AS","KS","JS","10S"});
		assertTrue(hand.hasAFlush());
	}
	
	@Test
	public void testStright() {
		Hand hand = createHand(new String[] {"5S","6D","7H","9D","8D"});
		assertTrue(hand.hasAStraight());
	}
	
	@Test
	public void testStrightFlush() {
		Hand hand = createHand(new String[] {"5S","6S","7S","9S","8S"});
		assertTrue(hand.hasAStraight() && hand.hasAFlush());
	}
	
	@Test
	public void testHighCard() {
		Hand hand = createHand(new String[] {"5S","6S","7S","9S","8S"});
		assertEquals(hand.getHighestCard().getSymbols(),"9");
	}
	
	private Hand createHand(String[] cards) {
		ArrayList<Card> cardList = new ArrayList<Card>();
		for(int i = 0; i < cards.length; i++) {
			cardList.add(new Card(cards[i]));
		}
		return new Hand(cardList);
	}
	
	

}
