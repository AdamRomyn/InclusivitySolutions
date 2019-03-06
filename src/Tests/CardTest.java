package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Poker.Card;

public class CardTest {
	private Card card1;
	private Card card2;
	
	@Before
	public void before() {
		card1 = new Card("AS");
		card2 = new Card("10S");
	}

	@Test
	public void testProperties() {
		assertTrue(this.card1.getSuit() == 'S');
		assertTrue(this.card1.getSuit() == this.card2.getSuit());
		assertTrue(this.card1.getSymbols().equals("A"));
		assertTrue(this.card2.getSymbols().equals("10"));
	}
	
	@Test
	public void testCompareTo() {
		assertEquals(this.card1,this.card1);
		assertEquals(this.card1.compareTo(this.card2),4);
		assertEquals(this.card2.compareTo(this.card1),-4);
	}

}
