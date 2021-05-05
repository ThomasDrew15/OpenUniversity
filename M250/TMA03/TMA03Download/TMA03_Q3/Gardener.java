/**
 * The class Gardener represents a gardner - with first name, 
 * second name and what the gardener likes growing.
 * 
 * @author M250 module team
 * @version v1.0
 */
public class Gardener
{
   private String firstName;
   private String secondName;
   private String likes;

   /**
    * Constructor for objects of class Gardener
    */
   public Gardener(String aFirstName, String aSecondName, 
   String aLike)
   {
      this.firstName = aFirstName;
      this.secondName = aSecondName;
      this.likes = aLike;
   }
  /**
   * returns the name of the gardener
   */
   public String getFirstName()
   {
      return this.firstName;
   }
  
   /**
   * returns the address of the gardener
   */
   public String getSecondName()
   {
      return this.secondName;
   }
  
   /**
   * returns the trade of the gardener
   */
   public String getLike()
   {
      return this.likes;
   }
   
   /**
   * returns a string representation of the gardener
   */
   public String toString()
   {
      return (this.getFirstName() + ", " 
	          + this.getSecondName() 
			  + ", likes: " + this.getLike());
   }
}

