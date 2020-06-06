package players.fighters;

import behaviours.IWeapon;
import enemy.Troll;
import org.junit.Before;
import org.junit.Test;
import weapons.Axe;
import weapons.Sword;

import static org.junit.Assert.assertEquals;


public class KnightTest {
    Knight knight;
    IWeapon sword;
    Troll troll;


    @Before
    public void setUp(){
        sword = new Sword();
        knight = new Knight("Cavaliere", 120,sword, 50);
        troll = new Troll(100);
    }

    @Test
    public void setWeapon() {
        knight.setWeapon(sword);
        assertEquals(sword, knight.getWeapon());
    }

    @Test
    public void attack() {
        knight.attack(troll);
        assertEquals(60, troll.getHealth());
    }

    @Test
    public void getName() {
        assertEquals("Cavaliere", knight.getName());
    }

    @Test
    public void getHealth() {
        assertEquals(120, knight.getHealth());
    }

    @Test
    public void setHealth() {
        knight.setHealth(200);
        assertEquals(200, knight.getHealth());
    }

    @Test
    public void getBlock() {
        assertEquals(50, knight.getArmour());
    }

    @Test
    public void setBlock() {
        assertEquals(50, knight.getArmour());
    }

    @Test
    public void cangreet() {
        assertEquals("I'm a gentleman", knight.greeting());
    }
}