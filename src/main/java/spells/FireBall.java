package spells;

import behaviours.ISpell;
import enemy.Enemy;

public class FireBall implements ISpell {

    public void cast(Enemy enemy){
        enemy.takeDamage(40);
    }

}
