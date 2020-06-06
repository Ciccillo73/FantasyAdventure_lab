package weapons;

import behaviours.IWeapon;
import enemy.Enemy;

public class Axe implements IWeapon {
    public void attack(Enemy enemy){
        enemy.takeDamage(20);
    }
}
