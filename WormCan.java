

/**
 * Class is food WormCan and creates the object.
 * 
 * @author boringsr@miamioh.edu (Sebastian Boring)
 *     Copyright (c) Feb 2022
 *
 */
public class WormCan extends Food {
    /**
     * Creates an object of the WormCan.
     * @param price is float of price of WormCan
     * @param weight is float of weight of WormCan
     */
    public WormCan(float price, float weight) {
        // supers the Food class to create the object
        super(price, weight);
        
    } // end of WormCan method

    /**
     * gets the kind of pet.
     * @return String of kind
     */
    @Override
    public String getKind() {
        // returns the kind of WormCan
        return "WormCan";
        
    } // end of getKind method

    /**
     * checks if food is aquatic.
     * @return boolean value
     */
    @Override
    public boolean isAquatic() {
        // returns true since WormCan is not aquatic
        return false;
        
    } // end of isAquatic method
    
    @Override
    /**
     * returns weight of WormCan.
     * @param float returns weight
     */
    public float weight() {
        return this.weight;
    }
    
    /**
     * changes toString to return TOSTRING_FORMAT.
     * @return String
     */
    public String toString() {
        // changes format to match that of the WormCan
        stringFormat = String.format("%s\t%.2f\t%.2f",
                "WormCan", price, weight);
        
        // returns the new format as a string
        return stringFormat;
        
    } // end of toString Method

    @Override
    /**
     * returns the weight of WormCan.
     * @return float as weight
     */
    protected float getFoodPerDay() {
        // not given so returns 0
        return 0;
        
    } // end of getFoodPerDay method
    
} // end of WormCan class
