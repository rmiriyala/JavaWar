import java.util.ArrayList;
import java.util.List;

public class GameEngine {

    public static void main(String[] args) {
        //Create and shuffle the deck
        Deck deck = new Deck();
        deck.shuffle();

        //Initialize the players, using four different player strategies

    }

    public PlayerStrategy playGame(List<Player> players) {
        //play a round of "blackjack" with these two player strategies returning the winning one
        return null;
    }

    /**
     * Function that creates a list of players based on the player strategies.
     *
     * @param a - one of four player strategies to compete in the game
     * @param b - one of four player strategies to compete in the game
     * @param c - one of four player strategies to compete in the game
     * @param d - one of four player strategies to compete in the game
     *
     * @return the newly created list of players
     */
    public List<Player> initializePlayers(PlayerStrategy a, PlayerStrategy b, PlayerStrategy c, PlayerStrategy d) {
        List<Player> players = new ArrayList<>();

        players.add(new Player(a));
        players.add(new Player(b));
        players.add(new Player(c));
        players.add(new Player(d));

        return players;
    }
}
