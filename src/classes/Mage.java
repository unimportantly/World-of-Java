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

    //g&s
    public Attack[] getMageAttacks() {
        return mageAttacks;
    }
    public void setMageAttacks(Attack[] mageAttacks) {
        this.mageAttacks = mageAttacks;
    }

    @Override
    public String toString() {
        return "Mage{" +
                "attacks=" + Arrays.toString(mageAttacks) +
                '}';
    }
}
