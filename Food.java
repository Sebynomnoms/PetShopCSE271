

/**
 * Class is Food that extends Thing and creates the object.
 * 
 * @author boringsr@miamioh.edu (Sebastian Boring)
 *     Copyright (c) Feb 2022
 *
 */
public abstract class Food extends Thing {
    /**
     * float of price to go in other classes.
     */
    protected float price;
    
    /**
     * float of weight to extend to other classes.
     */
    protected float weight;
    
    /**
     * string for format of returning object.
     */
    public String stringFormat = String.format("%s\t%.2f\t%.2f", 
            "Food", price, weight);
    
    /**
     * creates object of Food.
     * @param price float for food cost
     * @param weight float for food weight
     */
    public Food(float price, float weight) {
        this.price = price;
        this.weight = weight;
        
    } // end of food method
    
    /**
     * gets price of the food.
     * @return price as float
     */
    @Override
    public float getPrice() {
        return price;
        
    } // end of getPrice method
    
    /**
     * gets weight of the food.
     * @return weight as float
     */
    public float getWeight() {
        return weight;
        
    } // end of getWeight method
    
    /**
     * gets the Object and sees if they are equal to each other.
     * @param obj is Object inputed by the user
     * @return boolean that returns true or false
     */
    public boolean equals(Object obj) {
        // checks to see if objects are equal
        if (obj == null || obj.getClass() != Food.class) {
            // kind does not matter if these aren't equal
            return false;
            
        } else {
            // assigns a new variable to check for equal
            Food compF = (Food) obj;
            // returns true if kind is equal for both
            return (compF.price == this.price && compF.weight == this.weight);
            
        } // end of if statement

    } // end of equals method
    
}
