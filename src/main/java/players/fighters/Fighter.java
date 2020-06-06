package players.fighters;

import behaviours.IWeapon;
import enemy.Enemy;
import players.Player;

public class Fighter extends Player {

    IWeapon weapon;

    public Fighter(String name, int health,IWeapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void attack(Enemy enemy){
        this.weapon.attack(enemy);
    }
}
