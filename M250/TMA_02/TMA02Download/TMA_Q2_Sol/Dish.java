
/**
 *
 * Objects of the Dish class model real-world Dishes that have attributes
 * representing style, year painted, insured value and whether or not an alarm 
 * is required.
 *
 * Dish is an example of a composite class.
 *
 * An object of the Dish class has-an object of the Chef class,
 * which represents the Chef who painted that Dish.
 *
 * The value of alarmRequired is computed and true is returned 
 * if rating is equal to or greater than 1000. This is an example 
 * of state-dependent behaviour.
 * alarmRequired is not represented by an instance variable.
 *
 * TMA02 Q2
 * @author Tom Drew
 * @version 1.0 21/01/2021
 */
public class Dish
{

    //instance variables
    private String style; // a Dish has-a style, e.g. "Italian"
    private String dateLastMade; // a Dish has-a year when last made, e.g. "01062021"
    private int rating; // the rating value, e.g. "2"
    private Chef chef; // a Dish has-a chef of type Chef

    /**
     * Constructor for objects of class Dish
     * allowing specification of all the required attributes.
     */
    public Dish(String aStyle, String aLastMadeDate, int aRating, Chef theChef)
    {
        this.style = aStyle;
        this.dateLastMade = aLastMadeDate;
        this.rating = aRating;
        this.chef = theChef;
    }

    /**
     * Constructor for objects of class Dish,
     * where we only know the Dish style.
     * This is the minimum information required to construct
     * a Dish object. In this case we chose to make
     * the Chef object 'empty'. 
     */
    public Dish(String aStyle)
    {
        this.style = aStyle;
        this.dateLastMade = null; //null indicates an unknown date
        this.rating = 0; //defaults to 0 value
        this.chef = new Chef();
    }


    //Setter methods are provided for all the instance variable
    //so that these data can be altered in future if necessary,
    //e.g. if the attribution of the Chef changes.

//    /**
//     * Setter for a Dish's Chef's name.
//     * The name is an attribute of the component Chef object,
//     * not the Dish per se. So we have to forward the message
//     * to the component object.
//     */
//    public void setChefName(String aName)
//    {
//        this.chef.setName(aName);
//    }

    /**
     * Setter for a Dish's Chef's name.
     *This method first checks to see if there
     *is a Chef component that can be sent a message. If there isn't
     *one, it creates one.
     */

    public void setChefName(String aName)
    {
       //this message needs to be forwarded to the component Chef object
       //but the Chef object might not exist yet, so we could check
       if(this.chef == null) //Has the Chef component been created?
       {
           //No, so we need to create a new Chef object and make
           //the instance variable of the composite object to reference it
           this.chef = new Chef(aName);
       }
       else
       {
           //We already have a Chef object, so we just need to set
           //its name by 'forwarding' the message to the Chef component
           this.chef.setName(aName);
       }
    }


    /**
     * Composition Supplement Exercise 3(b) 
     * Add getter and setter methods for the Chef's yearOfQualification, 
     * following the pattern set by setChefName() above.
     */

    /**
     * Setter for a Dish's insured value.
     */
    public void setrating(int aRating)
    {
        this.rating = aRating;
    }

    /**
     * Setter for a Dish's year painted.
     */
    public void setDateLastMade(String aLastMadeDate)
    {
        this.dateLastMade = aLastMadeDate;
    }

    /**
     * Getter for a Dish's style.
     */
    public String getStyle()
    {
        return this.style;
    }

    /**
     * Getter for a Dish's rating value.
     */
    public int getRating()
    {
        return this.rating;
    }

    /**
     * Getter for a Dish's date last made.
     * This method returns "Unknown" if the date
     * is not known (i.e. it has not been set).
     */
    public String getDateLastMade()
    {
        if (this.dateLastMade == null)
        {
            return "Unknown";
        }

        return this.dateLastMade;
    }

    /**
     * Getter for if the Dish was recently used.
     * This method displays state-dependent behaviour:
     * The value returned depends on part of the state of the receiver.
     * If the receiver's rating is greater than or equal to 31082020 true is returned.
     * Otherwise false is returned
     */
    public boolean isWellLiked()
    {
        return this.getRating() >= 7;
    }

    /**
     * Getter for a Dish's Chef's name.
     * This method returns "Unattributed" if the Chef's name 
     * is not known (i.e. it has not been set) and otherwise
     * returns the Chef's name. Similar code could have
     * been provided in the Chef class itself.
     */
    public String getChefName()
    {
        //The Chef's name is part of the component Chef object. 
        //Does the component object exist?
        if (this.chef == null || this.chef.getName() == null)
        {
            //no Chef or no Chef name was set up
            return " Unattributed";
        }

        //The Chef component has been set up, 
        //so we can forward this message to the component object 
        return this.chef.getName();
    }

    /**
     * This method returns true if the Chef qualified in or before
     * 1995, and otherwise returns false.
     */public boolean isWellPracticed()
    {
        return(Integer.parseInt(this.chef.getYearOfQualification()) < 1995);
    }

    /**
     * Returns a string describing this object. 
     */
    public String toString()
    {
        return "style: " + this.style + ", last made: " + this.dateLastMade + ", chef: " + this.chef + ", rating: " + this.getRating() + ".";
    }

}
