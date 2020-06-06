package defenders;

import enemy.Enemy;
import enemy.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DragonTest {

    Dragon dragon;
    Enemy enemy;


    @Before
    public void setUp() {
        enemy = new Troll(100);
        dragon = new  Dragon();
    }

    @Test
    public void defend() {
        dragon.magicWeaponAttack(enemy);
        assertEquals(20, enemy.getHealth());
    }

}