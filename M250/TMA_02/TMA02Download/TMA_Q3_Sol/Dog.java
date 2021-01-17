/**
 * class Dog - is a subclass of Pet
 * TMA02 Q3
 *
 * @author (Tom Drew)
 * @version (v1.0)
 */

public class Dog extends Pet
{
    private int happiness;
    private int energyLevel;


    public int getHappiness()
    {
        return this.happiness;
    }

    public int getEnergyLevel()
    {
        return this.energyLevel;
    }

    public Dog(String aName, String aDescription)
    {
        super(aName, aDescription);
        this.happiness = 2;
    }

    public int decrementHappiness()
    {
        while (happiness > 0)
        {
            happiness --;
            return happiness;
        }
        return happiness;
    }

    public int incrementHappiness()
    {
        happiness ++;
        return happiness;
    }

    public int decrementEnergyLevel()
    {
        while (energyLevel > 0)
        {
           energyLevel --;
           return energyLevel;
        }
        return energyLevel;
    }
    public int incrementEnergyLevel()
    {
        energyLevel ++;
        return energyLevel;
    }

    public void walkies()
    {
        for(int i = energyLevel; i>0; decrementEnergyLevel())
        {
            System.out.println(i);
            System.out.println("I'm going for a walk!");
            incrementHappiness();
            System.out.println(happiness);
            System.out.println("I'm getting hungry");
            //decrementEnergyLevel();
            System.out.println(energyLevel);
            if (energyLevel == 0)
            {
                break
            }
        }
    }



}

