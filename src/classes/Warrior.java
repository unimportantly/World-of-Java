package classes;

import attacks.*;
import fighters.Fighter;

import java.util.Arrays;

public class Warrior extends MeleeClass implements Classable {

    //attributes
    private Attack[] warriorAttacks = {new BasicAttack(), new StrongAttack(), new ShieldBash()};

    //constructors
    public Warrior() {
        super();
    }
    public Warrior(int chanceToHitModifier, int mpModifier, int hpModifier, Attack[] warriorAttacks) {
        super(chanceToHitModifier, mpModifier, hpModifier);
        this.warriorAttacks = warriorAttacks;
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
        return "Warrior{" +
                "warriorAttacks=" + Arrays.toString(warriorAttacks) +
                '}';
    }
}
