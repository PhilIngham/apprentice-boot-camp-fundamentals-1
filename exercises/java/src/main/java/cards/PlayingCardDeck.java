package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayingCardDeck implements Deck{
    private final List<PlayingCard> cards;

    public PlayingCardDeck(){
        this.cards = new ArrayList<>();
        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                cards.add(new PlayingCard(new Suit(suit), faceValue));
            }
        }
    }

    List<PlayingCard> getDeck(){
        return cards;
    }

    public String[] getCards(){
        String[] returnCards = new String[cards.size()];
        for(int i = 0; i < cards.size(); i++) {
            returnCards[i] = cards.get(i).getFaceValue();
        }
        return returnCards;
    }

    public Card deal(){
        return cards.remove(0);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }
}
