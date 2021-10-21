package classes;

import attacks.*;
import fighters.Fighter;
import global.Tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mage extends MagicClass {

    //attributes
    private Attack[] attacks = {new BasicAttack(), new ElementalSpell(), new Ultima()};

    //constructors
    public Mage() {
        super();
    }
//    public Mage(int chanceToHitModifier, int mpModifier, int hpModifier, Attack[] mageAttacks) {
//        super(chanceToHitModifier, mpModifier, hpModifier);
//        this.attacks = attacks;
//    }

    public Mage(int chanceToHitModifier, int mpModifier, int hpModifier) {
        super(chanceToHitModifier, mpModifier, hpModifier);
    }

    //methods
    /**
     * pick an attack at random from the list provided by the classes
     * @return attack picked
     */
    @Override
    public Attack getAttack(){
        int index = Tools.generateRandom(0,this.attacks.length - 1);
        Attack attack = this.attacks[index];
        return attack;
    }
    //g&s


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(". Mage's attacks: " + Arrays.toString(attacks));
        return sb.toString();
    }


}
