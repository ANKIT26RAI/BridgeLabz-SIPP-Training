package com.studyopedia.Strings.Level3;
import java.util.Scanner;
public class CardGame {
	

	    public static String[] initializeDeck() {
	        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
	        String[] ranks = {
	            "2", "3", "4", "5", "6", "7", "8", "9", "10",
	            "Jack", "Queen", "King", "Ace"
	        };

	        int numOfCards = suits.length * ranks.length;
	        String[] deck = new String[numOfCards];
	        int index = 0;

	        for (String suit : suits) {
	            for (String rank : ranks) {
	                deck[index++] = rank + " of " + suit;
	            }
	        }

	        return deck;
	    }

	    public static void shuffleDeck(String[] deck) {
	        int n = deck.length;
	        for (int i = 0; i < n; i++) {
	            int randomCardNumber = i + (int) (Math.random() * (n - i));
	            String temp = deck[i];
	            deck[i] = deck[randomCardNumber];
	            deck[randomCardNumber] = temp;
	        }
	    }

	    public static String[][] distributeCards(String[] deck, int nCards, int nPlayers) {
	        if (nCards * nPlayers > deck.length) {
	            System.out.println("Not enough cards to distribute.");
	            return null;
	        }

	        String[][] players = new String[nPlayers][nCards];
	        int cardIndex = 0;
	        for (int i = 0; i < nPlayers; i++) {
	            for (int j = 0; j < nCards; j++) {
	                players[i][j] = deck[cardIndex++];
	            }
	        }

	        return players;
	    }

	    // Print players and their cards
	    public static void printPlayerCards(String[][] players) {
	        if (players == null) return;
	        for (int i = 0; i < players.length; i++) {
	            System.out.println("Player " + (i + 1) + " has:");
	            for (String card : players[i]) {
	                System.out.println("  " + card);
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of players: ");
	        int x = sc.nextInt();

	        System.out.print("Enter number of cards per player: ");
	        int n = sc.nextInt();

	        String[] deck = initializeDeck();
	        shuffleDeck(deck);
	        String[][] players = distributeCards(deck, n, x);
	        printPlayerCards(players);
	    }
	
}
