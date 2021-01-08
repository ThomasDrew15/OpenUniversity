
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
   /**
   * creates substring of first 15 indexes in the string getLongNumber
   */
   public String firstFifteen(){
          return longNumber.substring(0, 15);
   }
   /**
   * creates check digit from last index of longNumber
   * creates integer from firstFifteen() where odd index values
   * are *2, then -9 if over 9, then added to an integer. Even index
   * values are left alone
   * and added to the same integer as the processed even value indexes
   * that integer is then rounded up to the nearest 10, the check digit is
   * subtracted and the product should be the same as the integer prior to
   * rounding
   */
   int confirmation = 0;
   int result = 0;
   public int calculateCheckNumber(){
     int checkDigit = 0;
     char checkDigitChar = longNumber.charAt(longNumber.length() -1);
     checkDigit = Character.getNumericValue(checkDigitChar);
     System.out.println("Check digit " + checkDigit);
     String Start = firstFifteen();
     //int result = 0;
     int numsForAdd = 0;
     //System.out.println("ahhh" + Start);
     for (int i = 0; i < Start.length(); i++){
        if (i%2 == 0){
         //System.out.print(i);
         char evenIndexValue = Start.charAt(i);
         int eIV = Character.getNumericValue(evenIndexValue);
         eIV = eIV*2;
         if (eIV > 9){
            eIV = eIV - 9;

         }
         result = result + eIV;
         //int even = Character.getNumericValue('i');
         //Start.charAt(i);
         //System.out.println("Crickey" + eIV);
         }
         else{
            char oddIndexValue = Start.charAt(i);
            int oIV = Character.getNumericValue(oddIndexValue);
            //System.out.println(oIV);
            result = result + oIV;
         }
        //System.out.println(result);
        //return result;
        //System.out.println(result);
     }
     //int num = result;
     numsForAdd = result;
     int sum = 0;
     while (numsForAdd > 0) {
        sum = sum + numsForAdd % 10;
        //System.out.println(S);
        numsForAdd = numsForAdd / 10;
     }


     System.out.println("S " + result);
     //System.out.println(sum);
     int finalS = 0;
     finalS = (result /10+1) *10;
     System.out.println("S rounded up " + finalS);

     //int confirmation = 0;
     confirmation = finalS - checkDigit;
     System.out.println("confirmation of S " + confirmation);
     return checkDigit;
   }
   /**
   * Confirms that longNumber could be a valid account number
   */
   public void validNumberResult(){
     if (confirmation != result){
          System.out.println("Isn't valid");
        }
          else{
             System.out.println("Could be valid");
           }
   }
 }
