package players.magic;

import behaviours.IMagicWeapon;
import behaviours.ISpell;
import enemy.Enemy;
import players.Player;

public abstract class Mage extends Player {

    private IMagicWeapon magicWeapon;
    private ISpell spell;

    public Mage(String name, int health, IMagicWeapon magicWeapon, ISpell spell) {
        super(name, health);
        this.magicWeapon = magicWeapon;
        this.spell = spell;
    }


    public ISpell getSpell() {
        return spell;
    }

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }



    public void magicAttack(Enemy enemy){
        this.magicWeapon.magicWeaponAttack(enemy);
    }

    public void setMagicWeapon(IMagicWeapon magicWeapon) {
        this.magicWeapon = magicWeapon;
    }

    public void swapMagicWeapon(IMagicWeapon magicWeapon) {
        this.magicWeapon = magicWeapon;
    }

    public void swapSpell(ISpell spell) {
        this.setSpell(spell);
    }
}
