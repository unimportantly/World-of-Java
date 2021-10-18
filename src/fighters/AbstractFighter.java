package fighters;

/**
 * creates an abstract parent class for fighters in WOJ
 * attr & constructors & getters & setters.
 */

public class AbstractFighter {

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

//    public String toString() {
//        return "name: " + this.name + ", HP: " + this.hp + ", damage: " + this.damage;
//    }
}
