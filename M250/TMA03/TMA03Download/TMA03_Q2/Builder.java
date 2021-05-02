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
    /**
     * Constructor for objects of class Builder
     */
    public Builder()
    {
        super();
        contractors = new HashMap<>();
    }

    private Map<String, Contractor> contractors;

    public void addContractor(String aReg, String aName, String anAddress, String aTrade)
    {
        contractors.put(aReg, new Contractor(aName, anAddress, aTrade));
    }

    public void printContractor()
    {
        for (String aReg : contractors.keySet())
        {
            System.out.println(contractors);
        }
    }

    public Contractor findContractor(String regFind)
    {
        Set<String> contractorsKeys = contractors.keySet(); for (String aReg: contractorsKeys)
        {
            System.out.println("registration " + regFind + " is " + contractors.get(regFind));
            Contractor = regFind;
            return Contractor;
        }

    }

    //public String findContractorsForTrade(String trade)
    //{
        //Set<String> tradeSet = new HashSet<String>();

        //contractors.put("plumber", getContractor);
        //tradeSet = contractors.get(trade);
        //System.out.println("the trade is "
                //+ tradeSet);

        //for (String aTrade : contractors.keySet())
        //{
        //    tradeSet = contractors.get(aTrade);
          //  System.out.println(aTrade + " is interested in: "
            //        + tradeSet);
        //}
    //}



}
   
   





    

     




     
