package attacks;

import fighters.Fighter;
import global.Tools;

public abstract class MeleeAttack implements Attack{

    //attributes
    protected int chanceToHit;
    protected int damageModifier;
    protected int mpCost;

    //constructors
    public MeleeAttack(){
        super();
    }

    //methods
    /**
     * calculate the chance to hit
     * resolve if the attack has hit
     * if it has, calculate the damage
     * @param attacker the one who launches the attack
     * @return damage done
     */
    public int launchAttack(Fighter attacker) {
        int damage = 0;
        if (chanceToHit > Tools.generateRandomInt()){
            damage = (attacker.getDamage() * this.damageModifier / 100);
        } else {
            System.out.println("The attack was evaded!");
        }
        return damage;
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
                ", damageModifier: " + damageModifier +
                ", mpCost: " + mpCost;
    }
}
