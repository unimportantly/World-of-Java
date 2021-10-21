package global;
import classes.Classable;
import fighters.Character;
import fighters.Fighter;
import fighters.Group;
import fighters.Monster;

import java.util.*;

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
        Character character = new Character(Tools.generateRandomInt() + 100, Tools.generateRandomInt() + 50,
        Tools.generateRandomInt(),Tools.inputString("please enter your character's name"), Tools.choseClass());
        character.setHp(character.getHp() + character.getAClass().getHpModifier());
        character.setMp(character.getMp() + character.getAClass().getMpModifier());
        System.out.println(character);
        return character;
    }

    /**
     * create a group of characters
     * @return a group of characters
     */
    public static Group groupCharacterFactory(int numberOfPeopleInGroup){
        Group characterGroup = null;
        for (int i = 0; i > numberOfPeopleInGroup; i++){
            characterGroup.addFighter(characterFactory());
        }
        return characterGroup;
    }
    /**
     * same as characterFactory but with monsters
     */
    public static Monster monsterFactory() {
        Monster monster = new Monster(Tools.generateRandomInt() + 100, Tools.generateRandomInt(),
                Tools.generateName());
        System.out.println(monster);
        return monster;
    }

    /**
     * create a group of monsters
     * @return a group of monsters
     */
    public static Group groupMonsterFactory(int numberOfMonstersInGroup){
        Group monsterGroup = null;
        for (int i = 0; i > numberOfMonstersInGroup; i++){
            monsterGroup.addFighter(monsterFactory());
        }
        return monsterGroup;
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
    public static void fight(Group fighter1, Group fighter2) {
        while (!fighter1.isDead() && !fighter2.isDead()) {
            fighter1.attack(fighter1, fighter2);
            //checks if second fighter is alive to attack
            if (!fighter2.isDead()) {
                fighter2.attack(fighter2, fighter1);
                //alive check
                if (fighter1.isDead()) {
                    System.out.println(fighter1.getGroup() + " is dead!");
                    break;
                }
            } else {
                System.out.println(fighter2.getGroup() + " is dead!");
            }
        }
    }
}
