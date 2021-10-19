package attacks;

import fighters.Fighter;
import global.Tools;

public abstract class MagicAttack implements Attack{

    //attributes
    protected int damageModifier;
    protected int mpCost;

    //constructors
    public MagicAttack(){
        super();
    }

    //methods
    /**
     * calculates the damage dealt & additional effects if applicable
     * @param attacker the one who launches the attack
     * @return damage done
     */
    public int launchAttack(Fighter attacker) {
        int damage = (int)Math.round(attacker.getDamage() * damageModifier);
        return damage;
    }

    //g&s
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
        return "MagicAttack{" +
                "damageModifier=" + damageModifier +
                ", mpCost=" + mpCost +
                '}';
    }
}
