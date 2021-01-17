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


    public void getHappiness(int happyInt) {
        this.happiness = happyInt;
    }

    public void getEnergyLevel(int energyInt) {
        this.energyLevel = energyInt;
    }

    public Dog(String aName, String aDescription) {
        super(aName, aDescription);
        this.happiness = 2
    }

}

