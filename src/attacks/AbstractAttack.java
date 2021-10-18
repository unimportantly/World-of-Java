package attacks;

import fighters.Fighter;

public abstract class AbstractAttack implements Attack{

    //attributes
    protected int chanceToHit;
    protected int damageModifier;

    //constructors
    public AbstractAttack(){
        super();
    }
    public AbstractAttack(int chanceToHit, int damageModifier) {
        super();
        this.chanceToHit = chanceToHit;
        this.damageModifier = damageModifier;
    }

    //methods
    /**
     * calculate the chance to hit
     * resolve if the attack has hit
     * if it has, calculate the damage
     * @param attacker the one who launches the attack
     * @param defender the one who it is launched at
     * @return damage done
     */
    public int launchAttack(Fighter attacker, Fighter defender) {
        int damage = 0;
        if (chanceToHit > (int)Math.round(Math.random()*100)){
            System.out.println("The attack lands!");
            damage = (int)Math.round(attacker.getDamage() * damageModifier);
        } else{
            System.out.println("The attack was evaded!");
        }
        return damage;
    }


}
