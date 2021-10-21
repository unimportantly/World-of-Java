package classes;

import attacks.Attack;
import global.Tools;

import java.util.ArrayList;
import java.util.List;

public abstract class MagicClass implements Classable {

    //attributes
    private int chanceToHitModifier = 80;
    private int mpModifier = 80;
    private int hpModifier = -30;
    protected Attack[] attacks;

    //constructors
    public MagicClass(){}
    public MagicClass(int chanceToHitModifier, int mpModifier, int hpModifier) {
        this.chanceToHitModifier = chanceToHitModifier;
        this.mpModifier = mpModifier;
        this.hpModifier = hpModifier;
    }

    //methods
    /**
     * pick an attack at random from the list provided by the classes
     * @return attack picked
     */
    public Attack getAttack(){
        int index = Tools.generateRandom(0,this.attacks.length);
        Attack attack = this.attacks[index];
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
    public void setAttacks(Attack[] attacks) {
        this.attacks = attacks;
    }

    @Override
    public String toString() {
        return "MagicClass: " +
                "chanceToHitModifier: " + chanceToHitModifier +
                ", mpModifier: " + mpModifier +
                ", hpModifier: " + hpModifier;
    }
}
