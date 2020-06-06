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
    }

    @Test
    public void getHealth() {
    }

    @Test
    public void setHealth() {
    }

    @Test
    public void getPower() {
    }

    @Test
    public void setPower() {
    }

    @Test
    public void meteorAttack() {
    }
}