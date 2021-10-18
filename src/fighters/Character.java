package fighters;

import classes.Class;

/**
 * create a character class extending from AbstractFighter
 */

public class Character extends AbstractFighter{

    //attributes
    Class aClass;

    //construtors
    public Character(){
        super();
    }
    public Character(int hp, int damage, String name, Class aClass) {
        super(hp, damage, name);
        this.aClass = aClass;
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
