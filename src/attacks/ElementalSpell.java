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

    //g&s


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.replace(0,12, "Elemental spell : ");
        return sb.toString();
    }
}
