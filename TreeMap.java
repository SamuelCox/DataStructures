
/**
 * Write a description of class TreeMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreeMap<E>
{
    // instance variables - replace the example below with your own
    private BinarySearchTree<E> tree;
    /**
     * Constructor for objects of class TreeMap
     */
    public TreeMap()
    {
        
    }

    public void insert(String key, E data)
    {
        if(tree == null) {
            tree = new BinarySearchTree<E>(key, data);
        }
        else {
            tree = tree.insert(tree, key, data);
        }
  
    }
    
    public E get(String key)
    {
        return (E) tree.search(tree, key).getData();
    }
    
    public int count()
    {
        return tree.count(tree);
    }
    
    public int height()
    {
        return tree.height(tree);
    }
    
}
