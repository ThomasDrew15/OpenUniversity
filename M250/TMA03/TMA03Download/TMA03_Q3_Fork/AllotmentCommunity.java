import java.util.*;
import ou.*;

/**
 * A class which simulates a simple dating agency using a map.
 *
 * @author M250 Module Team
 * @version 1.0
 */

public class AllotmentCommunity {
    Map<String, Set<String>> bed = new HashMap<>();
    Set<String> growing = new HashSet<>();

    /**
     * Stores and retrieves data about client names and interests.
     */
    public void populateTestData() {
        growing.add("Carrots");
        growing.add("Potatoes");
        bed.put("bed 1", growing);

        growing = new HashSet<>();
        growing.add("Peas");
        growing.add("Turnips");
        bed.put("bed 2", growing);
    }

    /**
     * Takes no arguments and iterates over all the map's keys to print out a meaningful textual representation
     * of each key in the map and the associated value. Returns no value.
     */
    public void printMap() {
        for (String raisedBed : bed.keySet()) {
            System.out.println(raisedBed + " " + bed.get(raisedBed));
        }

    }

    /**
     * Takes a single argument. If the argument is a key in the map, prints a meaningful textual representation of
     * its associated value, otherwise prints an output line announcing that the key is not present. Returns no value.
     *
     * @param bedToFind
     */
    public void printMapValue(String bedToFind) {
        if (bed.containsKey(bedToFind)) {
            System.out.println("this rasied bed is growing: " + bed.get(bedToFind));
        }
    }

    /**
     * \
     * Takes two arguments representing a key and a value. Adds the key and value to the map.
     * If the key is already present the existing value is overwritten. Returns no value.
     *
     * @param aString
     * @param aSet
     */
    public void addMapEntry(String akey, String aValue)
    {
        growing = new HashSet<>();
        //System.out.println(growing);
        //System.out.println(bed.get(akey));
        List<String> setList = new ArrayList<>(bed.get(akey));
        //System.out.println(setList);
        setList.add(aValue);
        //System.out.println(setList);
        Set<String> growing = new HashSet<>(setList);
        //System.out.println(growing);
        bed.put(akey, growing);
        printMapValue(akey);

    }

    public void removeMapEntry(String akey, String aValue)
    {
        growing = new HashSet<>();
        //System.out.println(growing);
        //System.out.println(bed.get(akey));
        List<String> setList = new ArrayList<>(bed.get(akey));
        //System.out.println(setList);
        setList.remove(aValue);
        //System.out.println(setList);
        Set<String> growing = new HashSet<>(setList);
        //System.out.println(growing);
        bed.put(akey, growing);
        printMapValue(akey);

    }



}


