
/**
 * Write a description of class Stack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stack<E>
{
    // instance variables - replace the example below with your own
    private Object[] dataSet;
    private int stackPointer;
    
    /**
     * Constructor for objects of class Stack
     */
    public Stack(int capacity)
    {
        // initialise instance variables
        dataSet = new Object[capacity];
        stackPointer = 0;
    }

    public void push(E object)
    {
        if(!isFull()) {
            dataSet[stackPointer++] = object;
        }
        
    }
    
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
    
    public boolean isFull()
    {
        return stackPointer == dataSet.length - 1;
    }
    
    public boolean isEmpty()
    {
        return stackPointer == 0;
    }
    
}
