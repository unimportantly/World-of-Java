package attacks;

import fighters.Fighter;

public class Heal extends MagicAttack{

    //attributes

    //constructors
    public Heal() {
        this.damageModifier = 150;
        this.mpCost = 50;
    }
    //methods
    public int launchAttack(Fighter attacker) {
        int damage = (int)Math.round(attacker.getDamage() * this.damageModifier / 100);

        return damage;
    }

    @Override
    public String toString() {
        return "Heal{" +
                "damageModifier=" + damageModifier +
                ", mpCost=" + mpCost +
                '}';
    }
}
