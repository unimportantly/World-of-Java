import fighters.Character;
import fighters.Monster;

public abstract class World {

/**
 * create a world in which we'll store the methods to populate it
 * has to be accessible from everywhere
 * not supposed to be instanciated
 */

    /**
     * class to emulate character creation
     * atk & hp are randomized because people cheat
     * name is user-input
     * @return created character
     */
    public static Character characterFactory(){
    Character character = new Character(Tools.generateRandomInt() +100, Tools.generateRandomInt(), Tools.inputString("please enter your character's name"));
        System.out.println(character);
    return character;
}
    /**
     * same as characterFactory but with monsters
     */
    public static Monster monsterFactory(){
        Monster monster = new Monster(Tools.generateRandomInt() +100, Tools.generateRandomInt(), Tools.generateName());
        System.out.println(monster);
        return monster;
    }

    /**
     * class to display the different infos about the world
     *
     */
    public static void displayInformation(){}

    /**
     * create a method to have the chars & monsters fight
     * one after the other until one dies
     * @param character & monster
     *
     */
    public static void fight(Character character, Monster monster){

        while (character.getHp() > 0 && monster.getHp() > 0){
            monster.setHp(monster.getHp() - character.getDamage());
            System.out.println(character.getName() + "'s attack hit " + monster.getName() + " for " + character.getDamage() + " points. " + monster.getName() + " has " + monster.getHp() + " left.");
            if (monster.getHp() <= 0) {
                System.out.println(monster.getName() + " is dead!");
            }
            else {
                character.setHp(character.getHp() - monster.getDamage());
                System.out.println(monster.getName() + "'s attack hit " + character.getName() + " for " + monster.getDamage() + " points. " + character.getName() + " has " + character.getHp() + " left.");
                if (character.getHp() <= 0) {
                    System.out.println(character.getName() + " is dead!");
                }
            }
        }
    }
}
