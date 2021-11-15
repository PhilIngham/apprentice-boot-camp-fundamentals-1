package cards;

import java.util.ArrayList;
import java.util.List;

public class PlayingCardDeck {
    private List<PlayingCard> cards;

    public PlayingCardDeck(){
        this.cards = new ArrayList<>();
    }

    void add(PlayingCard card){
        cards.add(card);
    }

    List<PlayingCard> getDeck(){
        return cards;
    }
}
