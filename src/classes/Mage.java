package classes;

import attacks.*;
import fighters.Fighter;

import java.util.Arrays;

public class Mage extends MagicClass {

    //attributes
    private Attack[] attacks = {new BasicAttack(), new ElementalSpell(), new Ultima()};

    //constructors
    public Mage() {
        super();
    }
    public Mage(int chanceToHitModifier, int mpModifier, int hpModifier, Attack[] attacks) {
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

    //g&s


    @Override
    public String toString() {
        return "Mage{" +
                "attacks=" + Arrays.toString(attacks) +
                '}';
    }
}
