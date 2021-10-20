package attacks;

import fighters.Fighter;

public class Ultima extends MagicAttack{

    //attributes

    //constructors
    public Ultima() {
        this.damageModifier = 300;
        this.mpCost = 100;
    }
    //methods
    public int launchAttack(Fighter attacker) {
        int damage = (int)Math.round(attacker.getDamage() * this.damageModifier / 100);

        return damage;
    }

    @Override
    public String toString() {
        return "Ultima{" +
                "damageModifier=" + damageModifier +
                ", mpCost=" + mpCost +
                '}';
    }
}
