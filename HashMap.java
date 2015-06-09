
/**
 * An implementation of a lookup table Data Structure.
 * Keys map to values.
 * 
 * @author (Samuel Cox) 
 * @version (08/06/2015)
 */
public class HashMap<E>
{
    //Array used to hold all the data objects in.
    private Object[] dataSet;

    /**
     * Constructs the HashMap object, initialises
     * the dataSet array.
     * @param tableSize The size of the HashMap/ Lookup table.
     */
    public HashMap(int tableSize)
    {
        dataSet = new Object[tableSize];
        
    }

    /**
     * A method that hashes a string, that is it takes a string and computes a valid index
     * into the array from it. The same String will always map to the same index.
     * @param stringToHash The key, or String, that we are hashing.
     * @return The int that represents the index into the array.
     */
    public int hash(String stringToHash)
    {
        return stringToHash.hashCode() % dataSet.length;
    }
    
    @SuppressWarnings("unchecked")
    /**
     * A method that adds the object to be stored to the HashMap, and maps the key given to that object.
     * If the array at position of the index computed with hash() is free,
     * it constructs a Node object and stores the object to be stored and the key
     * that maps to that object in that Node, and then that Node
     * is placed in the array. Nodes are used in case a hash collision occurs.
     * If it is NOT free, a hash collision has occured. This should only happen if the HashMap size is too small,
     * and/or the hash function is not very good. In this case, it stores a linked list of Nodes that store
     * their key and the object to be stored.
     * Operates in O(1) time complexity in the best case, O(n) in the worst case as it has to traverse
     * a Linked List, and O(1) time complexity average case, as long as the HashMap is suitably big.
     * @param key The key that should map to the object to be stored.
     * @param object The object to be stored.
     */
    public void add(String key, E object)
    {
        int index = this.hash(key);
        HNode<E> newNode = new HNode<E>(null, key, object);
        if(dataSet[index] == null) {
            dataSet[index] = newNode;
        }
        else {
            HNode<E> currentNode = (HNode<E>) dataSet[index];
            while(currentNode.getNext() != null) {
                currentNode = (HNode<E>) currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    /**
     * A method that returns the object mapped to by the key given.
     * It computes the index the object is stored at by using the hash() function.
     * If there is only one object stored, no hash collisions have occurred on this index
     * and so it just returns that object. If there is a linked list stored there, one or more
     * hash collisions have occurred, so it traverses the linked list and checks the keys of
     * the stored object was mapped to. Once it finds a key equivalent to the key given,
     * it returns that object.
     * Operates in O(1) time complexity best-case, O(n) time complexity worst-case as it has
     * to traverse a Linked List, and O(1) time complexity avg-case as long as the HashMap is suitably big.
     * @param key The key the object should be mapped to.
     * @return The stored object mapped to by the key.
     */
    public E get(String key)
    {
        if(dataSet[hash(key)] != null) {
            HNode<E> currentNode = (HNode<E>) dataSet[hash(key)];
            if(currentNode.getKey().equals(key)) {
                    return currentNode.getData();
            }
            while(currentNode.getNext() != null) {
                currentNode = (HNode<E>) currentNode.getNext();
                if(currentNode.getKey().equals(key)) {
                    return currentNode.getData();
                }
                
            }
            
        }
        return null;
    }
}
