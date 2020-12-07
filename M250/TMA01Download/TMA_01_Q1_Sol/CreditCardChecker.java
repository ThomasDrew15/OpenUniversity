
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

   int confirmation = 0;
   int result = 0;
   public void calculateCheckNumber(){
     int checkDigit = 0;
     char checkDigitChar = longNumber.charAt(longNumber.length() -1);
     checkDigit = Character.getNumericValue(checkDigitChar);
     System.out.println("Check digit " + checkDigit);
     String Start = firstFifteen();
     //int result = 0;
     int S = 0;
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
<<<<<<< HEAD
        System.out.print(result);
        for (int i = 0; i < result.length(); i++){
          System.out.println("to make S" + i)


     }

   }
   //return result;

=======
        //System.out.println(result);
        //return result;
        //System.out.println(result);
     }
     //int num = result;
     S = result;
     int sum = 0;
     while (S > 0) {
        sum = sum + S % 10;
        //System.out.println(S);
        S = S / 10;
     }


     System.out.println("S " + result);
     //System.out.println(sum);
     int finalS = 0;
     finalS = (result /10+1) *10;
     System.out.println("S rounded up " + finalS);

     //int confirmation = 0;
     confirmation = finalS - C;
     System.out.println("confirmation of S " + confirmation);
   }

   public void validNumberResult(){
     if (confirmation != result){
          System.out.println("Isn't valid");
        }
          else{
             System.out.println("Could be valid");
           }
   }
>>>>>>> bbe63d654aa48a1b388e8b604b0f76367c507840
 }
