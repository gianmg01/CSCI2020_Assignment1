
import java.util.Objects;
/**
 * The MonsterFactory class works as an intermediary between a
 * user and the Monster Interface.
 * The user will input what type of monster they want in the form
 * of a string and the strength they want it to be in the form of
 * an int, then the getMonsterType method will construct that
 * monster and return it
 */

public class MonsterFactory {
    /**
     * this method is used to create and return a monster of the specified
     * strength and type
     * @param type this will be the type of monster created (ocean, forest, mountain, sky)
     * @param strength this will be the strength of the monster created
     * @return Monster this returns the generated monster or null
     */
    public Monster getMonsterType(String type, int strength){
        if(Objects.equals(type, "sky")){
            return new SkyMonster(strength);
        }else if (Objects.equals(type, "mountain")){
            return new MountainMonster(strength);
        }else if (Objects.equals(type, "forest")){
            return new ForestMonster(strength);
        }else if (Objects.equals(type, "ocean")){
            return new OceanMonster(strength);
        }else{
            return null;
        }
    }
}
