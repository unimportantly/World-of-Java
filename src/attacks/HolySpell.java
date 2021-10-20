package attacks;

import fighters.Fighter;

public class HolySpell extends MagicAttack{

    //attributes

    //constructors
    public HolySpell() {
        this.damageModifier = 150;
        this.mpCost = 50;
    }
    //methods

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.replace(0,12, "Holy spell : ");
        return sb.toString();
    }
}
