package attacks;

public class PoisonedAttack extends MeleeAttack{

    //attributes

    //constructors
    public PoisonedAttack() {
        this.chanceToHit = 70;
        this.damageModifier = 90;
        this.mpCost = 20;
    }
    //methods
    //TODO implement DoT

    //g&s


    @Override
    public String toString() {
        return "PoisonedAttack{" +
                "chanceToHit=" + chanceToHit +
                ", damageModifier=" + damageModifier +
                ", mpCost=" + mpCost +
                '}';
    }
}
