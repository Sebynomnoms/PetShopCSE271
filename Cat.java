


/**
 * Class is pet Cat and creates the object.
 * 
 * @author boringsr@miamioh.edu (Sebastian Boring)
 *     Copyright (c) Feb 2022
 *
 */
public class Cat extends Pet {
    /**
     * Creates an object of the Cat.
     * @param kind String type of Cat
     * @param price float of cost for Cat
     * @param foodPerDay float for daily food for Cat
     */
    public Cat(String kind, float price, float foodPerDay) {
        // supers the Pet class to create the object
        super(kind, price, foodPerDay);
        
    } // end of Cat method

    /**
     * gets the kind of pet.
     * @return String of kind
     */
    @Override
    public String getKind() {
        // returns the kind of Cat
        return ("Cat: " + kind);
        
    } // end of getKind method

    /**
     * checks if pet is aquatic.
     * @return boolean value
     */
    @Override
    public boolean isAquatic() {
        // returns false since Cat is not aquatic
        return false;
        
    } // end of isAquatic method
    
    /**
     * changes toString to return TOSTRING_FORMAT.
     * @return String
     */
    public String toString() {
        // changes format to match that of the Cat
        stringFormat = String.format("%s\t%s\t%.2f\t%.2f", 
                "Cat", kind, price, foodPerDay);
        
        // returns the new format as a string
        return stringFormat;
        
    } // end of toString Method
    
    @Override
    /**
     * returns 0 because weight is not established on this side.
     * @return float as weight
     */
    protected float weight() {
        // just returns 0 because it is not given
        return 0;
        
    } // end of weight method
}
