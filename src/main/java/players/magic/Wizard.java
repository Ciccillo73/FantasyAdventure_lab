package players.magic;

import behaviours.IMagicWeapon;
import behaviours.ISpell;

public class Wizard extends Mage{
    public Wizard(String name, int health, IMagicWeapon magicWeapon, ISpell spell) {
        super(name, health, magicWeapon, spell);
    }
}
