package classes;

import attacks.*;
import fighters.Fighter;

import java.util.Arrays;

public class Thief extends MeleeClass {

    //attributes
    private Attack[] attacks = {new BasicAttack(), new PoisonedAttack(), new SneakAttack()};

    //constructors
    public Thief() {
        super();
    }
    public Thief(int chanceToHitModifier, int mpModifier, int hpModifier, Attack[] attacks) {
        super(chanceToHitModifier, mpModifier, hpModifier);
        this.attacks = attacks;
    }

    //methods
    @Override
    public void attack(Fighter opponent) {
    }
    @Override
    public void defend(int damage) {
    }


    @Override
    public String toString() {
        return "Thief{" +
                "attacks=" + Arrays.toString(attacks) +
                '}';
    }
}
