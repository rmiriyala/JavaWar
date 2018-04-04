
public class GameEngine {

    public static void main(String[] args) {
        Deck deck = new Deck();
        for (int i = 0; i < 7; i++) {
            deck.shuffle();
        }
        deck.print();
    }
}
