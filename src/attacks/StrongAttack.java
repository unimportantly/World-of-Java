package attacks;

import classes.Warrior;
import fighters.Fighter;
import global.Tools;

public class StrongAttack extends MeleeAttack {

    //attributes

    //constructors
    public StrongAttack() {
        this.chanceToHit = 60;
        this.damageModifier = 120;
        this.mpCost = 20;
    }
    //methods
    public int launchAttack(Fighter attacker) {
        int damage = 0;
        if (chanceToHit > Tools.generateRandomInt()){
            System.out.println("The attack lands!");
            damage = (attacker.getDamage() * this.damageModifier / 100);
        } else{
            System.out.println("The attack was evaded!");
            damage = 0;
        }
        return damage;
    }
    //g&s


    @Override
    public String toString() {
        return "StrongAttack{" +
                "chanceToHit=" + chanceToHit +
                ", damageModifier=" + damageModifier +
                ", mpCost=" + mpCost +
                '}';
    }
}
