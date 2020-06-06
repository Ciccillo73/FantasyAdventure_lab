package weapons;

import behaviours.IWeapon;
import enemy.Enemy;

public class Sword implements IWeapon {
    public void attack(Enemy enemy){
        enemy.takeDamage(40);
    }

}
