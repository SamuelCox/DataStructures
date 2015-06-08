
/**
 * Write a description of class Node here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HNode<E> extends Node<E>
{
    // instance variables - replace the example below with your own
    private String key;
    /**
     * Constructor for objects of class Node
     */
    public HNode(HNode next, String key, Object data)
    {
        // initialise instance variables
        super(next, data);
        this.key = key;
    }
    
    public String getKey()
    {
        return this.key;
    }
    
}
