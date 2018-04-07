import java.util.ArrayList;
import java.util.List;

public class Player {
    public Strategy strategy;
    public int wins;
    protected List<Card> hand;
    protected List<Card> deadwood;

    private static final int HAND_SIZE = 4;

    public Player(Strategy strategy) {
        this.strategy = strategy;
        this.hand = new ArrayList<>();
        this.deadwood = new ArrayList<>();
        this.wins = 0;
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
        return strategy.playCard(opponentPlayedCards);
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

    public void updateStrategy() {
        strategy.setDeadwood(this.deadwood);
        strategy.setHand(this.hand);
    }

    public List<Card> getHand() {
        return hand;
    }
}
