import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameEngine {

    public static void main(String[] args) {
        //Create and shuffle the deck
        Deck deck = new Deck();
        deck.shuffle();

        //Initialize the players, using four different player strategies
        List<Player> players = new ArrayList<>();

        Player player1 = new StrategyA();
        Player player2 = new StrategyB();
        Player player3 = new StrategyC();
        Player player4 = new StrategyD();


        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);

        //Declare win counts for the 4 players
        for (Player player: players) {
            player.wins = 0;
        }

        //Run 101 games, adding a win to the winning player's total count
        for (int i = 0; i < 101; i++) {
            Player winner = playGame(players, deck);
            winner.wins++;
        }

        //Print the number of wins for each player after 100 games
        System.out.println("Player 1 wins: " + player1.wins);
        System.out.println("Player 1 wins: " + player1.wins);
        System.out.println("Player 1 wins: " + player1.wins);
        System.out.println("Player 1 wins: " + player1.wins);

    }

    private static Player playGame(List<Player> players, Deck deck) {
        //Deal cards to every player
        for (Player player: players) {
            player.receiveInitialHand(deck);
        }

        //Have each player play a card, giving the deadwood cards to the loser
        List<Card> roundDeadwood = new ArrayList<>();
        Player roundLoser;
    }
}
