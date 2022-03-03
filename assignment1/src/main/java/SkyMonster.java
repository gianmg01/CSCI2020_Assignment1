
import java.util.ArrayList;
import java.util.Random;
/**
 * This class is used to represent a sky Monster
 * and implements the Monster interface.
 *
 */
public class SkyMonster implements Monster{
    //the list of features the monster has
    ArrayList<String> features = new ArrayList<String>();
    //the strength of the monster
    int strength;

    /**
     * this constructor sets the monster's strength then calls create()
     * @param s used to set strength
     */
    public SkyMonster(int s){
        strength = s;
        create();
    }

    @Override
    public void create(){
        int strengthRemaining = strength;
        Random random = new Random();

        features.add("Strength: " + strength);

        int temp1 = random.nextInt(4);
        switch (temp1){
            case 0 -> features.add("feathery");
            case 1 -> features.add("Scaly");
            case 2 -> features.add("furry");
            default -> features.add("slimy");
        }

        temp1 = random.nextInt(3);
        switch (temp1){
            case 0 -> features.add("magical flight, no wings");
            case 1 -> features.add("2 wings");
            default -> features.add("4 wings");
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
        possibleFeaturesS.add("nocturnal");
        possibleFeaturesI.add(1);
        possibleFeaturesS.add("camouflaged");
        possibleFeaturesI.add(3);
        possibleFeaturesS.add("pack animal");
        possibleFeaturesI.add(2);
        possibleFeaturesS.add("breaths fire");
        possibleFeaturesI.add(8);
        possibleFeaturesS.add("has 4 legs");
        possibleFeaturesI.add(1);
        possibleFeaturesS.add("invisible");
        possibleFeaturesI.add(10);
        possibleFeaturesS.add("sprays venom");
        possibleFeaturesI.add(4);
        possibleFeaturesS.add("poisonous");
        possibleFeaturesI.add(5);
        possibleFeaturesS.add("has 6 eyes");
        possibleFeaturesI.add(1);
        possibleFeaturesS.add("eats plants");
        possibleFeaturesI.add(0);
        possibleFeaturesS.add("eats meat");
        possibleFeaturesI.add(1);
        possibleFeaturesS.add("has a beak");
        possibleFeaturesI.add(1);
        possibleFeaturesS.add("reads minds");
        possibleFeaturesI.add(15);
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
        System.out.println("Your New Sky Monster's features:");
        for (String feature : features) {
            System.out.println("   -" + feature);
        }
    }
}