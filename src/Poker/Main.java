package Poker;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Hand
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five cards seperated by commas:");
		String handString = sc.nextLine().replaceAll(" ", "");
		String[] cardStrings = handString.split(",");
		Hand hand = new Hand(cardStrings);
		System.out.println(hand.getBestHand());
	}
}
