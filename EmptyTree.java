/**
     * Write a description of class EmptyTree here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class EmptyTree<E> implements Tree<E>
    {
        // instance variables - replace the example below with your own
       
    
        /**
         * Constructor for objects of class EmptyTree
         */
        public EmptyTree()
        {
            // initialise instance variables
            
        }
    
        public boolean isEmpty()
        {
            return true;
        }
       
        public Tree<E> insert(String key, E data)
        {
            return new NonEmptyTree<E>(this, this, key, data);
        }
       
        public E search(String key)
        {
            return null;
        }
       
        public int iterativeCount()
        {
            return 0;
        }
       
        public int recursiveCount()
        {
            return 0;
        }   
       
        public int getHeight()
        {
            return 0;
        }
       
        
        
    }