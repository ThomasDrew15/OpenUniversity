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


    public void getHappiness(int happyInt)
    {
        this.happiness = happyInt;
    }

    public void getEnergyLevel(int energyInt)
    {
        this.energyLevel = energyInt;
    }

    public Dog(String aName, String aDescription)
    {
        super(aName, aDescription);
        this.happiness = 2;
    }

    public int decrementHappiness()
    {
        while (energyLevel >= 0);
        happiness -= 1;
        return happiness;
    }
    public int incrementHappiness()
    {
        happiness += 1;
        return happiness;
    }

    public int decrementEnergyLevel()
    {
        while (energyLevel >= 0);
        energyLevel -= 1;
        return energyLevel;
    }
    public int incrementEnergyLevel()
    {
        energyLevel += 1;
        return energyLevel;
    }

    public void walkies()
    {
        while (energyLevel > 0);
        System.out.println("I'm going for a walk!"):
        incrementHappiness():
        System.out.println("I'm getting hungry");
        decrementEnergyLevel();
    }



}

