
/**
 * An implementation of a lookup table using a Binary Search Tree.
 * Pretty sure this counts as using the decorator design pattern,
 * as it keeps an instance of an object that it adds functionality to.
 * 
 * @author (Samuel Cox) 
 * @version (26/06/2015)
 */
public class TreeMap<E>
{
    //The underlying BinarySearchTree used to implement the lookup table.
    private BinarySearchTree<E> tree;
    
    /**
     * An implementation of a BinarySearchTree, each node has links to, two other nodes,
     * left and right. Null may be used to represent no further data.
     * Has to be a private inner class as it should be abstracted away from the user,
     * the user shouldn't be able to instantiate it themselves.
     * 
     * @author (Samuel Cox) 
     * @version (26/06/2015)
     */
    private class BinarySearchTree<E>
    {
        //The left sub-node this node links to.
        private BinarySearchTree<E> left;
        //The right sub-node this node links to.
        private BinarySearchTree<E> right;
        //The key the stored object is mapped to, and used to determine whether to insert
        //a new binary search tree in the left or right.
        private String key;
        //The object this BinarySearchTree node stores, and that is mapped to by the key.
        private E data;
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
            return this.data;
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
        return tree.search(tree, key).getData();
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
