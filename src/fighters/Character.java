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
    public void attack(Fighter attacker, Fighter opponent) {
        opponent.defend(this.aClass.getAttack().launchAttack(attacker));
        System.out.println(this.getName() + "'s attack hit " + opponent.getName() + " for " + this.getDamage() + " points. " + opponent.getName() + " has " + opponent.getHp() + " left.");
        System.out.println(attacker);
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
        return "Character{" +
                "hp=" + hp +
                ", damage=" + damage +
                ", name='" + name + '\'' +
                ", mp=" + mp +
                ", aClass=" + aClass +
                '}';
    }
}
