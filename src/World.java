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
    Character character = new Character(Tools.generateRandomInt(), Tools.generateRandomInt(), Tools.inputString("please enter your character's name"));
        System.out.println(character);
    return character;
}
    /**
     * same as characterFactory but with monsters
     */
    public static Monster monsterFactory(){
        Monster monster = new Monster(Tools.generateRandomInt(), Tools.generateRandomInt(), Tools.generateName());
        System.out.println(monster);
        return monster;
    }

    /**
     * class to display the different infos about the world
     *
     */
    public static void displayInformation(){}
}
