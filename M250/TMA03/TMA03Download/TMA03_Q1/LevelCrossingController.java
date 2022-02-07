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
    * Simulates length of train at crossing. Q4dii
    */
    public static int findNumRepeats()
    {
        int repeats = 0;
        boolean again = true;

        while (again)
        {
            String timesAsString = OUDialog.request("How many times should the red lights"
                    + " flash? ("
                    + LevelCrossingController.MIN_REPEATS
                    + " or over times)");
            try {
                if (timesAsString != null) {
                    repeats = Integer.parseInt(timesAsString);
                }
                if (repeats < 4) {
                    OUDialog.alert("Enter an integer equal to or higher than " + MIN_REPEATS);
                }
            } catch (Exception e) //to handle only parseInt, use NumberFormatException
            {
                e.printStackTrace();
                OUDialog.alert("Enter an integer");
            }
            again = OUDialog.confirm("Yes to try again, no to confirm choice if 4 or higher, or exit");
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
     * Qa This method should set the colour of the specified light to the specified colour if it is one of
     * OUColour.RED, OUColour.GREEN, OUColour.ORANGE or OUColour.BLACK.
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
         //variables for lights from method args
         this.topLeft = lightOne;
         this.topRight = lightTwo;
         this.bottom = lightThree;

         //sets light positions
         setPositions();

         State = 0;

         setTrainComing(false);

         //Q1ciii
         colourAllLights();

     }

     /**
     * Qci
      * If trainComing is true, then the State is incremented or decremented to operate the level crossing lights
      * as required.
      * If trainComing is false, State is set to 0 to turn all lights off.
      * the break instruction allows for exiting the lopp to continue with any other instructions.
     */

    public void changeState()
    {

        while (this.trainComing == true)
        {
            if (this.State == 0)
            {
                this.State = 1;
                break;
            }

            else if (this.State == 1)
            {
                this.State = 2;
                break;
            }

            else if (this.State == 2)
            {
                this.State = 3;
                break;
            }

            else
            {
                this.State = 2;
                break;
            }
        }
        while (this.trainComing == false)
        {
            this.State = 0;
            break;
        }

    }

    /**
     * Q1cii
     * Sets the colour of all lights dependant on state.
     */
    public void colourAllLights()
    {
        if (State == 0)
        {
            colourLight(bottom, OUColour.BLACK);
            colourLight(topLeft, OUColour.BLACK);
            colourLight(topRight, OUColour.BLACK);
        }

        else if (State == 1)
        {
            colourLight(bottom, OUColour.ORANGE);
            colourLight(topLeft, OUColour.BLACK);
            colourLight(topRight, OUColour.BLACK);
        }

        else if (State == 2)
        {
            colourLight(bottom, OUColour.BLACK);
            colourLight(topLeft, OUColour.RED);
            colourLight(topRight, OUColour.BLACK);
        }

        else
        {
            colourLight(bottom, OUColour.BLACK);
            colourLight(topLeft, OUColour.BLACK);
            colourLight(topRight, OUColour.RED);
        }
    }



   /**
   * Q1di
   */
   public static final int MIN_REPEATS = 4;

    /**
     * Q1e
     * Automated level crossing controller utilising findNumRepeats
     */
   public void doTrainApproaching()
    {
        System.out.println("Train approaching");
        setTrainComing(true);
        delay(700);
        changeState(); //register trainComing = true
        delay(700);
        colourAllLights(); //set light colours appropriately
        System.out.println("Barrier Lowered");
        int reps = findNumRepeats(); //assign variable to findNumRepeats and increment through MIN_REPEATS to change
                                     // states.
        for ( int i = 0; i < reps; i++)
        {
            changeState();
            colourAllLights();
            delay(700);
        }
        setTrainComing(false);
        changeState();
        colourAllLights();
        System.out.println("Barrier raised");
    }
}



