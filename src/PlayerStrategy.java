import java.util.List;

public interface PlayerStrategy {

    /**
     * Method used to give each player strategy its own hand to keep track of.
     *
     * @param hand - the hand dealt to this playerStrategy
     */
    public void receiveInitialHand(List<Card> hand);

    /**
     * Given a list of the cards opponents have played, return the Card the playerStrategy would like to play.
     *
     * @param opponentPlayedCards - a list of cards played in the round before current playerStrategy's turn
     *
     * @return the card this playerStrategy will play
     */
    public Card playCard(List<Card> opponentPlayedCards);

}
