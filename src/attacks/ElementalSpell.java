package attacks;

import fighters.Fighter;

public class ElementalSpell extends MagicAttack{

    //attributes

    //constructors
    public ElementalSpell() {
        this.damageModifier = 150;
        this.mpCost = 50;
    }
    //methods
    public int launchAttack(Fighter attacker) {
        int damage = (int)Math.round(attacker.getDamage() * this.damageModifier / 100);

        return damage;
    }
    //g&s


    @Override
    public String toString() {
        return "ElementalSpell{" +
                "damageModifier=" + damageModifier +
                ", mpCost=" + mpCost +
                '}';
    }
}
