package cards;

import java.util.HashMap;
import java.util.Map;

public class Suit {
    private final String suit;

    public Suit(int suit) {
        this.suit = convertSuit(suit);
    }

    String getSuit(){
        return suit;
    }

    String convertSuit(int suitNum){
        if(suitNum == 0){
            return "clubs";
        } else if (suitNum == 1){
            return "diamonds";
        } else if (suitNum == 2){
            return "hearts";
        } else {
            return "spades";
        }
    }
}
