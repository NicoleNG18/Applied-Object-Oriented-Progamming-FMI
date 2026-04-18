package problem1;

public class Card
{
    public static String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
    public static String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

    private int face;
    private int suit;

    public Card( int cardFace, int cardSuit )
    {
        setFace(cardFace);
        setSuit(cardSuit);
    }

    public int getFace() {
        return face;
    }

    private void setFace(int face) {
        this.face = face >= 0 && face < faces.length? face: 0;
    }

    public int getSuit() {
        return suit;
    }

    private void setSuit(int suit) {
        this.suit = suit >= 0 && suit < suits.length? suit: 0;
    }

    public String toString()
    {
        return faces[face] + " of " + suits[suit];
    }
}