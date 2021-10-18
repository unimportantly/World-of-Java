import java.util.Scanner;

public class Tools {

    public static String inputString(String message) {
        // imprime le message specifique a chaque fonction
        System.out.println(message);
        // Un scanner permet de detecter l'input de l'utilisateur
        Scanner scan = new Scanner(System.in);
        // On recupere son input
        return scan.nextLine();
    }
    public static int generateRandomDamage() {

        int randomNumber = (int)Math.round(Math.random()*10);
        return randomNumber;
    }
    public static int generateRandomHP() {

        int randomNumber = (int)Math.round(Math.random()*100);
        return randomNumber;
    }
}
