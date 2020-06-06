package enemy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrcTest {

    Orc orc;

    @Before
    public void setUp() {
        orc = new Orc(100);
    }

    @Test
    public void getHealth() {
        assertEquals(100, orc.getHealth());
    }

//    @Test
//    public void setHealth() {
//    }
//
//    @Test
//    public void takeDamage() {
//    }
}