import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> deck;

    public Deck() {
        this.deck = Card.generateDeck();
    }

    public List<Card> getDeck() {
        return deck;
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public Card pop() {
        Card card = deck.get(0);
        deck.remove(0);
        return card;
    }

    public void print() {
        for (Card card : deck) {
            card.print();
        }
    }
}
