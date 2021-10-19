package classes;

import attacks.Attack;
import global.Tools;

public abstract class MeleeClass implements Classable {

    //attributes
    private int chanceToHitModifier = 120;
    private int mpModifier = -30;
    private int hpModifier = +50;
    private Attack[] attacks;

    //constructors
    public MeleeClass(){}
    public MeleeClass(int chanceToHitModifier, int mpModifier, int hpModifier) {
        this.chanceToHitModifier = chanceToHitModifier;
        this.mpModifier = mpModifier;
        this.hpModifier = hpModifier;
    }


    //methods
    /**
     * get a random attack from the generated list
     */
    public Attack getAttack(){
        int index = Tools.generateRandom(1,attacks.length);
        Attack attack = attacks[index];
        return attack;
    }

    //g&s
    public int getChanceToHitModifier() {
        return chanceToHitModifier;
    }
    public void setChanceToHitModifier(int chanceToHitModifier) {
        this.chanceToHitModifier = chanceToHitModifier;
    }
    public int getMpModifier() {
        return mpModifier;
    }
    public void setMpModifier(int mpModifier) {
        this.mpModifier = mpModifier;
    }
    public int getHpModifier() {
        return hpModifier;
    }
    public void setHpModifier(int hpModifier) {
        this.hpModifier = hpModifier;
    }
    @Override
    public Attack[] getAttacks() {
        return attacks;
    }
    @Override
    public void setAttacks(Attack[] attacks) {
        this.attacks = attacks;
    }

    @Override
    public String toString() {
        return "MeleeClass{" +
                "chanceToHitModifier=" + chanceToHitModifier +
                ", mpModifier=" + mpModifier +
                ", hpModifier=" + hpModifier +
                '}';
    }
}
