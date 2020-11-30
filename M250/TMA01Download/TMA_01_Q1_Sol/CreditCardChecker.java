
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
   private String longNumber;

   public CreditCardChecker(String ln){
     longNumber = ln;

   }

   public String getLongNumber(){
     return longNumber;

   }

   public boolean isCorrectLength(){
     if (longNumber.length() == 16){
       return true;
     } else {
       return false;
     }
   }
 }
