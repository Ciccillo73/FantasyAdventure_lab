package spells;

import behaviours.ISpell;
import enemy.Enemy;

public class Lightning implements ISpell {

    public void cast(Enemy enemy) {
        enemy.takeDamage(50);
    }
}

