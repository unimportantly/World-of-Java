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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.replace(0,12, "Heal spell : ");
        return sb.toString();
    }
}
