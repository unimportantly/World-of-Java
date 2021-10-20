package classes;

import attacks.Attack;
import attacks.BasicAttack;
import attacks.Heal;
import attacks.HolySpell;
import fighters.Fighter;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Priest extends MagicClass{

    //attributes
    private Attack[] priestAttacks = {new BasicAttack(), new HolySpell(), new Heal()};

    //constructors
    public Priest() {
        super();
    }
    public Priest(int chanceToHitModifier, int mpModifier, int hpModifier, Attack[] priestAttacks) {
        super(chanceToHitModifier, mpModifier, hpModifier);
        this.priestAttacks = priestAttacks;
    }

    //methods

    //g&s


    @Override
    public String toString() {
        return "Priest{" +
                "attacks=" + Arrays.toString(priestAttacks) +
                '}';
    }
}
