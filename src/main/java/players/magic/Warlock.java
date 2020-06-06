package players.magic;

import behaviours.IMagicWeapon;
import behaviours.ISpell;

public class Warlock extends Mage{

    public Warlock(String name, int health, IMagicWeapon magicWeapon, ISpell spell) {
        super(name, health, magicWeapon, spell);
    }


}
