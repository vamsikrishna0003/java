package LinkedList;
public class LinkedList {
    public Node head; // Reference to the head of the linked list

    // Inner class to represent a node in the linked list
     class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to insert a node at the beginning of the list
    public void insertBeg(int data) {
        Node newNode = new Node(data); // Create a new node
        newNode.next = head;          // Point the new node to the current head
        head = newNode;               // Update the head to the new node
    }

    // Method to print the linked list
    public void print() {
        Node current = head;          // Start from the head
        while (current != null) {     // Traverse until the end of the list
            System.out.print(current.data + " -> ");
            current = current.next;   // Move to the next node
        }
        System.out.println("null");   // Indicate the end of the list
    }
    Node getHead(){
        return head; // Return the head of the linked list
    }
}
