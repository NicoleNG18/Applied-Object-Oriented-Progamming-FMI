package problem1;

public class DeckOfCardsTest {
    static void main() {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();

        int batch = 0;
        while (batch < 56) {
            myDeckOfCards.makeStatistics();
            batch += 5;
            myDeckOfCards.printHandOfCards();
            System.out.printf("Has 2 cards same suit: %b%n",
                    myDeckOfCards.hasCardsSameSuit(2));
            System.out.printf("Has 2 cards same face: %b%n",
                    myDeckOfCards.hasCardsSameFace(2));
        }
    }
}