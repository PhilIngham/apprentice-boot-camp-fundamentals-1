package cards;

public class PlayingCard implements Card {
    private final Suit suit;
    private final int faceValue;

    public PlayingCard(Suit suit, int faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    String getSuit() { return suit.getSuit(); }

    int getValue() { return faceValue; }

    public String getFaceValue(){
        return String.valueOf(faceValue);
    }

    public boolean snap(Card otherCard){
        return otherCard != null && this.getFaceValue().equals(otherCard.getFaceValue());
    }

    public String toString(){ return getFaceValue(); }
}
