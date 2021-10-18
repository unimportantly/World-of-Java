package attacks;

import fighters.Fighter;

public class StrongAttack extends AbstractAttack implements Attack{

    //constructors
    public StrongAttack(){
        super();
    }
    public StrongAttack(int chanceToHit, int damageModifier) {
        super(chanceToHit, damageModifier);
    }


    @Override
    public int launchAttack(Fighter attacker, Fighter defender) {
        return 0;
    }
    @Override
    public String getName() {
        return null;
    }
    @Override
    public void setName(String name) {
    }
    @Override
    public int getDamage() {
        return 0;
    }
    @Override
    public void setDamage(int damage) {
    }
}
