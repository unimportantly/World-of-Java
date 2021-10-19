package fighters;

import classes.Classable;

/**
 * create a character class extending from AbstractFighter
 */

public class Character extends AbstractFighter{

    //attributes
    private int mp;
    Classable aClass;

    //constructor
    public Character(int hp, int mp, int damage, String name, Classable aClass) {
        super(hp, damage, name);
        this.mp = mp;
        this.aClass = aClass;
    }

    //methods
    @Override
    public void attack(Fighter opponent) {
    }

    //g&s
    public Classable getAClass() {
        return aClass;
    }
    public void setAClass(Classable aClass) {
        this.aClass = aClass;
    }

    @Override
    public String toString() {
        return "name: " + this.name + ", HP: " + this.hp + ", damage: " + this.damage;
    }
}
