package attacks;

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
        return "HolySpell{" +
                "damageModifier=" + damageModifier +
                ", mpCost=" + mpCost +
                '}';
    }
}
