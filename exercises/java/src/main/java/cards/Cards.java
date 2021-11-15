package cards;

public class Cards {
    public static void main(String[] args) {
        Cards cards = new Cards();
        String[] deckInOrder = cards.getCards();
        for(String card: deckInOrder){
            System.out.println(card);
        }
    }

    String[] getCards() {
        String[] result = new String[52];
        // PlayingCard[] deck = new PlayingCard[52];
        PlayingCardDeck deck = new PlayingCardDeck();

        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                deck.add(new PlayingCard(new Suit(suit), faceValue));
            }
        }

        int cardNumber = 0;
        for (PlayingCard card : deck.getDeck()) {
            String faceValueName;
            int value = card.getValue();
            switch (value){
                case 0: faceValueName = "ace"; break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9: faceValueName = Integer.toString(value+1); break;
                case 10: faceValueName = "jack"; break;
                case 11: faceValueName = "queen"; break;
                case 12: faceValueName = "king"; break;
                default: throw new IllegalArgumentException("Something went wrong " + value + "is not a valid faceValue!");
            }

            String suitName = card.getSuit();
            /* int suit = card.getSuit();
            switch (suit){
                case 0: suitName = "clubs"; break;
                case 1: suitName = "diamonds"; break;
                case 2: suitName = "hearts"; break;
                case 3: suitName = "spades"; break;
                default: throw new IllegalArgumentException("Something went wrong " + suit + "is not a valid suitName!");
            } */

            result[cardNumber] = faceValueName + " of " + suitName;
            cardNumber++;
        }

        return result;
    }

    PlayingCardDeck newDeck() {
        PlayingCardDeck deck = new PlayingCardDeck();
        for (int i = 0; i < 3; i++){
            for (int j = 1; j < 13; j++){

            }
        }
        return deck;
    }


}
