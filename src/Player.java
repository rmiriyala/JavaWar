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

    public List<Card> getHand() {
        return hand;
    }

    public List<Card> getDeadwood() {
        return deadwood;
    }

    public void receiveInitialHand(Deck deck) {
        for (int i = 0; i < HAND_SIZE; i++) {
            if (hand == null) {
                hand = new ArrayList<>();
            }
            hand.add(deck.pop());
        }
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
