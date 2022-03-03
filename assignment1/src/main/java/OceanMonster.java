
import java.util.ArrayList;
import java.util.Random;

/**
 * This class is used to represent an Ocean Monster
 * and implements the Monster interface.
 */
public class OceanMonster implements Monster{
    //the list of features the monster has
    ArrayList<String> features = new ArrayList<String>();
    //the strength of the monster
    int strength;

    /**
     * this constructor sets the monsters strength then calls create()
     * @param s used to set strength
     */
    public OceanMonster(int s){
        strength = s;
        create();
    }

    @Override
    public void create(){
        int strengthRemaining = strength;
        Random random = new Random();

        features.add("Strength: " + strength);

        int temp1 = random.nextInt(3);
        switch (temp1){
            case 0 -> features.add("rubbery");
            case 1 -> features.add("Scaly");
            default -> features.add("slimy");
        }



        while(true){
            int size = random.nextInt(5);
            String temp2;
            switch (size) {
                case 0 -> {
                    temp1 = -3;
                    temp2 = "tiny";
                }
                case 1 -> {
                    temp1 = -1;
                    temp2 = "small";
                }
                case 2 -> {
                    temp1 = 0;
                    temp2 = "normal size";
                }
                case 3 -> {
                    temp1 = 3;
                    temp2 = "large";
                }
                case 4 -> {
                    temp1 = 7;
                    temp2 = "huge";
                }
                default -> {
                    temp1 = 1000;
                    temp2 = "error";
                }
            }
            if(temp1 <= strengthRemaining){
                strengthRemaining += temp1;
                features.add(temp2);
                break;
            }
        }

        ArrayList<String> possibleFeaturesS = new ArrayList<String>();
        ArrayList<Integer> possibleFeaturesI = new ArrayList<Integer>();
        possibleFeaturesS.add("has tentacles");
        possibleFeaturesI.add(2);
        possibleFeaturesS.add("camouflaged");
        possibleFeaturesI.add(3);
        possibleFeaturesS.add("pack animal");
        possibleFeaturesI.add(2);
        possibleFeaturesS.add("electric body");
        possibleFeaturesI.add(8);
        possibleFeaturesS.add("bottom feeder");
        possibleFeaturesI.add(1);
        possibleFeaturesS.add("sprays ink");
        possibleFeaturesI.add(2);
        possibleFeaturesS.add("sprays venom");
        possibleFeaturesI.add(4);
        possibleFeaturesS.add("has shell");
        possibleFeaturesI.add(2);
        possibleFeaturesS.add("super fast");
        possibleFeaturesI.add(5);
        possibleFeaturesS.add("eats plants");
        possibleFeaturesI.add(0);
        possibleFeaturesS.add("eats meat");
        possibleFeaturesI.add(1);
        possibleFeaturesS.add("has 4 eyes");
        possibleFeaturesI.add(1);
        possibleFeaturesS.add("needs oxygen");
        possibleFeaturesI.add(0);
        possibleFeaturesS.add("sharp teeth");
        possibleFeaturesI.add(6);

        do {
            temp1 = random.nextInt(possibleFeaturesI.size());

            if (possibleFeaturesI.get(temp1) <= strengthRemaining) {
                strengthRemaining -= possibleFeaturesI.get(temp1);
                features.add(possibleFeaturesS.get(temp1));
                possibleFeaturesI.remove(temp1);
                possibleFeaturesS.remove(temp1);
            }

        } while (strengthRemaining != 0);

    }
    @Override
    public void printMonster(){
        System.out.println("Your New Ocean Monster's features:");
        for (String feature : features) {
            System.out.println("   -" + feature);
        }
    }
}
