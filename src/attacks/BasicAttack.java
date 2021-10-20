package attacks;

import fighters.Fighter;
import global.Tools;

public class BasicAttack implements Attack {

    //attributes
    private int chanceToHit;
    private int damageModifier;
    private int mpCost;

    //constructors
    public BasicAttack() {
        this.chanceToHit = 80;
        this.damageModifier = 50;
        this.mpCost = 0;
    }

    //methods
    public int launchAttack(Fighter attacker) {
        int damage = 0;
            if (chanceToHit > Tools.generateRandomInt()) {
                System.out.println("The attack lands!");
                damage = (attacker.getDamage() * this.damageModifier / 100);
            } else {
                System.out.println("The attack was evaded!");
                damage = 0;
            }return damage;
        }

    //g&s
    public int getChanceToHit() {
        return chanceToHit;
    }
    public void setChanceToHit(int chanceToHit) {
        this.chanceToHit = chanceToHit;
    }
    @Override
    public int getDamageModifier() {
        return damageModifier;
    }
    @Override
    public void setDamageModifier(int damageModifier) {
        this.damageModifier = damageModifier;
    }
    @Override
    public int getMpCost() {
        return mpCost;
    }
    @Override
    public void setMpCost(int mpCost) {
        this.mpCost = mpCost;
    }


    @Override
    public String toString() {
        return "BasicAttack: " +
                "chanceToHit: " + chanceToHit +
                ", damageModifier: " + damageModifier;
    }

}
