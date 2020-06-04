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

//    @Test
//    public void setHealth() {
//
//    }
//
//    @Test
//    public void takeDamage() {
//    }
}