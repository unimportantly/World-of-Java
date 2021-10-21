package fighters;

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
    @Override
    public void attack(Fighter attacker, Fighter opponent) {
        Collections.shuffle(this.group);
        this.group.get(0).equals(attacker);
        attacker.attack(attacker, opponent);
    }
    @Override
    public void defend(int damage) {
        Collections.shuffle(this.group);
        if (this.group.get(0).getHp() > 0){
            this.group.get(0).defend(damage);
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


}
