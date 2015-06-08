
/**
 * Write a description of class CircularQueue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CircularQueue<E>
{
    private Object[] dataSet;
    private int head;
    private int size;

    /**
     * Constructor for objects of class CircularQueue
     */
    public CircularQueue(int capacity)
    {
        dataSet = new Object[capacity];
        head = 0;
        size = 0;
    }

   public void add(E object)
   {
       if(!isFull()) {
           dataSet[(head + size) % dataSet.length] = object;
           size++;
       }
   }
   
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
   
   public boolean isFull()
   {
       return dataSet.length == size;
   }
   
   public boolean isEmpty()
   {
       return size == 0;
   }
   
}
