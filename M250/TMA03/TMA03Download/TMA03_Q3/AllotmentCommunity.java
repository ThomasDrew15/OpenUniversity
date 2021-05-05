

import java.util.*;

/**
 * The class Builder is used to hold data about the builder's 
 * on site  contractors, and their contact details and trade. 
 * 
 * @author 
 * @version  
 */
 public class AllotmentCommunity
{
    //Q2ai
    private Map<Gardener, String> gardeners;

    /**
     * Constructor for objects of class Builder
     */
    public AllotmentCommunity()
    {
        super();
        gardeners = new HashMap<>(); //Q2aii
    }

    /**
     * Q2aiii
     * @param aBed
     * @param aFirstPlant
     * @param aSecondPlant
     * @param aThirdPlant
     */

    public void addGardener(String aBed, String aFirstPlant , String aSecondPlant, String aThirdPlant)
    {
        gardeners.put(aBed, new Gardener(aFirstPlant, aSecondPlant, aThirdPlant));
    }

    /**
     *  Q2aiv
     */
     public void printGardener()
     {
         for (String aBed : gardeners.keySet())
         {
             System.out.println(gardeners);
         }
     }


    /**
     * Q2b
     * @param bedToFind
     * @return
     */

    public Gardener findGardener(String bedToFind)
    {
        if (gardeners.containsKey(bedToFind))
        {
            return gardeners.get(bedToFind);
        }
        else
        {
            System.out.println(bedToFind + " cannot be found.");
            return null;
        }
    }


    /**
     * Q2c
     * @param plantToFind
     * @return
     */
    public HashSet<Gardener> findGardenerWithLike(String plantToFind)
    {
        HashSet<Gardener> gardenerHashSet = new HashSet<>();

        for (Gardener i: gardeners.values())
            if (i.getThirdPlant().equals(plantToFind))
            {
                gardenerHashSet.add(i);
            }

        return gardenerHashSet;
    }

}

   
   





    

     




     
