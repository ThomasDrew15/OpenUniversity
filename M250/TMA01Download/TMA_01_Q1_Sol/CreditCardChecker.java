
/**
 * Write a description of class CreditCardChecker here.
 *
 * @author (Tom Drew)
 * @version (29/11/2020)
 */

 /**
  * Constructor for objects of class CreditCardChecker
  */
 public class CreditCardChecker {
   /**
    * instance variable longNumber is
    * a string
    */
   private String longNumber;


   /**
    * Constructor for CCC
    */
   public CreditCardChecker(String ln){
     longNumber = ln;

   }
   /**
    * getter method for longNumber
    */
   public String getLongNumber(){
     return longNumber;

   }
   /**
    * boolean method to check longNumber
    * is 16 digits long. True if so,
    * false if not
    */
   public boolean isCorrectLength(){
     if (longNumber.length() == 16){
       return true;
     } else {
       return false;
     }
   }

   public String firstFifteen(){
          return longNumber.substring(0, 15);
   }

   public void calculateCheckNumber(){
     String S = longNumber.substring(0, 15);
     for (int i = 0, n = S.length(); i < n; i=i+2) {
       char c = S.charAt(i);
     //System.out.println(S);
     System.out.print(c);
     }



   }
}
