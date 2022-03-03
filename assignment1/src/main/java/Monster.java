/**
 * This interface serves to define the methods necessary
 * in each of the monster subclasses: OceanMonster,
 * ForestMonster, MountainMonster and SkyMonster.
 *
 */

public interface Monster {
    /**
     * this method is used to randomly generate the monster with
     * the desired strength and adds all values to the features
     */
    void create();
    /**
     * this method is used print the attributes of the monster
     */
    void printMonster();
}
