

import java.util.*;

/**
 * The class Builder is used to hold data about the builder's 
 * on site  contractors, and their contact details and trade. 
 * 
 * @author 
 * @version  
 */
 public class Grower
{
    //Q2ai
    private Map<Gardener, String> gardeners;

    /**
     * Constructor for objects of class Builder
     */
    public Grower()
    {
        super();
        gardeners = new HashMap<>(); //Q2aii
    }

    /**
     * Q2aiii
     * @param aReg
     * @param aName
     * @param anAddress
     * @param aTrade
     */

    public void addContractor(String aReg, String aName, String anAddress, String aTrade)
    {
        gardeners.put(aBed, new Gardener(aFirstName, aSecondName, aLike));
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
     * @param registrationToFind
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
     * @param tradeToFind
     * @return
     */
    public HashSet<Gardener> findGardenerWithLike(String likeToFind)
    {
        HashSet<Gardener> gardenerHashSet = new HashSet<>();

        for (Gardener i: gardeners.values())
            if (i.getLike().equals(likeToFind))
            {
                gardenerHashSet.add(i);
            }

        return gardenerHashSet;
    }

}

   
   





    

     




     
