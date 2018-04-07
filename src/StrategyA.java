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
        if (cardPlayed == null) {
            cardPlayed = hand.get(0);
        }
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

    /**
     * Helper function to find the lowest card in the list.
     *
     * It would be helpful to implement this...
     * @param cardList the list of cards being checked
     * @return the lowest card in the list
     */
    public int minCard(List<Card> cardList) {

        return 0;
    }

    /**
     * Helper function that finds the closest card to the highest card
     * played by opponents so far from your hand.
     *
     * It would be extremely helpful to implement this.
     * @param myHand your hand at the moment
     * @param opponentPlayedCards cards played by opponents this round
     * @return card --the closest card to the highest card
     * played by opponents so far from your hand
     */
    public int secondHighestCard(List<Card> myHand, List<Card> opponentPlayedCards) {

        return 0;
    }
}
