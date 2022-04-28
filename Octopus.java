

/**
 * Class is pet Octopus and creates the object.
 * 
 * @author boringsr@miamioh.edu (Sebastian Boring)
 *     Copyright (c) Feb 2022
 *
 */
public class Octopus extends Pet {
    /**
     * Creates an object of the Octopus.
     * @param kind String type of Octopus
     * @param price float of cost for Octopus
     * @param foodPerDay float for daily food for Octopus
     */
    public Octopus(String kind, float price, float foodPerDay) {
        // supers the Pet class to create the object
        super(kind, price, foodPerDay);
        
    } // end of Dog method

    /**
     * gets the kind of pet.
     * @return String of kind
     */
    @Override
    public String getKind() {
        // returns the kind of Octopus
        return ("Octopus: " + kind);
        
    } // end of getKind method

    /**
     * checks if pet is aquatic.
     * @return boolean value
     */
    @Override
    public boolean isAquatic() {
        // returns true since Octopus is aquatic
        return true;
        
    } // end of isAquatic method
    
    /**
     * changes toString to return TOSTRING_FORMAT.
     * @return String
     */
    public String toString() {
        // changes format to match that of the Octopus
        stringFormat = String.format("%s\t%s\t%.2f\t%.2f", 
                "Octopus", kind, price, foodPerDay);
        
        // returns the new format as a string
        return stringFormat;
        
    } // end of toString Method
    
    @Override
    /**
     * returns 0 because weight is not established on this side.
     * @return float as weight
     */
    protected float weight() {
        // not given so returns 0
        return 0;
        
    } // end of weight method
}
