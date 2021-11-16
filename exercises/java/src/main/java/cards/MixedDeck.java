package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MixedDeck extends Deck{
    private final List<Card> cards;
    public MixedDeck(){
        cards = new ArrayList<>();
        for (Animal animal : Animal.values()) {
            cards.add(new AnimalCard(animal));
            cards.add(new AnimalCard(animal));
        }
        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                cards.add(new PlayingCard(new Suit(suit), faceValue));
            }
        }
    }

    @Override
    public String[] getCards() {
        String[] result = new String[cards.size()];
        for (int i = 0; i < cards.size(); i++) {
            Card card = cards.get(i);
            result[i] = card.toString();
        }
        return result;
    }

    @Override
    public Card deal() {

        return cards.remove(0);
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }
}
