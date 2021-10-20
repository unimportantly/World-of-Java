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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.replace(0,12, "Ultima : ");
        return sb.toString();
    }
}
