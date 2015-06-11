
/**
 * Write a description of class BinarySearchTree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BinarySearchTree<E>
{
    // instance variables - replace the example below with your own
    private Tree tree;
    
    /**
     * Constructor for objects of class BinarySearchTree
     */
    public BinarySearchTree()
    {
        tree = new EmptyTree<E>();
    }
    
    public boolean isEmpty()
    {
        return tree.isEmpty();
    }
   
    public void insert(String key, E data)
    {
        tree = tree.insert(key, data);
    }
   
    public E search(String key)
    {
        return (E) tree.search(key);
    }
   
    public int iterativeCount()
    {
        return tree.iterativeCount();
    }
   
    public int recursiveCount()
    {
        return tree.recursiveCount();
    }

    public int getHeight()
    {
        return tree.getHeight();
    }
    
}
