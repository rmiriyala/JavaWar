import java.util.List;

public class StrategyA extends Player {

    public StrategyA() {
        super();
    }

    @Override
    public Card playCard(List<Card> opponentPlayedCards) {
        Card cardPlayed = hand.get(0); //initialize to something
        int maxCardPlayed = maxCard(opponentPlayedCards);

        // insert code here.
        if (opponentPlayedCards.isEmpty()) {
            // strategy if playing first card

        } else if (opponentPlayedCards.size() == 1) {
            // strategy if playing second card

        } else if (opponentPlayedCards.size() == 2) {
            // strategy if playing third card

        } else if (opponentPlayedCards.size() == 3) {
            // strategy if playing last card

        }

        hand.remove(cardPlayed);
        return cardPlayed;
    }

    /**
     * Finds the max card played so far.
     * @param cards the cards played by opponents
     * @return the highest card played
     */
    private int maxCard(List<Card> cards) {
        int max = 0;
        for (Card card: cards) {
            if (card.getCardValue() > max) {
                max = card.getCardValue();
            }
        }
        return max;
    }
}
