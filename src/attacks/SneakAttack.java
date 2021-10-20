package attacks;

import fighters.Fighter;
import global.Tools;

public class SneakAttack extends MeleeAttack{

    //attributes

    //constructors
    public SneakAttack() {
        this.chanceToHit = 60;
        this.damageModifier = 200;
        this.mpCost = 50;
    }
    //methods

    //g&s


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.replace(0,12, "Sneak attack : ");
        return sb.toString();
    }
}
