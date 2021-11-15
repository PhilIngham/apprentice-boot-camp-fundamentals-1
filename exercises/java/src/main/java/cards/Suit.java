package cards;

import java.util.HashMap;
import java.util.Map;

public class Suit {
    private final String suit;

    private final Map<Integer, String> suits = new HashMap<>();

    public Suit(int suit) {
        initializeSuits();
        this.suit = convertSuit(suit);
    }

    String getSuit(){
        return suit;
    }

    String convertSuit(int suitNum){
        return suits.get(suitNum);
    }

    void initializeSuits(){
        suits.put(0, "clubs");
        suits.put(1, "diamonds");
        suits.put(2, "hearts");
        suits.put(3, "spades");
    }
}
