import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> deck;

    //Constructor
    public Deck() {
        this.deck = Card.generateDeck();
    }


    //Getters and Setters
    public List<Card> getDeck() {
        return deck;
    }


    //Deck Modification Methods
    public void shuffle() {
        Collections.shuffle(deck);
    }

    public Card pop() {
        Card card = deck.get(0);
        deck.remove(0);
        return card;
    }

    public List<Card> dealNCards(int n) {
        List<Card> dealtCards = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            dealtCards.add(this.pop());
        }

        return dealtCards;
    }

    //Print Method
    public void print() {
        for (Card card : deck) {
            card.print();
        }
    }
}
