package attacks;

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
        return "ShieldBash{" +
                "chanceToHit=" + chanceToHit +
                ", damageModifier=" + damageModifier +
                ", mpCost=" + mpCost +
                '}';
    }
}
