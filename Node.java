
/**
 * Write a description of class Node here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Node<E>
{
    // instance variables - replace the example below with your own
    private Node next;
    private Object data;
    /**
     * Constructor for objects of class Node
     */
    public Node(Node next, Object data)
    {
        // initialise instance variables
        this.next = next;
        this.data = data;
    }

    public E getData()
    {
        return (E) this.data;
    }
    
    public void setData(E object)
    {
        this.data = object;
    }
    
    public Node<E> getNext()
    {
        return this.next;
    }
    
    public void setNext(Node node)
    {
        this.next = node;
    }
}
