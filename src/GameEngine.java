import java.util.ArrayList;
import java.util.List;

public class GameEngine {

    public static void main(String[] args) {
        //Initialize the players, using four different player strategies
        List<Player> players = new ArrayList<>();

        Player player1 = new StrategyA();
        Player player2 = new StrategyA();
        Player player3 = new StrategyA();
        Player player4 = new StrategyA();


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
            //Play new game with deck
            Player loser = playGame(players, i);

            //Update win totals
            for (Player player: players) {
                if (player != loser) {
                    player.wins++;
                }
            }
        }

        //Print the number of wins for each player after 100 games
        System.out.println("Player 1 wins: " + player1.wins);
        System.out.println("Player 2 wins: " + player2.wins);
        System.out.println("Player 3 wins: " + player3.wins);
        System.out.println("Player 4 wins: " + player4.wins);

    }

    private static void playRound(List<Player> players, Deck deck, int gameNumber) {
        //Deal cards to every player
        for (Player player: players) {
            player.takeInitialHandFromDeck(deck);
        }

        //Have each player play a card, giving the deadwood cards to the loser
        List<Card> playedCards = new ArrayList<>();
        Player loser = players.get(0);          //arbitrary initial value of the first player
        int highestCardValue = 0;               //all cards have value > 0

//        for (Player player: players) {
//            Card card = player.playCard(playedCards);
//            assert (card != null);
//            System.out.println(card.getCardValue());
//            playedCards.add(card);
//
//            if (card.getCardValue() > highestCardValue) {
//                highestCardValue = card.getCardValue();
//                loser = player;
//            }
//        }

        int i = 0;
        int j = gameNumber % players.size();

        while (i < players.size()) {
            try {
                Player player = players.get(j);
                Card playedCard = player.playCard(playedCards);
                playedCards.add(playedCard);

                if (playedCard.getCardValue() > highestCardValue) {
                    highestCardValue = playedCard.getCardValue();
                    loser = player;
                }

                j++;
                i++;
            } catch (IndexOutOfBoundsException e) {
                j = 0;
            }
        }

        loser.receiveDeadwood(playedCards);
    }

    private static Player playGame(List<Player> players, int gameNumber) {
        //Create and shuffle the deck
        Deck deck = new Deck();
        deck.shuffle();

        for (int i = 0; i < Player.HAND_SIZE; i++) {
            if (deck.getDeck().size() < 16) {
                deck = new Deck();
                deck.shuffle();
            }
            playRound(players, deck, gameNumber);
        }

        int maxDeadwoodSize = -1;
        int maxDeadwoodCount = -1;
        Player loser = players.get(0);

        for (Player player: players) {
            int playerDeadwoodSize = player.deadwood.size();
            int playerDeadwoodValue = player.calculateDeadwoodValue();

            if (playerDeadwoodSize > maxDeadwoodSize) {
                maxDeadwoodSize = playerDeadwoodSize;
                loser = player;
            } else if (playerDeadwoodSize == maxDeadwoodSize) {
                if (playerDeadwoodValue >= maxDeadwoodCount) {
                    maxDeadwoodCount = playerDeadwoodValue;
                    loser = player;
                }
            }
        }

        return loser;
    }
}
