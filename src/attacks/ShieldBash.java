package attacks;

import fighters.Fighter;
import global.Tools;

public class ShieldBash extends MeleeAttack{

    //attributes

    //constructors
    public ShieldBash() {
        this.chanceToHit = 60;
        this.damageModifier = 120;
        this.mpCost = 40;
    }
    //methods
        //TODO implement a way to stun
    //g&s


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.replace(0,12, "Shield bash : ");
        return sb.toString();
    }
}
