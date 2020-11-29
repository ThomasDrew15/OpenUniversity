
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

   public static boolean isCorrectLength(){
     if (1 == 1){
       return true;
     } else {
       return false;
     }
   }
 }



/**
*no arguments and returns the boolean
*value true if the length of longNumber
*is 16 and false();
*  int length = longNumber.length();
  if (length == 16){
    System.out.println("success");
    return true;
*/
