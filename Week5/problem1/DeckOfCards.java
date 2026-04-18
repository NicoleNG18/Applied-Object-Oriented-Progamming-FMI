package problem1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;

public class DeckOfCards {
    private Card deck[];
    private int currentCard;
    private final int NUMBER_OF_CARDS = 52;
    private Random randomNumbers;

    private int[] faceCounters;
    private int[] suitCounters;
    private Card[] handOfCards;

    public DeckOfCards() {
        faceCounters = new int[Card.faces.length];
        suitCounters = new int[Card.suits.length];
        handOfCards = new Card[5];

        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;
        randomNumbers = new Random();

        for (int count = 0; count < deck.length; count++)
            deck[count] =
                    new Card(count % 13, count / 13);
    }

    public void dealHand() {
        for (int i = 0; i < handOfCards.length; i++) {
            handOfCards[i] = dealCard();
        }
    }

    public void printHandOfCards() {
        Arrays.stream(handOfCards)
                .filter(Objects::nonNull)
                .forEach(System.out::println);
    }

    public void makeStatistics() {
        Arrays.fill(faceCounters, 0);
        Arrays.fill(suitCounters, 0);
        dealHand();
        for (Card card : handOfCards) {
            if (card != null) {
                ++faceCounters[card.getFace()];
                ++suitCounters[card.getSuit()];
            }
        }
    }

    public boolean hasCardsSameFace(int cardnums) {
        if (cardnums > 1 && cardnums < 5) {
            return Arrays.stream(faceCounters)
                    .anyMatch(count -> count == cardnums);
        }
        return false;
    }

    public boolean hasCardsSameSuit(int cardnums) {
        if (cardnums > 1 && cardnums < 6) {
            for (int suitCounter : suitCounters) {
                if (suitCounter == cardnums) return true;
            }
        }
        return false;
    }

    public void shuffle() {
        Collections.shuffle(Arrays.asList(deck));
    }

    public Card dealCard() {
        return currentCard < deck.length ? deck[currentCard++] : null;
    }
}