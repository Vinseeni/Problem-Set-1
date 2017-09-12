/**
 * LinkedList
 * Description:  linked list implementation
 * CS2040 2017
 */


/**
 * Class: LinkedList
 * Description: linked list implementation
 * All the elements in the list are integers >= 0.
 */

public class LinkedList implements List {

    protected class Node {
        protected int data;
        protected Node next;

        public Node()
        {
            data = 0;
            next = null;
        }

        public Node(int data, Node n) {
            //todo
        }
    };

    Node head;

    public LinkedList() {
        head = null;
    }


    /**
     * Method: add appends a new integer to the end of the list
     * @param key the integer to add to the list
     * @return true if the add succeeds, and false otherwise
     * Outputs an error if the key is < 0
     */
    public boolean add(int key) {
		// todo
        return true;
    }


    /**
     * Method: search checks whether the key is in the list
     * @param key the integer to search for in the list
     * @return true if key is in the list and false otherwise
     */
    public boolean search(int key) {
		// todo
        return false;
    }

    /**
     * Method: Converts the list into a printable string
     * @return a string
     */
    public String toString() {
        String output = "";

		// todo

        return output.trim();
    }

}
