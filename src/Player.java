import java.util.ArrayList;
import java.util.List;

public class Player {
    public List<Card> hand;
    public List<Card> deadwood;

    private static final int HAND_SIZE = 4;

    public Player(PlayerStrategy playerStrategy) {
        hand = new ArrayList<>();
        deadwood = new ArrayList<>();
    }

    public void receiveInitialHand(Deck deck) {
        for (int i = 0; i < HAND_SIZE; i++) {
            if (hand == null) {
                hand = new ArrayList<>();
            }
            hand.add(deck.pop());
        }
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
