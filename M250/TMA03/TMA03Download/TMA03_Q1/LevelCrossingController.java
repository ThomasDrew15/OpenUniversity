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
        String timesAsString =
          OUDialog.request("How many times should the red lights"
          + " flash? ("
          + LevelCrossingController.MIN_REPEATS
          + " or over times)");

        if (timesAsString != null)
        {
            try
            {
                repeats = Integer.parseInt(timesAsString);
                if (timesAsString < 4)
                {
                    OUDialog.alert("Select a number higher than four");
                }
            }
            catch (Exception e)
            {
                System.out.println(e + " Please enter an integer");
            }
        }
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
     * Qa This method should set the colour of the specified light to the specified colour if it is one of OUColour.RED, OUColour.GREEN, OUColour.ORANGE or OUColour.BLACK.
     * Otherwise the colour should be unchanged. 
     */
    public void colourLight(Light myLight, OUColour colour)
    {
       myLight.setColour(colour);
    }
       
   
   
   /**
    * Q1bi. State dictates which lights are on and correspond to differing 'Train Coming' actions
    */
    private int State;

    /**
     *  Qbii. Constructor for lights
     */

     public LevelCrossingController(Light lightOne, Light lightTwo, Light lightThree)
     {
         this.topLeft = lightOne;
         this.topRight = lightTwo;
         this.bottom = lightThree;

         setPositions();

         State = 0;

         setTrainComing(false);

     }

     /**
     * Qci
     */

    public void changeState()
    {
        this.State = 0;

        while (trainComing = true)
            if (this.State <= 2);
            this.State ++;

            if (this.State == 3);
            this.State = this.State - 1;


    }

    public void colourAllLights()
    {

        if (State == 0);
        colourLight(bottom, OUColour.BLACK);
        colourLight(topLeft, OUColour.BLACK);
        colourLight(topRight, OUColour.BLACK);

        if (State == 1);
        colourLight(bottom, OUColour.ORANGE);
        colourLight(topLeft, OUColour.BLACK);
        colourLight(topRight, OUColour.BLACK);

        if (State == 2);
        colourLight(bottom, OUColour.BLACK);
        colourLight(topLeft, OUColour.RED);
        colourLight(topRight, OUColour.BLACK);

        if (State == 3);
        colourLight(bottom, OUColour.BLACK);
        colourLight(topLeft, OUColour.BLACK);
        colourLight(topRight, OUColour.RED);

    }
   /**
   * Q1di
   */
   public static final int MIN_REPEATS = 4;
}



