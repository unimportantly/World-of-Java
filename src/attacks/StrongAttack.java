package attacks;

import classes.Warrior;
import fighters.Fighter;
import global.Tools;

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
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.replace(0,12, "Strong attack : ");
        return sb.toString();
    }
}
