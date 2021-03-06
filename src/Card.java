import java.util.*;

public class Card implements Comparable<Card> {

    public enum CardSuit {DIAMONDS, HEARTS, SPADES, CLUBS}
    public enum CardRank {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}

    private CardSuit suit;
    private CardRank rank;

    //Constructor
    private Card(CardSuit suit, CardRank rank) {
        this.suit = suit;
        this.rank = rank;
    }



    //Getters and Setters
    public CardSuit getSuit() {
        return suit;
    }

    public CardRank getRank() {
        return rank;
    }

    public int getCardValue() {
        int cardSuitComponent = suit.ordinal();
        int cardRankComponent =
                (rank.ordinal() == CardRank.ACE.ordinal()) ? (CardRank.KING.ordinal() + 1) * 10 : rank.ordinal() * 10;

        return cardRankComponent + cardSuitComponent;
    }

    /**
     * Retrieves all the Cards that can exist, without imposing any particular order on the data structure returned.
     * @return A Set of all possible Cards that can be made with the CardSuits and CardRanks declared in this class
     */
    public static List<Card> generateDeck() {
        List<Card> allCards = new ArrayList<>();

        for (CardSuit suit : EnumSet.allOf(CardSuit.class)) {
            for (CardRank rank : EnumSet.allOf(CardRank.class)) {
                allCards.add(new Card(suit, rank));
            }
        }

        return allCards;
    }



    //Print Method
    public void print() {
        System.out.println(suit + " " + rank);
    }



    //Override Methods
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (other == null || !(other instanceof Card)) {
            return false;
        }

        Card otherCard = (Card) other;
        return (this.rank == otherCard.rank) && (this.suit == otherCard.suit);
    }

    @Override
    public int hashCode() {
        int result = suit.hashCode();
        result = 31 * result + rank.hashCode();
        return result;
    }

    @Override
    public int compareTo(Card o) {
        if (this.rank.ordinal() < o.rank.ordinal()) {
            return -1;
        }

        if (this.rank.ordinal() > o.rank.ordinal()) {
            return 1;
        }

        return 0;
    }
}
