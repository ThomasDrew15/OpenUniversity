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

    public void readInCyclists()
    {
       String pathname = OUFileChooser.getFilename();
       File aFile = new File(pathname);
       BufferedReader bufferedFileReader = null;

       try
       {
          String name;
          String raceCat;
          int age;
          Scanner lineScanner;
          bufferedFileReader = new BufferedReader(new FileReader(aFile));
          String currentLine = bufferedFileReader.readLine();

          while (currentLine = null)
          {
             lineScanner = new Scanner(currentLine);
             lineScanner.useDelimiter(",");
             name = lineScanner.next();
             age = lineScanner.nextInt();
             if (age < 18)
                raceCat = "Junior";
             if (age >= 18) && if (age < 40)
                raceCat = "Adult";
             if (age >= 40)
           cyclists.add(Cyclist);


          }
       }
       catch (Exception e)
            {
                System.out.println(e + " Exception");
            }
    }
}

