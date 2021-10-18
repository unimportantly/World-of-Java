/**
 * create a character class
 * give it attributes
 */
public class Character {

    //attributes
    private int hp;
    private int damage;
    private String name;

    //construtors
    public Character(){}
    public Character(int hp, int damage, String name) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
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
