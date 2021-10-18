package attacks;

import fighters.Fighter;

import javax.swing.plaf.basic.BasicToolBarSeparatorUI;

public class BasicAttack implements IAttack{

    //attributes
    int chanceToHit = 80;

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
            damage = (int)Math.round(attacker.getDamage() * 0.6);
        } else{
            System.out.println("The attack was evaded!");
        }
    return damage;
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
    public void setDamage() {

    }

}
