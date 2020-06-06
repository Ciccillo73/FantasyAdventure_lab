package weapons;

import behaviours.IWeapon;
import enemy.Enemy;

public class Club implements IWeapon {

    public void attack(Enemy enemy){
        enemy.takeDamage(15);
    }

}
