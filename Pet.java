

/**
 * Class is pet that extends Thing and creates the object.
 * 
 * @author boringsr@miamioh.edu (Sebastian Boring)
 *     Copyright (c) Feb 2022
 *
 */
public abstract class Pet extends Thing {
    /**
     * String is kind of pet.
     */
    protected String kind;
    
    /**
     * float is price of pet.
     */
    protected float price;
    
    /**
     * float is foodPerDay for pet.
     */
    protected float foodPerDay;
    
    /**
     * String format for returning object.
     */
    public String stringFormat = String.format("%s\t%s\t%.2f\t%.2f",
                "Pet", kind, price, foodPerDay);
    
    /**
     * Creates the general Pet object with variables above.
     * @param kind is String that is type of pet
     * @param price is float and cost of pet
     * @param foodPerDay is float and cost of food for pet
     */
    public Pet(String kind, float price, float foodPerDay) {
        // assigns value to each of the variables
        this.kind = kind;
        this.price = price;
        this.foodPerDay = foodPerDay;
        
    } // end of Pet method
    
    /**
     * returns the price of foodPerDay.
     * @return foodPerDay
     */
    public float getFoodPerDay() {
        return foodPerDay;
        
    } // end of getPrice method
    
    /**
     * shows value of price.
     * @return price variable
     */
    @Override
    public float getPrice() {
        return price;
        
    } // end of getPrice method
    
    /**
     * gets the Object and sees if they are equal to each other.
     * @param obj is Object inputed by the user
     * @return boolean that returns true or false
     */
    public boolean equals(Object obj) {
        // checks to see if objects are equal
        if (obj == null || !(obj instanceof Pet)) {
            // kind does not matter if these aren't equal
            // obj.getClass() == Pet.class
            return false;
            
        }
        // assigns a new variable to check for equal
        Pet compP = (Pet) obj;
        
        // returns true if kind is equal for both
        return (compP.kind.equals(this.kind));
        
    } // end of equals method
    
} // end of Pet class
