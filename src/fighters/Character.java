package fighters;

/**
 * create a character class extending from AbstractFighter
 */

public class Character extends AbstractFighter{

    //construtors
    public Character(){
        super();
    }
    public Character(int hp, int damage, String name) {
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

    @Override
    public void setDamage() {
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
