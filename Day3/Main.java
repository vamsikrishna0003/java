package LinkedList;
public class Main{
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertBeg(10);
        list.insertBeg(20);
        list.print();
        list.insertBeg(30);
        list.print();
        list.getHead(); // This will return the head of the linked list
        // You can use the head to access the first element directly if needed
        LinkedList.Node head = list.getHead();
        if (head != null) {
            System.out.println("First element: " + head.data);
        }
    }
}