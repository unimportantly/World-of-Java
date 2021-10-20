package attacks;

import fighters.Fighter;
import global.Tools;

public class ShieldBash extends MeleeAttack{

    //attributes

    //constructors
    public ShieldBash() {
        this.chanceToHit = 60;
        this.damageModifier = 120;
        this.mpCost = 40;
    }
    //methods
        //TODO implement a way to stun
    public int launchAttack(Fighter attacker) {
        int damage = 0;
        if (chanceToHit > Tools.generateRandomInt()){
            System.out.println("The attack lands!");
            damage = (attacker.getDamage());
        } else{
            System.out.println("The attack was evaded!");
            damage = 0;
        }
        return damage;
    }
    //g&s


    @Override
    public String toString() {
        return "ShieldBash{" +
                "chanceToHit=" + chanceToHit +
                ", damageModifier=" + damageModifier +
                ", mpCost=" + mpCost +
                '}';
    }
}
