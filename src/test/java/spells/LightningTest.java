package spells;

import enemy.Enemy;
import enemy.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LightningTest {

    Lightning lightning;
    Enemy enemy;



    @Before
    public void setUp() throws Exception {
        lightning = new Lightning();
        enemy = new Troll(80);

    }

    @Test
    public void cast() {
        lightning.cast(enemy);
        assertEquals(30, enemy.getHealth());
    }
}