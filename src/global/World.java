package global;
import fighters.Character;
import fighters.Fighter;
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
     *
     * @return created character
     */
    public static Character characterFactory() {
        Character character = new Character(Tools.generateRandomInt() + 100, Tools.generateRandomInt() + 50, Tools.generateRandomInt(),Tools.inputString("please enter your character's name"), Tools.choseClass());
        System.out.println(character);
        return character;
    }

    /**
     * same as characterFactory but with monsters
     */
    public static Monster monsterFactory() {
        Monster monster = new Monster(Tools.generateRandomInt() + 100, Tools.generateRandomInt(), Tools.generateName());
        System.out.println(monster);
        return monster;
    }

    /**
     * class to display the different infos about the world
     */
    public static void displayInformation() {
    }

    /**
     * create a method to have the chars & monsters fight
     * one after the other until one dies
     * @param fighter1 & fighter2 & etc?
     */
    public static void fight(Fighter fighter1, Fighter fighter2) {
        while (fighter1.getHp() > 0 && fighter2.getHp() > 0) {
            fighter1.attack(fighter2);
            if (fighter2.getHp() > 0) {
                fighter2.attack(fighter1);
                if (fighter1.getHp() < 0) {
                    System.out.println(fighter1.getName() + " is dead!");
                    break;
                }
            } else {
                System.out.println(fighter2.getName() + " is dead!");
            }

        }
    }
}