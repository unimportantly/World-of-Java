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
    public void attack(Fighter attacker, Fighter opponent){
        opponent.defend(this.getDamage());
        System.out.println(this.getName() + "'s attack hit " + opponent.getName() + " for " + this.getDamage() + " points. " + opponent.getName() + " has " + opponent.getHp() + " left.");
    }

    @Override
    public int getMp() {
        return 0;
    }
    @Override
    public void setMp(int mp) {
    }
}
