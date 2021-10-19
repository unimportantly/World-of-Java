package classes;

import attacks.*;
import fighters.Fighter;

public class Warrior extends MeleeClass implements Classable {

    //attributes
    private Attack[] attacks = {new BasicAttack(), new StrongAttack(), new ShieldBash()};

    //constructors
    public Warrior() {
        super();
    }
    public Warrior(int chanceToHitModifier, int mpModifier, int hpModifier, Attack[] attacks) {
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

}
