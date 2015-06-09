
/**
 * A class that acts as a sort of wrapper for the Nodes that comprise a Singly-Linked List,
 * and acts as the interface for Users manipulating that list. This is the only class
 * a User should use when using a Linked List.
 * An understanding of the Node class is needed to understand this code as well.
 * 
 * @author (Samuel Cox) 
 * @version (07/06/2015)
 */
public class LinkedList<E>
{
    //The head of the list. A null next field in Nodes is used to represent the end of the list.
    private Node head;
    //The length of the list.
    private int length;
    /**
     * Constructs the LinkedList object, initialises the head to a null Node, and initialises
     * the length to 0.
     */
    public LinkedList()
    {
        head = new Node(null, null);
        length = 0;
    }

    /**
     * A method that adds an object to the end of the Linked List. O(n) time complexity 
     * (in best-case, worst-case and average-case)
     * where n is the length
     * of the linked list. Iterates through the linked list until the end is found, and then sets the Node
     * at the end of the list's next field, that is, links it, to a Node that contains the newly added Object.
     * @param object The object to be added to the end of the list.
     */
    public void add(E object)
    {
       if(head.getData() == null) {
            head.setData(object);
       }
       else {
            Node current = head;
            while(current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new Node(null, object));
           
       }
       length++; 
    }
    
    /**
     * A method that gets the nth item of the Linked List, where n is the parameter supplied to the method.
     * O(n) worst-case time complexity where n is the size of the linked list.
     * Iterates through the list until it reaches the nth node, and returns that node's stored data.
     * @param nodeNumber The Node number you want to return. E.G 10 will give the 10th object stored in the list.
     * @return The object stored in the Node. Of whatever type the LinkedList was instantiated with.
     */
    public E get(int nodeNumber)
    {
        Node current = head;
        int currentNumber = 0;
        while(currentNumber != nodeNumber) {
            current = current.getNext();
            currentNumber++;
        }
        return (E) current.getData();
    }
    
    /**
     * A method that returns and removes the head of the list.
     * If the Linked List is empty, it returns null.
     * Otherwise, it gets the Object stored in the head Node, sets the head to the next Node along,
     * decrements the Length of the list as it has gone down, and returns the Object. Operates in
     * O(1) time complexity (worst-case, average-case and best-case).
     * @return The object of whatever type the Linked List was instantiated with.
     */
    public E remove()
    {
        if(length == 0) {
            return null;
        }
        else {
            Node head = this.head;
            E dataToReturn = (E) head.getData();
            this.head = head.getNext();
            length--;
            return dataToReturn;
        }
    }
    
}
