
/**
 * Write a description of interface Tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Tree<E>
{
   abstract public boolean isEmpty();
   
   abstract public Tree insert(String key, E data);
   
   abstract public E search(String key);
   
   abstract public int iterativeCount();
   
   abstract public int recursiveCount();

   abstract public int getHeight();
   
   
}
