package classes;

import attacks.*;
import fighters.Fighter;
import global.Tools;

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
    /**
     * pick an attack at random from the list provided by the classes
     * @return attack picked
     */
    @Override
    public Attack getAttack(){
        int index = Tools.generateRandom(0,this.attacks.length -1);
        Attack attack = this.attacks[index];
        return attack;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(". Thief's attacks: " + Arrays.toString(attacks));
        return sb.toString();
    }

}
