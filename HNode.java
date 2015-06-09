
/**
 * A special implementation of the Node class used in
 * HashMaps, as the key must also be stored with the object
 * to resolve Hash Collisions.
 * 
 * IMPORTANT NOTE: It seemed more elegant to make HNode inherit Node,
 * and it does indeed avoid a fair bit of code duplication. HOWEVER, because
 * the super constructor takes objects of type Node rather than HNode, whenever
 * you use getNext() on a HNode, you must cast it to HNode to have access to the key,
 * which is the entire point of this class. There is probably a better way to do this,
 * and I am very much not a fan of casting when you don't absolutely need to,
 * but I haven't found one yet.
 * 
 * @author (Samuel Cox) 
 * @version (09/06/2015)
 */
public class HNode<E> extends Node<E>
{
    //A string that represents the key the stored Object was mapped to,
    //used to ensure the right item is returned in the case of Hash collisons.
    private String key;
    /**
     * Constructs a HNode object.
     * Calls the super constructor,
     * and initialises the key field to the given parameter.
     * @param next The next HNode in the Linked List.
     * @param key The key the object was mapped to in the HashMap.
     * @param The object to be stored.
     */
    public HNode(HNode next, String key, Object data)
    {
        // initialise instance variables
        super(next, data);
        this.key = key;
    }
    
    /**
     * A method that returns the key the object was mapped to.
     * @return The string the object was mapped to.
     */
    public String getKey()
    {
        return this.key;
    }
    
}
