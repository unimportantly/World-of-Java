package fighters;

/**
 * create a monster class extending from AbstractFighter
 */

public class Monster extends AbstractFighter{

    //construtors
    public Monster(){
        super();
    }
    public Monster(int hp, int damage, String name) {
        super(hp, damage, name);
    }

    //g&s
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name: " + this.name + ", HP: " + this.hp + ", damage: " + this.damage;
    }

}
