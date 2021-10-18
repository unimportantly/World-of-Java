package attacks;

import fighters.Fighter;

public interface Attack {

    public int launchAttack(Fighter attacker, Fighter defender);

    public String getName();
    public void setName(String name);
    public int getDamage();
    public void setDamage(int damage);

}
