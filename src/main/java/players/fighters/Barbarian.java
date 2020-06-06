package players.fighters;

import behaviours.IWeapon;

public class Barbarian extends Fighter{

    private int power;

    public Barbarian(String name, int health, IWeapon weapon, int power) {
        super(name, health, weapon);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String meteorAttack(){
        return "It will rain fire";
    }

}
