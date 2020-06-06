package defenders;

import enemy.Enemy;
import enemy.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class OgreTest {

    Ogre ogre;
    Enemy enemy;


    @Before
    public void setUp() throws Exception {
    enemy = new Troll(100);
    ogre = new Ogre();

    }

    @Test
    public void defend() {
        ogre.defend(enemy);
        assertEquals(65, enemy.getHealth());
    }
}