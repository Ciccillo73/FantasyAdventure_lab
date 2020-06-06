package defenders;

import behaviours.IMagicWeapon;
import enemy.Enemy;

public class Dragon implements IMagicWeapon {

    public void magicWeaponAttack(Enemy enemy) {
        enemy.takeDamage(80);
    }
}
