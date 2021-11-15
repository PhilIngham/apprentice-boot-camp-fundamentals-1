package cards;

public class PlayingCard {
    private final Suit suit;
    private final int faceValue;

    public PlayingCard(Suit suit, int faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    String getSuit() { return suit.getSuit(); }

    int getValue() { return faceValue; }

}
