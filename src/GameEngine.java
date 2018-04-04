
public class GameEngine {

    public static void main(String[] args) {
        Deck deck = new Deck();
        for (int i = 0; i < 7; i++) {
            deck.shuffle();
        }
        deck.print();
    }

    public PlayerStrategy playGame(PlayerStrategy strategyA, PlayerStrategy strategyB) {
        //play a round of "blackjack" with these two player strategies returning the winning one
        return null;
    }
}
