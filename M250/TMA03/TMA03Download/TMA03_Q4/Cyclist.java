/**
 * Class Cyclist - Models a cyclist in a cycling race
 * 
 * @author 
 * @version
 */
public class Cyclist implements Comparable<Cyclist>
{

       

/* static variables */
    private static int nextNumber = 0; //Q4ai

/* instance variables */   
   
   private int number;       // cyclist's number
   private String name;      // cyclist's name
   private String raceCat;   // Junior U18, Adult U40, or Veteran 40 and over
   private int time;         // cyclist's race time in tenths of a second
   
   /**
    * Constructor for objects of class Cyclist
    */
   public Cyclist(String aName, String raceCat)
   {
      this.name = aName;
      this.raceCat  = raceCat;
      this.time = 0;

       /**
        * Q4aii Increments nextNumber by 1
        */
       nextNumber = nextNumber + 1;
       this.number = nextNumber;
       Cyclist.nextNumber = nextNumber;
    }

    /* instance methods */

   /**
    * Returns the receiver's number
    */
   public int getNumber()
   {
      return this.number;
   }
   
   /**
    * Returns the receiver's name
    */
   public String getName()
   {
      return this.name;
   }
   
   /**
    * Sets the receiver's name
    */
   public void setName(String aName)
   {
      this.name = aName;
   } 

    /**
     * @return the race category
     */
    public String getRaceCat()
    {
        return raceCat;
    }

    /**
     * @param raceCat the race category to set
     */
    public void setRaceCat(String raceCat)
    {
        this.raceCat = raceCat;
    }
   
   /**
    * Returns the receiver's time
    */
   public int getTime()
   {
      return this.time;
   }
   
   /**
    * Sets the receiver's time in tenths of a second
    */
   public void setTime(int aTime)
   {
      this.time = aTime;
   }

    /**
     * Q4ci
     * @return
     */
    @Override
    public String toString()
    {
        int minutes = (time * 36000) / 60;
        double seconds = time * 10 ;

        String formatTime;
        formatTime = String.format("%s \t %d mins %.1f secs \t %s",
                minutes,
                seconds);
        System.out.println(formatTime);

        return "Cyclist{" +
                "name='" + name + '\'' +
                ", raceCat='" + raceCat + '\'' +
                ", time=" + formatTime +
                '}';
    }

    /**
     * Q4cii
     * @param anotherCyclist
     * @return
     */
    public int compareTo(Cyclist anotherCyclist)
    {
        return (this.getTime() - anotherCyclist.getTime());
    }



   }
   

