/**
 * The class Gardener represents a gardner - with first name, 
 * second name and what the gardener likes growing.
 * 
 * @author M250 module team
 * @version v1.0
 */
public class Gardener
{
   private String firstPlant;
   private String secondPlant;
   private String thirdPlant;

   /**
    * Constructor for objects of class Gardener
    */
   public Gardener(String aFirstPlant, String aSecondPlant,
   String aThirdPlant)
   {
      this.firstPlant = aFirstPlant;
      this.secondPlant = aSecondPlant;
      this.thirdPlant = aThirdPlant;
   }
  /**
   * returns the name of the gardener
   */
   public String getFirstPlant()
   {
      return this.firstPlant;
   }
  
   /**
   * returns the address of the gardener
   */
   public String getSecondPlant()
   {
      return this.secondPlant;
   }
  
   /**
   * returns the trade of the gardener
   */
   public String getThirdPlant()
   {
      return this.thirdPlant;
   }
   
   /**
   * returns a string representation of the gardener
   */
   public String toString()
   {
      return (this.getFirstPlant() + ", "
	          + this.getSecondPlant()
			  + this.getThirdPlant());
   }
}

