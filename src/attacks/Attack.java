package attacks;

import fighters.Fighter;

public interface Attack {

    public int launchAttack(Fighter attacker, Fighter defender);

    public int getDamageModifier();
    public void setDamageModifier(int damageModifier);
    public int getMpCost();
    public void setMpCost(int mpCost);


}
