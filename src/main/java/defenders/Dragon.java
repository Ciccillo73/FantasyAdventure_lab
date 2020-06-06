package defenders;

import behaviours.IDefend;
import enemy.Enemy;

public class Dragon implements IDefend {

    public void defend(Enemy enemy) {
        enemy.takeDamage(80);
    }
}
