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
}
