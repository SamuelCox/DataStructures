
/**
 * Write a description of class Node here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HNode<E>
{
    // instance variables - replace the example below with your own
    private HNode next;
    private Object data;
    private String key;
    /**
     * Constructor for objects of class Node
     */
    public HNode(HNode next, String key, Object data)
    {
        // initialise instance variables
        this.next = next;
        this.key = key;
        this.data = data;
    }

    public E getData()
    {
        return (E) this.data;
    }
    
    public String getKey()
    {
        return this.key;
    }
    
    public HNode<E> getNext()
    {
        return this.next;
    }
    
    public void setNext(HNode node)
    {
        this.next = node;
    }
}
