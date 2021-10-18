import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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
}
