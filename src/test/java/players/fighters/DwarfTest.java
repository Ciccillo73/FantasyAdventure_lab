package players.fighters;

import behaviours.IWeapon;
import enemy.Enemy;
import enemy.Troll;
import org.junit.Before;
import org.junit.Test;
import weapons.Axe;
import weapons.Club;

import static org.junit.Assert.*;

public class DwarfTest {
    Dwarf dwarf;
    IWeapon axe;
    IWeapon club;
    Enemy troll;

    @Before
    public void setUp() {
        axe = new Axe();
        dwarf = new Dwarf ("Francesco", 100,axe,50 );
        club = new Club();
        troll = new Troll(80);
    }



    @Test
    public void setWeapon() {
        dwarf.setWeapon(club);
        assertEquals(club, dwarf.getWeapon());
    }

    @Test
    public void attack() {
        dwarf.attack(troll);
        assertEquals(60, troll.getHealth());
    }

    @Test
    public void getName() {
        assertEquals("Francesco", dwarf.getName());
    }

    @Test
    public void getHealth() {
        assertEquals(100, dwarf.getHealth());
    }

    @Test
    public void setHealth() {
        dwarf.setHealth(30);
        assertEquals(30, dwarf.getHealth());
    }

    @Test
    public void getBlock() {
        assertEquals(50, dwarf.getBlock());
    }

    @Test
    public void setBlock() {
        dwarf.setBlock(30);
        assertEquals(30, dwarf.getBlock());
    }

    @Test
    public void blockAttack() {
        assertEquals("I'm immune", dwarf.blockAttack());
    }
}