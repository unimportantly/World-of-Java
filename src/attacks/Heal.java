package attacks;

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
        return "Heal{" +
                "damageModifier=" + damageModifier +
                ", mpCost=" + mpCost +
                '}';
    }
}
