package spells;

import enemy.Enemy;
import enemy.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FireBallTest {

    FireBall fireBall;
    Enemy enemy;



    @Before
    public void setUp() throws Exception {
        fireBall = new FireBall();
        enemy = new Troll(100);

    }

    @Test
    public void cast() {
        fireBall.cast(enemy);
        assertEquals(60, enemy.getHealth());
    }
}