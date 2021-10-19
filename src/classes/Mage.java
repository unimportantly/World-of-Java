package classes;

import attacks.*;
import fighters.Fighter;

import java.util.Arrays;

public class Mage extends MagicClass {

    //attributes
    private Attack[] mageAttacks = {new BasicAttack(), new ElementalSpell(), new Ultima()};

    //constructors
    public Mage() {
        super();
    }
    public Mage(int chanceToHitModifier, int mpModifier, int hpModifier, Attack[] mageAttacks) {
        super(chanceToHitModifier, mpModifier, hpModifier);
        this.mageAttacks = mageAttacks;
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
                "attacks=" + Arrays.toString(mageAttacks) +
                '}';
    }
}
