/**
 * Chef represents a chef such as Gordon Ramsey.
 * To keep things simple we just have a name and a year of qualification.
 * In the context of the Dish example, this is a component class.
 *
 * TMA02 Q2
 * @author Tom Drew
 * @version 1.0 21/01/2021
 *
 */
public class Chef
{
    // instance variables
    private String name; // a chef has-a name, e.g. "Gordon"
    private String yearOfQualification; // a chef has-a year of qualifcation, e.g. "1985"


    /**
     * zero-argument constructor: if we don’t know the chef’s attributes.
     */
    public Chef()
    {
        this.name = null; //indicates the chef's name is unknown
        this.yearOfQualification = null; //indicates year of qualification is unknown
    }

    /**
     * A constructor for objects of class Chef if we know their name
     * but not their year of qualification.
     */
    public Chef(String aName)
    {
        this.name = aName;
        this.yearOfQualification = null; //indicates year of qualification is unknown
    }

    /**
     * A constructor for objects of class Chef
     * if we know their name and their year of qualification.
     */
    public Chef(String aName, String aQualificationYear)
    {
        this.name = aName;
        this.yearOfQualification = aQualificationYear;
    }

    /**
     * Setter for a chef's name.
     */
    public void setName(String aName)
    {
        this.name = aName;
    }

    /**
     * Setter for a chef's year of qualification.
     */
    public void setYearOfQualification(String aQualificationYear)
    {
        this.yearOfQualification = aQualificationYear;
    }

    /**
     * Getter for a chef's name. It could
     * return a string such as "unattributed"
     * if the chef's name is not known.
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Getter for a chef's year of qualification.
     * Similar to getName().
     */
    public String getYearOfQualification()
    {
        return this.yearOfQualification;
    }

    /**
     * Returns a description of this object as a string.
     */
    public String toString()
    {
        return this.name + "(Qualified " + this.yearOfQualification + ")";
    }

    /**
     * Composition Supplement Exercise 3(a)
     * Modify the toString() method above so that it
     * returns a useful message even if name and year of qualification are null.
     */
}
