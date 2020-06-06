package players.fighters;

import behaviours.IWeapon;
import enemy.Troll;
import org.junit.Before;
import org.junit.Test;
import weapons.Axe;

import static org.junit.Assert.assertEquals;


public class DwarfTest {

    Dwarf dwarf;
    IWeapon axe;
    Troll troll;

    @Before
    public void setUp(){
        axe = new Axe();
        dwarf = new Dwarf("Nano", 150,axe, 50);
        troll = new Troll(100);
    }

    @Test
    public void setWeapon() {
        dwarf.setWeapon(axe);
        assertEquals(axe, dwarf.getWeapon());
    }

    @Test
    public void attack() {
        dwarf.attack(troll);
        assertEquals(80, troll.getHealth());
    }

    @Test
    public void getName() {
        assertEquals("Nano", dwarf.getName());
    }

    @Test
    public void getHealth() {
        assertEquals(150, dwarf.getHealth());
    }

    @Test
    public void setHealth() {
        dwarf.setHealth(200);
        assertEquals(200, dwarf.getHealth());
    }

    @Test
    public void getBlock() {
        assertEquals(50, dwarf.getBlock());
    }

    @Test
    public void setBlock() {
        dwarf.setBlock(80);
        assertEquals(80, dwarf.getBlock());
    }

    @Test
    public void canAvoidAttack() {
        assertEquals("I am immune", dwarf.blockAttack());
    }
}