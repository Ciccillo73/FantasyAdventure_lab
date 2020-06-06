package players.fighters;

import behaviours.IWeapon;

public class Dwarf extends Fighter{

    private int block;

    public Dwarf(String name, int health, IWeapon weapon, int block) {
        super(name, health, weapon);
        this.block = block;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public String blockAttack(){
        return "I am immune";
    }
}
