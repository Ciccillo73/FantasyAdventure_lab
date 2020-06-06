package players.fighters;

import behaviours.IWeapon;

public class Knight extends Fighter {

    private int armour;

    public Knight(String name, int health, IWeapon weapon, int armour) {
        super(name, health, weapon);
        this.armour = armour;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public  String greeting(){
        return "I'm a gentleman";
    }

}
