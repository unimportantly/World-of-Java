package classes;

import attacks.*;
import fighters.Fighter;

import java.util.Arrays;

public class Thief extends MeleeClass {

    //attributes
    private Attack[] thiefAttacks = {new BasicAttack(), new PoisonedAttack(), new SneakAttack()};

    //constructors
    public Thief() {
        super();
    }
    public Thief(int chanceToHitModifier, int mpModifier, int hpModifier, Attack[] thiefAttacks) {
        super(chanceToHitModifier, mpModifier, hpModifier);
        this.thiefAttacks = thiefAttacks;
    }

    //methods

    @Override
    public String toString() {
        return "Thief{" +
                "thiefAttacks=" + Arrays.toString(thiefAttacks) +
                '}';
    }
}
