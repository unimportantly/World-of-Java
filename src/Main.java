public class Main {

    public static void main(String[] args){

        /**
         * creates a character with all their attributes
         * asks for user input for the name
         * returns a character object
         */
        public static Character characterFactory(){
            Character character = new Character(Tools.inputString("please enter your character's name"));
            return character;
        }
    }
}
