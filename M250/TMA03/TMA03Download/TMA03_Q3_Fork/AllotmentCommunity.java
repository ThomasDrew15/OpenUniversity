import java.util.*;
import ou.*;

/**
 * A class which simulates a simple dating agency using a map.
 *
 * @author M250 Module Team
 * @version 1.0
 */

public class AllotmentCommunity
{
    Map<String, Set<String>> bed = new HashMap<>();
    Set<String> growing = new HashSet<>();

    /**
     * Stores and retrieves data about client names and interests.
     */
    public void populate()
    {
        growing.add("Carrots");
        growing.add("Potatoes");
        bed.put("bed 1", growing);

        growing = new HashSet<>();
        growing.add("Peas");
        growing.add("Turnips");
        bed.put("bed 2", growing);
    }






}