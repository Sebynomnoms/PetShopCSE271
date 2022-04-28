

/**
 * Class is pet Fish and creates the object.
 * 
 * @author boringsr@miamioh.edu (Sebastian Boring)
 *     Copyright (c) Feb 2022
 *
 */
public class Fish extends Pet {
    /**
     * Creates an object of the fish.
     * @param kind String type of fish
     * @param price float of cost for fish
     * @param foodPerDay float for daily food for fish
     */
    public Fish(String kind, float price, float foodPerDay) {
        // supers the Pet class to create the object
        super(kind, price, foodPerDay);
        
    } // end of fish method

    /**
     * gets the kind of pet.
     * @return String of kind
     */
    @Override
    public String getKind() {
        // returns the kind of fish
        return ("Fish: " + kind);
        
    } // end of getKind method

    /**
     * checks if pet is aquatic.
     * @return boolean value
     */
    @Override
    public boolean isAquatic() {
        // returns true since fish is aquatic
        return true;
        
    } // end of isAquatic method
    
    /**
     * changes toString to return TOSTRING_FORMAT.
     * @return String
     */
    public String toString() {
        // changes format to match that of the fish
        stringFormat = String.format("%s\t%s\t%.2f\t%.2f", 
                "Fish", kind, price, foodPerDay);
        
        // returns the new format as a string
        return stringFormat;
        
    } // end of toString Method

    @Override
    /**
     * returns 0 of the weight.
     * @return weight as 0
     */
    protected float weight() {
        // not given so returns 0
        return 0;
        
    } // end of weight method
}
