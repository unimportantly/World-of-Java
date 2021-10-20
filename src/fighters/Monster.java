package fighters;

import classes.Classable;

/**
 * create a monster class extending from AbstractFighter
 */

public class Monster extends AbstractFighter{

    //constructor
    public Monster(int hp, int damage, String name) {
        super(hp, damage, name);
    }

    //methods

    @Override
    public String toString() {
        return "name: " + this.name + ", HP: " + this.hp + ", damage: " + this.damage;
    }

    @Override
    public void attack(Fighter attacker, Fighter opponent) {

    }
}
