package attacks;

import fighters.Fighter;

public class BasicAttack extends AbstractAttack implements Attack {

    //constructors
    public BasicAttack(){
        super();
    }
    public BasicAttack(int chanceToHit, int damageModifier) {
        super(chanceToHit, damageModifier);
    }

    //methods
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