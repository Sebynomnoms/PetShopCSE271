

/**
 * Class is pet Dog and creates the object.
 * 
 * @author boringsr@miamioh.edu (Sebastian Boring)
 *     Copyright (c) Feb 2022
 *
 */
public class Dog extends Pet {
    /**
     * Creates an object of the Dog.
     * @param kind String type of dog
     * @param price float of cost for dog
     * @param foodPerDay float for daily food for dog
     */
    public Dog(String kind, float price, float foodPerDay) {
        // supers the Pet class to create the object
        super(kind, price, foodPerDay);
        
    } // end of Dog method

    /**
     * gets the kind of pet.
     * @return String of kind
     */
    @Override
    public String getKind() {
        // returns the kind of dog
        return ("Dog: " + kind);
        
    } // end of getKind method

    /**
     * checks if pet is aquatic.
     * @return boolean value
     */
    @Override
    public boolean isAquatic() {
        // returns false since dog is not aquatic
        return false;
        
    } // end of isAquatic method
    
    /**
     * changes toString to return TOSTRING_FORMAT.
     * @return String
     */
    public String toString() {
        // changes format to match that of the dog
        stringFormat = String.format("%s\t%s\t%.2f\t%.2f", 
                "Dog", kind, price, foodPerDay);
        
        // returns the new format as a string
        return stringFormat;
        
    } // end of toString Method

    @Override
    /**
     * returns 0 because weight is not established on this side
     * @return float as weight
     */
    protected float weight() {
        // not given so returns 0
        return 0;
        
    } // end of weight method
    
} // end of dog class
