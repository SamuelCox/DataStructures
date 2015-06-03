
/**
 * My version of a dynamic array.
 * 
 * @author (Samuel Cox) 
 * @version (03/06/2015)
 */
public class ArrayList<E>
{
    //Array used to hold all the data objects in.
    private Object[] dataSet;
    //Pointer into the low-level array which gives the position where empty data is.
    private int pointer;
    /**
     * Initialises an arraylist with the given intial capacity.
     * Initialises the low-level array to store objects in,
     * and initialises the pointer to 0.
     * @param initialCapacity The inital length of the array.
     */
    public ArrayList(int initialCapacity)
    {
        // initialise instance variables
        dataSet = new Object[initialCapacity];
        pointer = 0;
    }
    
    /**
     * A method that adds an object to the array list.
     * If the array list is full, it creates a new larger array,
     * copies all the elements in, and maintains that new array as the array lists
     * data set.
     * @param  object The object to be added to the arraylist.
     * @return     the sum of x and y 
     */
    public void add(E object)
    {
        // put your code here
        if(!isFull()) {
           
        }
        else {
            int newCapacity = (int) Math.round(dataSet.length * 1.5);
            Object[] newDataSet = new Object[newCapacity]; 
            for(int i = 0; i < dataSet.length; i++) {
                newDataSet[i] = dataSet[i];
            }
            dataSet = newDataSet;
        }
        dataSet[pointer] = object;
        pointer++;
    }
    
    
    /**
     * A method that returns the most recently added item.
     * @return The Object of type E (whatever the arraylist was instantiated as) 
     *  
     */
    public E get() 
    {
        int objectIndex = pointer - 1;
        return (E) dataSet[objectIndex];
    }
    
    /**
     * A method that returns the item at the given index.
     * @param index The index into the array of the object to be returned.
     * @return The Object of type E (whatever the arraylist was instantiated as) at the given index
     *  
     */
    public E getAtIndex(int index)
    {
        return (E) dataSet[index];
    }
     
    /**
     * A method that removes the item at the end of the array and returns it.
     * @param index The index into the array of the object to be returned.
     * @return The Object of type E (whatever the arraylist was instantiated as) 
     */
    public E remove()
    {
        if(!isEmpty()) {
            pointer--;
            E objectToReturn = (E) dataSet[pointer];
            dataSet[pointer] = null;
            return objectToReturn;
        }
        else {
            return null;
        }
    }
    
    /**
     * A method that returns true if the data set array is full, and false if it is not.
     * @return Whether the low-level array, or data set, is full.
     */
    public boolean isFull()
    {
        return pointer == dataSet.length;
    }
    
    /**
     * A method that returns true if the data set array is full, and false if it is not.
     * @return Whether the low-level array, or data set, is full.
     */
    public boolean isEmpty()
    {
        return pointer == 0;
    }
    
}
