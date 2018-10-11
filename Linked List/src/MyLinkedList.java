import java.util.*;

/**
 * Recreation of the LinkedList class
 * @author AnselmJA20 John Anselmo
 * @version 1.0
 * @param <E> the Object type
 */
public class MyLinkedList<E> {
    private int size;
    private Node<E> head;
    
    
    /**
     * Constructs an empty list
     */
    public MyLinkedList() {
        size = 0;
        head = null;
    }
    
    /**
     * Constructs a MyLinkedList with a collection
     * @param c the collection to construct the linkedlist with
     */
    public MyLinkedList( Collection<E> c ) {
        for ( E e : c ) {
            add( e );
        }
    }
    
    /**
     * adds object to the linkedlist
     * @param e the element to add to the linkedlist
     * @returns true all the time
     */
    public boolean add( E e ) {
        Node<E> toAdd = new Node<E>( e );
        
        size++;
        return true;
    }
    
    /**
     * Used to create a visual of the linked list (readable)
     * @returns a string version of the linkedlist
     */
    public String toString() {
    	String toReturn = "[";
    	for ( Node<E> current = head; current.next != null; current = current.next ) {
    		if ( current.next != null ) {
    			toReturn += current + ", ";
    		}
    		else {
    			toReturn += current.
    		}
    	}
    }
    
    /**
     * Node class for the LinkedList class
     * @author AnselmJA20
     * @version 1.0
     * @param <E> the Object type for the node;
     */
    public class Node<E> {
        private Node<E> next;
        private E data;
        
        public Node( E data, Node<E> next ) {
            this.next = next;
            this.data = data;
            
        }
        
        public Node( E data ) {
            next = null;
            this.data = data;
        }
    }
}
