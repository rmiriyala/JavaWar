import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StrategyTest {

    Deck deck;

    @Before
    public void setUp() throws Exception {
        deck = new Deck();
    }

    @Test
    public void testPlayCardA() {
        Player player = new StrategyA();
        player.takeInitialHandFromDeck(deck);

        assertTrue(player.hand.size() > 0);

        testStrategyReturnNotNull(player);
    }

    @Test
    public void testPlayCardB() {
        Player player = new StrategyB();
        player.takeInitialHandFromDeck(deck);

        assertTrue(player.hand.size() > 0);

        testStrategyReturnNotNull(player);
    }

    @Test
    public void testPlayCardC() {
        Player player = new StrategyC();
        player.takeInitialHandFromDeck(deck);

        assertTrue(player.hand.size() > 0);

        testStrategyReturnNotNull(player);
    }

    @Test
    public void testPlayCardD() {
        Player player = new StrategyD();
        player.takeInitialHandFromDeck(deck);

        assertTrue(player.hand.size() > 0);

        testStrategyReturnNotNull(player);
    }

    private void testStrategyReturnNotNull(Player player) {
        while (player.hand.size() > 0) {
            int i = player.hand.size();
            assertEquals(player.hand.size(), i);
            assertNotEquals(player.playCard(new ArrayList<Card>()), null);
            assertEquals(player.hand.size(), i - 1);
        }
    }
}
