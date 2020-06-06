package defenders;

import behaviours.IDefend;
import enemy.Enemy;



public class Ogre implements IDefend {

    public void defend(Enemy enemy){
        enemy.takeDamage(35);
    }

}
