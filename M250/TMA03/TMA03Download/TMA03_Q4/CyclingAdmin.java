import java.util.*;
import java.io.*;
import ou.*;

/**
 * Class CyclingAdmin - carries out administrative tasks for a cycling race.
 * 
 * @author 
 * @version
 */
public class CyclingAdmin
{
  
   /* instance variables */
   /**
    * Q4bi
    */
   private List<Cyclist> cyclists;
   
   /* static variables */
   public static final int MIN_RACE_TIME = 6000;   //the minimum time to
            //complete the race in tenths of a second (i.e. 10 mins)


   
   /**
    * Constructor for objects of class CyclingAdmin
    */
   public CyclingAdmin()
   {
      super();
      cyclists = new arrayList<Cyclist>();
   }

 
/* instance methods */
   
   
   /**
    * Clears the cyclists list.
    */   
    public void clear()
    {
       this.cyclists.clear();
    }
}

