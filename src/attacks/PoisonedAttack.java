package attacks;

import fighters.Fighter;
import global.Tools;

public class PoisonedAttack extends MeleeAttack{

    //attributes

    //constructors
    public PoisonedAttack() {
        this.chanceToHit = 70;
        this.damageModifier = 90;
        this.mpCost = 20;
    }
    //methods
    //TODO implement DoT
    //g&s


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.replace(0,12, "Poisoned attack : ");
        return sb.toString();
    }
}
