
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
   public String longNumber;


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
     String S = longNumber.firstFifteen();
     for (int i = 0; S; i++) {
       int result = 0;
       if (i%2 == 0)
       {
         int evenIndexValue = longNumber.charAt(i)*2;
         if (evenIndexValue > 9);
         evenIndexValue = evenIndexValue - 9;
         result = result + evenIndexValue;
       }
       else
       {
       result = result + longNumber.charAt(i);
     }
   }



          //char S = longNumber.charAt(i);


        //char S = longNumber.charAt(i);
        //System.out.println(S);

 }
