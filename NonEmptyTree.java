/**
     * Write a description of class NonEmptyTree here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class NonEmptyTree<E> implements Tree<E>
    {
        private Tree left;
        private Tree right;
        private String key;
        private Object data;
    
        /**
         * Constructor for objects of class NonEmptyTree
         */
        public NonEmptyTree(Tree<E> left, Tree<E> right, String key, E data)
        {
            this.left = left;
            this.right = right;
            this.key = key;
            this.data = data;
            
        }    
        
        public boolean isEmpty()
        {
            return false;
        }
        
        
         public Tree<E> insert(String key, E data)
        {
            int comparator = this.key.compareTo(key);
            if(comparator > 0) {
                this.left = this.left.insert(key, data);
            }
            else if(comparator < 0) {
                this.right = this.right.insert(key, data);
            }
            else {
                this.data = data;
            }
            return this;
        }
       
        public E search(String key)
        {
            int comparator = this.key.compareTo(key);
            if(comparator == 0) {
                return (E) this.data;
            }
            else if(comparator > 0) {
                return (E) this.left.search(key);
            }
            
            else {
                return (E) this.right.search(key);
            }
        }
       
        public int iterativeCount()
        {
            int count = 0;
            Stack<Tree> stack = new Stack<Tree>(1000);
            NonEmptyTree current;
            stack.push(this);
            while(!stack.isEmpty()) {
                current = (NonEmptyTree) stack.pop();
                count++;
                if(!current.left.isEmpty()) {
                    stack.push(current.left);
                }
                if(!current.right.isEmpty()) {
                    stack.push(current.right);
                }
            }
            return count;
        }
       
        public int recursiveCount()
        {
            return 1 + this.left.recursiveCount() + this.right.recursiveCount();
        }
       
       
        public int getHeight()
        {
            return Math.max(this.left.getHeight() + 1, this.right.getHeight() + 1);
        }
    }