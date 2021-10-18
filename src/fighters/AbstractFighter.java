package fighters;

/**
 * creates an abstract parent class for fighters in WOJ
 * attr & constructors & getters & setters.
 */

public abstract class AbstractFighter implements Fighter{

    //attributes
    protected String name;
    protected int hp;
    protected int damage;



    //constructors
    public AbstractFighter() {}
    public AbstractFighter(int hp, int damage, String name){
        this.name = name;
        this.damage = damage;
        this.hp = hp;
    }

    //methods
    /**
     * attack an opponent & prints the results
     * @param opponent
     */
    public void attack(Fighter opponent){
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


//    public String toString() {
//        return "name: " + this.name + ", HP: " + this.hp + ", damage: " + this.damage;
//    }
}
