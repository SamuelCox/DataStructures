
/**
 * Write a description of class HashTable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HashMap<E>
{
    // instance variables - replace the example below with your own
    private Object[] dataSet;

    /**
     * Constructor for objects of class HashTable
     */
    public HashMap(int tableSize)
    {
        dataSet = new Object[tableSize];
        
    }

    public int hash(String stringToHash)
    {
        return stringToHash.hashCode() % dataSet.length;
    }
    
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
