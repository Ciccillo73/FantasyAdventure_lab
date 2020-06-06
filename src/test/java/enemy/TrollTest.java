package enemy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TrollTest {

    Troll troll;

    @Before
    public void setUp() throws Exception {
        troll = new Troll(80);
    }

    @Test
    public void getHealth() {
        assertEquals(80, troll.getHealth());
    }

    @Test
    public void setHealth() {
        troll.setHealth(50);
        assertEquals(50, troll.getHealth());
    }

    @Test
    public void takeDamage() {
        troll.takeDamage(20);
        assertEquals(60, troll.getHealth());
    }
}