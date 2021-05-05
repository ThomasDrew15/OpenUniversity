

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
    private Map<String, Bed> beds;

    /**
     * Constructor for objects of class Builder
     */
    public AllotmentCommunity()
    {
        super();
        beds = new HashMap<>(); //Q2aii
    }

    /**
     * Q2aiii
     * @param aBed
     * @param aFirstPlant
     * @param aSecondPlant
     * @param aThirdPlant
     */

    public void addBed(String aBed, String aFirstPlant, String aSecondPlant, String aThirdPlant)
    {
        beds.put(aBed, new Bed(aFirstPlant, aSecondPlant, aThirdPlant));
    }

    /**
     *  Q2aiv
     */
     public void printMap()
     {
         for (String raisedBed : beds.keySet())
         {
             System.out.println(raisedBed + " " + beds.get(raisedBed));
         }
      
     }


    /**
     * Q2b
     * @param bedToFind
     * @return
     */

    public Bed inThisBed(String bedToFind)
    {
        if (beds.containsKey(bedToFind))
        {
            return beds.get(bedToFind);
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
    public HashSet<Bed> whatIsPlantedWith(String plantToFind)
    {
        HashSet<Bed> bedHashSet = new HashSet<>();

        for (Bed i: beds.values())
            if (i.getThirdPlant().equals(plantToFind))
            {
                bedHashSet.add(i);
            }

        return bedHashSet;
    }

}

   
   





    

     




     
