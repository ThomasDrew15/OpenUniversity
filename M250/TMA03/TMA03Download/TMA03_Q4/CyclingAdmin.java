import java.util.*;
import java.io.*;
import ou.*;

import static java.util.Collections.*;

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
      cyclists = new ArrayList<Cyclist>();
   }

   /* instance methods */
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

         while (currentLine != null)
         {
            lineScanner = new Scanner(currentLine);
            lineScanner.useDelimiter(",");
            name = lineScanner.next();
            age = lineScanner.nextInt();
            if (age < 18) {
               raceCat = ("Junior");
            } else if (age >= 18 && age < 40) {
               raceCat = ("Adult");
            } else {
               raceCat = ("Veteran");
            }
            cyclists.add(new Cyclist(name, raceCat));
            currentLine = bufferedFileReader.readLine();
         }
      }
      catch (Exception e)
      {
         System.out.println(e + " Exception");
      }
      finally
      {
         try
         {
            bufferedFileReader.close();
         }
         catch (Exception e)
         {
            System.out.println(e + " Exception");
         }
      }
   }

   /**
    * Q4biii
    */
   public void rideRace() {

      Random generator = new Random();

      for (Cyclist i : cyclists) {
         int ranGenNum = generator.nextInt();
         ranGenNum = generator.nextInt(MIN_RACE_TIME) + MIN_RACE_TIME;
         System.out.println(ranGenNum);
         i.setTime(ranGenNum);
      }
   }

   /**
    * Q4d
    */
   public void displayResults()
   {
      ArrayList <Cyclist> cyclistsCopy = new ArrayList<>();
      cyclistsCopy.addAll(cyclists);
      Collections.sort(cyclistsCopy);

      for (Cyclist C : cyclistsCopy)
      {
          System.out.println(C);
      }
   }

   /**
    * Clears the cyclists list.
    */   
   public void clear()
   {
      this.cyclists.clear();
   }
}

