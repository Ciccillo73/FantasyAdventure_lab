package weapons;

import enemy.Enemy;
import enemy.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SwordTest {

    Sword sword;
    Enemy enemy;

    @Before
    public void setUp() {
        sword = new Sword();
        enemy = new Troll(100);
    }

//    @Test
//    public void attack() {
//    }
}