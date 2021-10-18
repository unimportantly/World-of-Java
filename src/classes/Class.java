package classes;

import attacks.Attack;
import global.Tools;

public abstract class Class {

    //attributes
    private String name;
    private Attack[] attacks;

    //methods
    /**
     * get a random attack from the generated list
     */
    public Attack getAttack(){
        int index = Tools.generateRandom(0,attacks.length);
        Attack attack = attacks[index];
        return attack;
    }
}
