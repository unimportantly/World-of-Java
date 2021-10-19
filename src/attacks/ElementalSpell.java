package attacks;

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
        return "ElementalSpell{" +
                "damageModifier=" + damageModifier +
                ", mpCost=" + mpCost +
                '}';
    }
}
