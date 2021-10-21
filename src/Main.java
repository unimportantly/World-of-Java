
import fighters.Fighter;
import fighters.Group;
import global.Tools;
import global.World;

import java.util.List;

public class Main {

    public static void main(String[] args){

//World.fight(World.groupCharacterFactory(4),World.groupMonsterFactory(2));
//        int index = Tools.generateRandom(0,3 -1);
//        System.out.println(index);
        Group group1 = World.groupCharacterFactory(4);

        Group group2 = World.groupMonsterFactory(2);
     //   World.fight(group1,group2);
    }
}
