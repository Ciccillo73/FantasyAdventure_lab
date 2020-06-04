package enemy;

public abstract class Enemy {

    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void takeDamage(int damageValue){
        this.setHealth(this.getHealth() - damageValue);
    }

}
