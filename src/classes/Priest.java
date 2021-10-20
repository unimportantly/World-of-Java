package classes;

import attacks.Attack;
import attacks.BasicAttack;
import attacks.Heal;
import attacks.HolySpell;
import fighters.Fighter;
import global.Tools;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Priest extends MagicClass{

    //attributes
    private Attack[] attacks = {new BasicAttack(), new HolySpell(), new Heal()};

    //constructors
    public Priest() {
        super();
    }
    public Priest(int chanceToHitModifier, int mpModifier, int hpModifier, Attack[] attacks) {
        super(chanceToHitModifier, mpModifier, hpModifier);
        this.attacks = attacks;
    }

    //methods
    @Override
    public Attack getAttack(){
        int index = Tools.generateRandom(0,this.attacks.length - 1);
        Attack attack = this.attacks[index];
        return attack;
    }
    //g&s


    @Override
    public String toString() {
        return "Priest{" +
                "attacks=" + Arrays.toString(attacks) +
                '}';
    }
}
