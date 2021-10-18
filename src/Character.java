/**
 * create a character class
 * give it attributes
 */
public class Character {

    //attributes
    private int hp = (int)Math.random()*100;
    private int damage = (int)Math.random()*10;
    private String name;

    //construtors
    public Character(){}
    public Character(String name) {
        this();
        this.name = name;
    }

    //g&s
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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name: " + this.name + ", HP: " + this.hp + ", damage: " + this.damage;
    }
}
