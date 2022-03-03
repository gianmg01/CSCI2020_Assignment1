/**
 *<h1>Monster Factory</h1>
 * The FactoryPatternMain class contains the main method of
 * the program which is set to make 4 example monsters and* print their info
 *
 *
 * @since 2022-03-03
 * @author Giancarlo Giannetti 100750967
 */
public class FactoryPatternMain {
    /**
     * This is the main method which makes use of MonsterFactory and Monster.
     * @param args Unused.
     */
    public static void main(String[] args){
        MonsterFactory monsterFactory = new MonsterFactory();

        Monster monster = monsterFactory.getMonsterType("sky", 6);
        monster.printMonster();
        monster = monsterFactory.getMonsterType("ocean", 2);
        monster.printMonster();
        monster = monsterFactory.getMonsterType("mountain", 9);
        monster.printMonster();
        monster = monsterFactory.getMonsterType("forest", 5);
        monster.printMonster();
    }
}
