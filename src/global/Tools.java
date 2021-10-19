package global;
import classes.*;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Tools {

    //asks for a text input from the user
    public static String inputString(String message) {
        // imprime le message specifique a chaque fonction
        System.out.println(message);
        // Un scanner permet de detecter l'input de l'utilisateur
        Scanner scan = new Scanner(System.in);
        // On recupere son input
        return scan.nextLine();
    }

    //generate a random int between 1 & 100
    public static int generateRandomInt() {
        int randomNumber = (int)Math.round(Math.random()*100);
        return randomNumber;
    }

    //generates a random name from two string arrays
    public static String generateName(){
        String[] firstPart = {"cat", "dog", "tiger", "horse", "eagle", "whale", "antilope", "viper", "salamander", "shark", "albatros"};
        String[] lastPart = {"fire", "ice", "thunder", "war", "old", "feeble", "vivacious", "giant", "tiny", "famished", "well-fed"};
        List<String> firstPartList = Arrays.asList(firstPart);
        Collections.shuffle(firstPartList);
        firstPartList.toArray(firstPart);
        List<String> lastPartList = Arrays.asList(lastPart);
        Collections.shuffle(lastPartList);
        lastPartList.toArray(lastPart);
        String monsterName = lastPart[0] + " " + firstPart[0];
        return monsterName;
    }
    //generaterandom
    public static int generateRandom(int min, int max) {

        int randomNumber = (ThreadLocalRandom.current().nextInt(max - min + 1)) + 1;
        return randomNumber;
    }

    //chose a class

    /**
     * asks the user to pick from 4 classes
     * @return the class picked
     */
    public static Classable choseClass() {
        Classable chosenClass = null;
        while (chosenClass == null) {
            String classPick = Tools.inputString("Please pick a class between warrior, mage, thief and priest");
            if (classPick.toLowerCase(Locale.ROOT).equals("warrior")) {
                chosenClass = new Warrior();
                System.out.println("You have chosen to be a warrior!");
            } else if (classPick.toLowerCase(Locale.ROOT).equals("thief")) {
                chosenClass = new Thief();
                System.out.println("You have chosen to be a thief!");
            } else if (classPick.toLowerCase(Locale.ROOT).equals("mage")) {
                chosenClass = new Mage();
                System.out.println("You have chosen to be a mage!");
            } else if (classPick.toLowerCase(Locale.ROOT).equals("priest")) {
                chosenClass = new Priest();
                System.out.println("You have chosen to be a priest!");
            } else {
                System.out.println("Please pick one of the classes provided");
            }
        }
        return chosenClass;
    }
}
