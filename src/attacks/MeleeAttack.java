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
     * @param defender the one who it is launched at
     * @return damage done
     */
    public int launchAttack(Fighter attacker, Fighter defender) {
        int damage = 0;
        if (chanceToHit > Tools.generateRandomInt()){
            System.out.println("The attack lands!");
            damage = (int)Math.round(attacker.getDamage() * damageModifier);

        } else{
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
        return "MeleeAttack{" +
                "chanceToHit=" + chanceToHit +
                ", damageModifier=" + damageModifier +
                ", mpCost=" + mpCost +
                '}';
    }
}
