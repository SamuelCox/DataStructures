
/**
 * Write a description of class BinarySearchTree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BinarySearchTree<E>
{
    // instance variables - replace the example below with your own
    private BinarySearchTree<E> left;
    private BinarySearchTree<E> right;
    private String key;
    private Object data;
    /**
     * Constructor for objects of class BinarySearchTree
     */
    public BinarySearchTree(String key, E data)
    {
        this.left = null;
        this.right = null;
        this.key = key;
        this.data = data;
    }

    public BinarySearchTree<E> insert(BinarySearchTree<E> tree, String key, E data)
    {
        if(tree == null) {
            return new BinarySearchTree<E>(key, data);
        }
        else if(this.key.compareTo(key) > 0) {
            this.left = insert(this.left, key, data);
        }
        else {
            this.right =  insert(this.right, key, data);
        }
        return tree;
    }
    
    public BinarySearchTree<E> search(BinarySearchTree<E> tree, String key)
    {
        if(tree == null) {
            return null;
        }
        else if(tree.key == key) {
            return tree;
        }
        else if(this.key.compareTo(key) > 0) {
            return this.search(tree.left, key);
        }
        else {
            return this.search(tree.right, key);
        }
    }
    
    public String getKey()
    {
        return this.key;
    }

    public E getData()
    {
        return (E) this.data;
    }
    
    public int count(BinarySearchTree<E> tree)
    {
        if(tree == null) {
            return 0;
        }
        return 1 + this.count(tree.left) + this.count(tree.right);
    }
    
    public int height(BinarySearchTree<E> tree)
    {
        if(tree == null) {
            return 0;
        }
        return Math.max(this.height(tree.left) + 1, this.height(tree.right) + 1);
    }
    
    
    
}
