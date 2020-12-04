
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
      String Start = firstFifteen();
      //System.out.println("ahhh" + Start);
     for (int i = 0; i < Start.length(); i++){
        int result = 0;
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
         System.out.print(result);



       //System.out.println("awooga" + Character.getNumericValue('i'));

       //System.out.print("bongos" + i);
       //System.out.println("gerryrig" + evenIndexValue);
     }
   }
 }
