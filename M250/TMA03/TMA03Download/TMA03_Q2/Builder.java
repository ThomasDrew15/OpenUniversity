

import java.util.*;

/**
 * The class Builder is used to hold data about the builder's 
 * on site  contractors, and their contact details and trade. 
 * 
 * @author 
 * @version  
 */
 public class Builder
{
    //Q2ai
    private Map<String, Contractor> contractors;

    /**
     * Constructor for objects of class Builder
     */
    public Builder()
    {
        super();
        contractors = new HashMap<>(); //Q2aii
    }

    /**
     * Q2aiii
     * @param aReg
     * @param aName
     * @param anAddress
     * @param aTrade
     */

    public void addContraactor(String aReg, String aName, String anAddress, String aTrade)
    {
        contractors.put(aReg, new Contractor(aName, anAddress, aTrade));
    }

    /**
     *  Q2aiv
     */
     public void printContractor()
     {
         for (String aReg : contractors.keySet())
         {
             System.out.println(contractors);
         }
     }


    /**
     * Q2b
     * @param registrationToFind
     * @return
     */

    public Contractor findContractor(String registrationToFind)
    {
        if (contractors.containsKey(registrationToFind))
        {
            return contractors.get(registrationToFind);
        }
        else
        {
            System.out.println(registrationToFind + " cannot be found.");
            return null;
        }
    }


    /**
     * Q2c
     * @param tradeToFind
     * @return
     */
    public HashSet<Contractor> findContractorsForTrade(String tradeToFind)
    {
        HashSet<Contractor> contractorHashSet = new HashSet<>();

        for (Contractor i: contractors.values())
            if (i.getTrade().equals(tradeToFind))
            {
                contractorHashSet.add(i);
            }

        return contractorHashSet;
    }

}

   
   





    

     




     
