
/**
 * An implementation of a LIFO data structure, a Stack.
 * 
 * @author (Samuel Cox) 
 * @version (08/06/2015)
 */
public class Stack<E>
{
    //Array used to hold all the data objects in.
    private Object[] dataSet;
    //An integer the represents the top of the Stack.
    private int stackPointer;
    
    /**
     * Constructs a Stack object,
     * initialises the dataSet array
     * and initialises the stackPointer to 0.
     * @param capacity The capacity of the Stack.
     */
    public Stack(int capacity)
    {
        // initialise instance variables
        dataSet = new Object[capacity];
        stackPointer = 0;
    }

    /**
     * A method that pushes an object on to the Stack.
     * @param object The object to be stored on the Stack.
     */
    public void push(E object)
    {
        if(!isFull()) {
            dataSet[stackPointer++] = object;
        }
        
    }
    
    @SuppressWarnings("unchecked")
    /**
     *
     * A method that returns and removes an object from the top of the Stack.
     * @return The object on the top of the stack.
     */    
    public E pop()
    {
        if(!isEmpty())
        {
            E objectToReturn = (E) dataSet[--stackPointer];
            dataSet[stackPointer] = null;
            return objectToReturn;
        }
        return null;
    }
    
    /**
     * A method that returns true is the Stack is full.
     * @return A boolean, true if the Stack is full, false if it is not.
     */
    public boolean isFull()
    {
        return stackPointer == dataSet.length - 1;
    }
    
    /**
     * A method that returns true is the Stack is empty.
     * @return A boolean, true if the Stack is , false if it is not.
     */
    public boolean isEmpty()
    {
        return stackPointer == 0;
    }
    
}
