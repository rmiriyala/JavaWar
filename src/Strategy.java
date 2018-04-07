import java.util.List;

public class Strategy extends Player {


    public Card playCard(List<Card> opponentPlayedCards) {
        Card cardPlayed = null;
        int maxCardPlayed = maxCard(opponentPlayedCards);

        // insert code here.
        if (opponentPlayedCards.isEmpty()) {
            // strategy if playing first card

            cardPlayed =
        } else if (opponentPlayedCards.size() == 1) {
            // strategy if playing second card

        } else if (opponentPlayedCards.size() == 2) {
            // strategy if playing third card

        } else if (opponentPlayedCards.size() == 3) {
            // strategy if playing last card

        } else {
            System.out.println("opponent played cards > 3");
        }
        System.out.println(hand.size());
        hand.remove(cardPlayed);
        return cardPlayed;
    }

    /**
     * Finds the max card played so far.
     * @param opponentPlayedCards the cards played by opponents
     * @return the highest card played
     */
    public int maxCard(List<Card> cardList) {
        int max = 0;
        for (Card card: opponentPlayedCards) {
            if (card.getValue() > max) {
                max = card.getCardValue();
            }
        }
        return max;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public void setDeadwood(List<Card> deadwood) {
        this.deadwood = deadwood;
    }
}
