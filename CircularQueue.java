
/**
 * A class that implements a circular queue for storing objects.
 * 
 * @author (Samuel Cox) 
 * @version (08/06/2015)
 */
public class CircularQueue<E>
{
    //Array used to hold all the data objects in.
    private Object[] dataSet;
    //An integer representing the index into the array that is the head, or front, of the queue.
    private int head;
    //An integer that represents the amount of objects actually stored in the queue.
    private int size;

    /**
     * Constructs a CircularQueue object,
     * initialises the array,
     * and initialises the head and size to 0.
     * @param capacity The capacity of the queue.
     */
    public CircularQueue(int capacity)
    {
        dataSet = new Object[capacity];
        head = 0;
        size = 0;
    }

    /**
     * A method that adds an object to the queue if it is not full.
     * As this is a circular queue it uses some arithmetic to calculate the index to
     * store the object in.
     * @param object The object to store in the Queue.
     */
    public void add(E object)
    {
       if(!isFull()) {
           dataSet[(head + size) % dataSet.length] = object;
           size++;
       }
    }
   
    @SuppressWarnings("unchecked")
    /**
     * A method that returns and removes an object from the head of the queue,
     * and then increments the head of the queue accordingly, accounting for the circularity 
     * of the queue.
     * @return The object stored at the head of the queue.
     */
    public E remove() 
    {
       if(!isEmpty()) {
           E objectToReturn = (E) dataSet[head];
           dataSet[head] = null;
           head = (head + 1) % dataSet.length;    
           size--;
           return objectToReturn;
       }
       return null;
       
    }
   
    /**
     * A method that returns true is the queue is full.
     * @return A boolean, true if the queue is full, false if it is not.
     */
    public boolean isFull()
    {
       return dataSet.length == size;
    }
   
    /**
     * A method that returns true is the queue is empty.
     * @return A boolean, true if the queue is empty, false if it is not.
     */
    public boolean isEmpty()
    {
       return size == 0;
    }
   
}
