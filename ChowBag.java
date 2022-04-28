

/**
 * Class is food ChowBag and creates the object.
 * 
 * @author boringsr@miamioh.edu (Sebastian Boring)
 *     Copyright (c) Feb 2022
 *
 */
public class ChowBag extends Food {
    /**
     * Creates an object of the ChowBag.
     * @param price is float of price of ChowBag
     * @param weight is float of weight of ChowBag
     */
    public ChowBag(float price, float weight) {
        // supers the Food class to create the object
        super(price, weight);
        
    } // end of ChowBag method

    /**
     * gets the kind of pet.
     * @return String of kind
     */
    @Override
    public String getKind() {
        // returns the kind of ChowBag
        return "ChowBag";
        
    } // end of getKind method

    /**
     * checks if food is aquatic.
     * @return boolean value
     */
    @Override
    public boolean isAquatic() {
        // returns true since ChowBag is not aquatic
        return false;
        
    } // end of isAquatic method
    
    /**
     * changes toString to return TOSTRING_FORMAT.
     * @return String
     */
    public String toString() {
        // changes format to match that of the ChowBag
        stringFormat = String.format("%s\t%.2f\t%.2f", 
                "ChowBag", price, weight);
        
        // returns the new format as a string
        return stringFormat;
        
    } // end of toString Method

    @Override
    /**
     * returns 0 as foodPerDay.
     */
    protected float getFoodPerDay() {
        // not given so returns 0
        return 0;
        
    } // end of getFoodPerDay method

    @Override
    /**
     * returns weight of the ChowBag.
     */
    protected float weight() {
        // returns the new weight of the chowbag
        return this.weight;
        
    } // end of weight method
    
} // end of ChowBag class
