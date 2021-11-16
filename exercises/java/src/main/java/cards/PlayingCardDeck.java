package cards;

import java.util.ArrayList;
import java.util.List;

public class PlayingCardDeck {
    private final List<PlayingCard> cards;

    public PlayingCardDeck(){
        this.cards = new ArrayList<>();
    }

    void add(PlayingCard card){
        cards.add(card);
    }

    List<PlayingCard> getDeck(){
        return cards;
    }

    void makeDeck(){
        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                cards.add(new PlayingCard(new Suit(suit), faceValue));
            }
        }
    }
}
