package classes;

import attacks.*;
import fighters.Fighter;
import global.Tools;

import java.util.Arrays;

public class Mage extends MagicClass {

    //attributes
    private Attack[] attacks = {new BasicAttack(), new ElementalSpell(), new Ultima()};

    //constructors
    public Mage() {
        super();
    }
    public Mage(int chanceToHitModifier, int mpModifier, int hpModifier, Attack[] mageAttacks) {
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
    public Attack[] getMageAttacks() {
        return attacks;
    }
    public void setMageAttacks(Attack[] mageAttacks) {
        this.attacks = mageAttacks;
    }

    @Override
    public String toString() {
        return "Mage{" +
                "attacks=" + Arrays.toString(attacks) +
                '}';
    }

}
