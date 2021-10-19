package attacks;

public class ShieldBash extends MeleeAttack{

    //attributes

    //constructors
    public ShieldBash() {
        this.chanceToHit = 60;
        this.damageModifier = 120;
        this.mpCost = 40;
    }
    //methods
        //TODO implement a way to stun

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
