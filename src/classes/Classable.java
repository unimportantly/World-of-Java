package classes;

import attacks.Attack;
import fighters.Fighter;

public interface Classable {

    //methods
    public Attack getAttack();

    //g&s
    public int getChanceToHitModifier();
    public void setChanceToHitModifier(int chanceToHitModifier);
    public int getHpModifier();
    public void setHpModifier(int hpModifier);
    public int getMpModifier();
    public void setMpModifier(int mpModifier);
    public Attack[] getAttacks();
    public void setAttacks(Attack[] attacks);
}
