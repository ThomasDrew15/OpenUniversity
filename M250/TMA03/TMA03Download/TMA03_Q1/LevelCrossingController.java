import ou.*;
/**
 * LevelCrossingController for TMA03Q1.
 * 
 * @author M250 Module Team
 * @version 1.0
 */
public class LevelCrossingController
{  
   private Light topLeft;
   private Light topRight;
   private Light bottom;
   
   private boolean trainComing;
  
    /**
     * @return trainComing
     */
    public boolean getTrainComing()
    {
        return trainComing;
    }

    /**
     * @param trainComing
     * setter for trainComing
     */
    public void setTrainComing(boolean trainComing)
    {
        this.trainComing = trainComing;
    }
      
   /**
    * Sets the positions of the lights.
    */
   private void setPositions() 
   {
      this.bottom.setXPos(100);
      this.bottom.setYPos(200);      
      this.topLeft.setXPos(0);
      this.topLeft.setYPos(100);      
      this.topRight.setXPos(200);
      this.topRight.setYPos(100);
   }   
  
   /**
    * Find out how many times red lights should flash at the crossing.
    * Simulates length of train at crossing.
    */   
    public static int findNumRepeats()
    {
       int repeats = 0;
//        String timesAsString =              
//          OUDialog.request("How many times should the red lights"
//          + " flash? ("
//          + LevelCrossingController.MIN_REPEATS
//          + " or over times)");
//                 
//        if (timesAsString != null)
//        {
//           repeats = Integer.parseInt(timesAsString);
//        }
       return repeats;
    }
    
   /**
    * Causes execution to pause for a number of milliseconds.
    */
    public static void delay(int time)
    {
       try
       {
          Thread.sleep(time); 
       }
       catch (Exception e)
       {
          System.out.println(e);
       } 
    }
    
    /**
     * This method should set the colour of the specified light to the specified colour if it is one of OUColour.RED, OUColour.GREEN, OUColour.ORANGE or OUColour.BLACK. 
     * Otherwise the colour should be unchanged. 
     */
    public void colourLight(Light myLight, OUColour colourColour)
    {
       myLight.setColour(colourColour);
    }
       
   
   
   /**
    * Q1bi. State dictates which lights are on and correspond to differing 'Train Coming' actions
    */
    private int State;
    
    /**
    * Qbii. Constructor for lights 
    */

    public LevelCrossingController(String lightOne, String lightTwo, String lightThree)
    {
        this.topLeft = lightOne;
        this.topRight = lightTwo;
        this.bottom = lightThree;

        setPositions();

        State = 0;

        setTrainComing(false);

    }

}


