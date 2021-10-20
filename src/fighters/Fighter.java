package fighters;

public interface Fighter {

    //methods
    public void attack(Fighter attacker, Fighter opponent);
    public void defend(int damage);

    //g&s
    public String getName();
    public void setName(String name);
    public int getHp();
    public void setHp(int hp);
    public int getDamage();
    public void setDamage(int damage);
}
