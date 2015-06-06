
/**
 * Write a description of class LinkedList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LinkedList<E>
{
    private Node head;
    private int length;
    /**
     * Constructor for objects of class LinkedList
     */
    public LinkedList()
    {
        head = new Node(null, null);
        length = 0;
    }

    public void add(E object)
    {
        Node current = head;
        while(current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new Node(null, object));
        length++; 
    }
    
    public E get(int nodeNumber)
    {
        Node current = head;
        int currentNumber = 0;
        while(currentNumber != nodeNumber) {
            current = current.getNext();
            currentNumber++;
        }
        return (E) current.getData();
    }
    
    public E get()
    {
        Node current = head;
        while(current.getNext() != null) {
            current = current.getNext();
        }
        return (E) current.getData();
    }
    
}
