import java.util.ArrayList;
import java.util.List;

public class Player {
    public int wins;
    protected List<Card> hand;
    protected List<Card> deadwood;

    public static final int HAND_SIZE = 4;

    public Player() {
        this.hand = new ArrayList<>();
        this.deadwood = new ArrayList<>();
        this.wins = 0;
    }

    public void takeInitialHandFromDeck(Deck deck) {
        for (int i = 0; i < HAND_SIZE; i++) {
            if (hand == null) {
                hand = new ArrayList<>();
            }
            hand.add(deck.pop());
        }
    }

    public void receiveDeadwood(List<Card> deadwoodCards) {
        deadwood.addAll(deadwoodCards);
    }

    public int calculateDeadwoodValue() {
        int value = 0;
        for (Card card: deadwood) {
            value += card.getCardValue();
        }
        return value;
    }

    public Card playCard(List<Card> opponentPlayedCards) {
        return null;
    }

    public void printHand() {
        System.out.println("Hand: ");
        for (Card card: hand) {
            card.print();
        }
    }

    public void printDeadwood() {
        System.out.println("Deadwood: ");
        for (Card card: deadwood) {
            card.print();
        }
    }
}
