package weapons;

import enemy.Enemy;
import enemy.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClubTest {

    Enemy enemy;
    Club club;

    @Before
    public void setUp() throws Exception {
        club = new Club();
        enemy = new Troll(100);
    }

    @Test
    public void attack() {
        club.attack(enemy);
        assertEquals(85, enemy.getHealth());
    }
}