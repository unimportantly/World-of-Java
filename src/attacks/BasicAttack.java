package attacks;

import fighters.Fighter;

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
    public int launchAttack(Fighter attacker, Fighter defender) {
        int damage = (int)Math.round(attacker.getDamage() * damageModifier);
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
        return "BasicAttack{" +
                "chanceToHit=" + chanceToHit +
                ", damageModifier=" + damageModifier +
                '}';
    }

}
