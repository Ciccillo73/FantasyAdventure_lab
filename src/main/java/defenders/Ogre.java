package defenders;

import behaviours.IMagicWeapon;
import enemy.Enemy;



public class Ogre implements IMagicWeapon {

    public void magicWeaponAttack(Enemy enemy){
        enemy.takeDamage(35);
    }

}
