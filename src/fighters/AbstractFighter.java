package fighters;

import classes.Classable;

/**
 * creates an abstract parent class for fighters in WOJ
 * attr & constructors & getters & setters.
 */

public abstract class AbstractFighter implements Fighter{

    //attributes
    protected int hp;
    protected int damage;
    protected String name;
    protected int mp;

    //constructors
    public AbstractFighter() {
        super();
    }
    public AbstractFighter(int hp, int damage, String name){
        this();
        this.hp = hp;
        this.damage = damage;
        this.name = name;
    }

    //methods
    /**
     * attack an opponent & prints the results
     * @param opponent
     */
    public void attack(Fighter attacker, Fighter opponent){
            opponent.defend(this.getDamage());
                System.out.println(this.getName() + "'s attack hit " + opponent.getName() + " for " + this.getDamage() + " points. " + opponent.getName() + " has " + opponent.getHp() + " left.");
        }

    /**
     * calculates the HP left after an attack
     * @param damage
     */
    public void defend(int damage){
        this.setHp(this.getHp() - damage);
    }

    //g&s
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getMp() { return this.mp;}
    public void setMp(int mp) { this.mp = mp;}

}
