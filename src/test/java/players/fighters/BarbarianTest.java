package players.fighters;

import behaviours.IWeapon;
import enemy.Enemy;
import enemy.Troll;
import org.junit.Before;
import org.junit.Test;
import weapons.Axe;
import weapons.Club;
import weapons.Sword;

import static org.junit.Assert.assertEquals;


public class BarbarianTest {

    Barbarian barbarian;
    IWeapon club;
    Enemy troll;
    IWeapon axe;

    @Before
    public void setUp()  {
        club = new Club();
        troll = new Troll(100);
        axe = new Axe();
        barbarian = new Barbarian("Antonio", 100, axe,50);

    }

    @Test
    public void setWeapon() {
        barbarian.setWeapon(club);
        assertEquals(club, barbarian.getWeapon());
    }

    @Test
    public void attack() {
        barbarian.attack(troll);
        assertEquals(80, troll.getHealth());
    }

    @Test
    public void getName() {
        assertEquals("Antonio", barbarian.getName());
    }

    @Test
    public void getHealth() {
        assertEquals(100, barbarian.getHealth());
    }

    @Test
    public void setHealth() {
        barbarian.setHealth(200);
        assertEquals(200, barbarian.getHealth());
    }

    @Test
    public void getPower() {
        assertEquals(50, barbarian.getPower());
    }

    @Test
    public void setPower() {
        barbarian.setPower(80);
        assertEquals(80, barbarian.getPower());
    }

    @Test
    public void meteorAttack() {
       assertEquals("It will rain fire", barbarian.meteorAttack());
    }
}