
/**
 * A class that implements the individual Nodes that make up a Linked List.
 * 
 * @author (Samuel Cox) 
 * @version (09/06/2015)
 */
public class Node<E>
{
    //The next Node in the Linked List.
    private Node next;
    //The data this Node stores.
    private Object data;
    /**
     * Constructor a Node object, initialises 
     * the next field and data field to
     * the given paramaters.
     * @param next The next Node in the Linked List. null is used to specify the end of the list.
     * @param data The data object to be stored.
     */
    public Node(Node next, Object data)
    {
        this.next = next;
        this.data = data;
    }
    
    @SuppressWarnings("unchecked")
    /**
     *  A method that returns the data object stored by the Node.
     *  @return The stored object, of whatever type the Node was instantiated with.
     */
    public E getData()
    {
        return (E) this.data;
    }
    
    
    /**
     *  A method that sets the stored object to the given parameter.
     *  @param object The new object to be stored by the Node.
     */
    public void setData(E object)
    {
        this.data = object;
    }
    
    @SuppressWarnings("unchecked")
    /**
     * A method that gets the next Node in the Linked List.
     * @return The next Node in the Linked List.
     */
    public Node<E> getNext()
    {
        return this.next;
    }
    
    /**
     * A method that sets the next Node this Node is linked to, to
     * the given parameter.
     * @param node The Node next is to be set to.
     */
    public void setNext(Node node)
    {
        this.next = node;
    }
}
