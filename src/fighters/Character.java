package fighters;

import attacks.Attack;
import classes.Classable;

/**
 * create a character class extending from AbstractFighter
 */

public class Character extends AbstractFighter {

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

    /**
     * attack method, calls on getAttack to select which one to use
     * and defend to calculate the actual damage dealt
     * @param attacker who is attacking
     * @param opponent who is attacked
     */
    public void attack(Fighter attacker, Fighter opponent) {
        Attack skillPicked = this.aClass.getAttack();
        int skillUsed = 0;
        while (skillUsed == 0) {
            if (attacker.getMp() < skillPicked.getMpCost()) {
                System.out.println("you don't have enough mp to use that skill!");
                skillPicked = this.aClass.getAttack();
            } else {
                System.out.println(attacker.getName() + " uses " + skillPicked);
                this.mp = attacker.getMp() - skillPicked.getMpCost();
                opponent.defend(skillPicked.launchAttack(attacker));
                System.out.println(this.getName() + "'s attack hit " + opponent.getName() + " for " + this.getDamage() + " points. " + opponent.getName() + " has " + opponent.getHp() + " left.");
                System.out.println(attacker);
                skillUsed ++;
            }
        }
    }
    //g&s
    public Classable getAClass() {
        return aClass;
    }
    public void setAClass(Classable aClass) {
        this.aClass = aClass;
    }
    @Override
    public int getMp() {
        return this.mp;
    }
    @Override
    public void setMp(int mp) {
    }

    @Override
    public String toString() {
        return "Character{" +
                "hp=" + hp +
                ", damage=" + damage +
                ", name='" + name + '\'' +
                ", mp=" + mp +
                ", Class=" + aClass +
                '}';
    }
}
