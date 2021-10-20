package attacks;

import fighters.Fighter;
import global.Tools;

public class SneakAttack extends MeleeAttack{

    //attributes

    //constructors
    public SneakAttack() {
        this.chanceToHit = 60;
        this.damageModifier = 200;
        this.mpCost = 50;
    }
    //methods
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
        return "SneakAttack{" +
                "chanceToHit=" + chanceToHit +
                ", damageModifier=" + damageModifier +
                ", mpCost=" + mpCost +
                '}';
    }
}
