package fighters;

import attacks.Attack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Group implements Fighter{

    //attributes
    List<Fighter> group;

    //constructor
    public Group(List<Fighter> group) {
        this.group = new ArrayList<>();
    }

    //methods
    public void addFighter(Fighter fighter){
        this.group.add(fighter);
    }
    public boolean isDead(){
        int deadFighters = 0;
        boolean isDead = false;
        for (Fighter fighter : group) {
            if (fighter.getHp() < 0){
                deadFighters++;
            }
        }if (deadFighters == group.size()){
            System.out.println("All members of the party have died //sadface emoji//");
            isDead = true;
        }return isDead;
    }
    public void characterAttack(Fighter attacker, Fighter opponent){
        Attack skillPicked = ((Character) attacker).getAClass().getAttack();
        int skillUsed = 0;
        while (skillUsed == 0) {
            //check if skill can be used
            if (attacker.getMp() < skillPicked.getMpCost()) {
                System.out.println("you don't have enough mp to use that skill!");
                skillPicked = ((Character) attacker).getAClass().getAttack();
            } else {
                System.out.println(attacker.getName() + " uses " + skillPicked);
                ((Character) attacker).setMp(attacker.getMp() - skillPicked.getMpCost());
                opponent.defend(skillPicked.launchAttack(attacker));
                System.out.println(this.getName() + "'s attack hit " + opponent.getName() + " for "
                        + (skillPicked.launchAttack(attacker)) + " points. " + opponent.getName() + " has "
                        + opponent.getHp() + " left.");
                skillUsed ++;
            }
        }
    }
    @Override
    /**
     * finds a suitable fighter
     * have it attack
     */
    public void attack(Fighter attacker, Fighter opponent) {
        Fighter singleAttacker;
        attacker.
        Collections.shuffle(this.group);
        singleAttacker = this.group.get(0);
        if (singleAttacker instanceof Character) {
            characterAttack(singleAttacker, opponent);
        } else {
            opponent.defend(this.getDamage());
            System.out.println(this.getName() + "'s attack hit " + opponent.getName() + " for " + this.getDamage() +
                    " points. " + opponent.getName() + " has " + opponent.getHp() + " left.");
        }
    }

    /**
     * finds a suitable defender & check for life
     * @param damage received to be used by the attack method
     */
    @Override
    public void defend(int damage) {
        Collections.shuffle(this.group);
        if (this.group.get(0).getHp() > 0) {
            this.group.get(0).setHp(this.group.get(0).getHp() - damage);
        } else {
            Collections.shuffle(this.group);
        }
    }

    //g&s
    @Override
    public String getName() {
        return null;
    }
    @Override
    public void setName(String name) {
    }
    @Override
    public int getHp() {
        return 0;
    }
    @Override
    public void setHp(int hp) {
    }
    @Override
    public int getDamage() {
        return 0;
    }
    @Override
    public void setDamage(int damage) {
    }
    @Override
    public int getMp() {
        return 0;
    }
    @Override
    public void setMp(int mp) {
    }
    public List<Fighter> getGroup() {
        return group;
    }
    public void setGroup(List<Fighter> group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Group{" +
                "group=" + group +
                '}';
    }
}
