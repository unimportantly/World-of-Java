package attacks;

import classes.Warrior;
import fighters.Fighter;

public class StrongAttack extends MeleeAttack {

    //attributes

    //constructors
    public StrongAttack() {
        this.chanceToHit = 60;
        this.damageModifier = 120;
        this.mpCost = 20;
    }
    //methods

    //g&s


    @Override
    public String toString() {
        return "StrongAttack{" +
                "chanceToHit=" + chanceToHit +
                ", damageModifier=" + damageModifier +
                ", mpCost=" + mpCost +
                '}';
    }
}
