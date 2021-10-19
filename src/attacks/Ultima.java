package attacks;

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
        return "Ultima{" +
                "damageModifier=" + damageModifier +
                ", mpCost=" + mpCost +
                '}';
    }
}
