package weapons;


import enemy.Enemy;
import enemy.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AxeTest {

    Axe axe;
    Enemy enemy;


    @Before
    public void setUp() {
        axe = new Axe();
        enemy = new Troll(100);

    }

    @Test
    public void attack() {
        axe.attack(enemy);
        assertEquals(80, enemy.getHealth());
    }

}