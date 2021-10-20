package attacks;

import fighters.Fighter;
import global.Tools;

public class PoisonedAttack extends MeleeAttack{

    //attributes

    //constructors
    public PoisonedAttack() {
        this.chanceToHit = 70;
        this.damageModifier = 90;
        this.mpCost = 20;
    }
    //methods
    //TODO implement DoT
    public int launchAttack(Fighter attacker) {
        int damage = 0;
        if (chanceToHit > Tools.generateRandomInt()){
            System.out.println("The attack lands!");
            damage = (int)Math.round(attacker.getDamage() * this.damageModifier / 100);
        } else{
            System.out.println("The attack was evaded!");
            damage = 0;
        }
        return damage;
    }
    //g&s


    @Override
    public String toString() {
        return "PoisonedAttack{" +
                "chanceToHit=" + chanceToHit +
                ", damageModifier=" + damageModifier +
                ", mpCost=" + mpCost +
                '}';
    }
}
