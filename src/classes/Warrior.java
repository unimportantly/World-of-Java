package classes;

import attacks.*;
import fighters.Fighter;
import global.Tools;

import java.util.Arrays;

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
    public Attack getAttack(){
        int index = Tools.generateRandom(1,this.attacks.length - 1);
        Attack attack = this.attacks[index];
        System.out.println(attack);
        return attack;
    }

    //g&s


    @Override
    public String toString() {
        return "Warrior{" +
                "warriorAttacks=" + Arrays.toString(attacks) +
                '}';
    }

}
