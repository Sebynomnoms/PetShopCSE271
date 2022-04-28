

/**
 * Class is Thing, the grandparent, and creates the object.
 * 
 * @author boringsr@miamioh.edu (Sebastian Boring)
 *     Copyright (c) Feb 2022
 *
 */
public abstract class Thing {
    /**
     * template for object creation.
     */
    public Thing() {
    } // end of Thing method
    
    /**
     * template to get Kind of object.
     * @return String as null but will be changed in other classes
     */
    public abstract String getKind();
    
    /**
     * template to be changed in other classes.
     * @return boolean as false but change when used in dif classes
     */
    public abstract boolean isAquatic();
    
    /**
     * template to be adjusted in other classes.
     * @return float as -1 but will change with diff classes
     */
    public abstract float getPrice();

    /**
     * method to getFoodPerDay for the ArrayList.
     * @return float for methods
     */
    protected abstract float getFoodPerDay();

    /**
     * method to get weight for the arrayList.
     * @return float for it
     */
    protected abstract float weight();

}
