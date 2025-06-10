public class Quell{
    public static void main(String[] args) {
        Qll q=new Qll();
        System.out.println(q.isEmpty());
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(40);
        q.print();
        
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Qll{
    Node rear;
    Node front;
    Qll(){
        this.front=null;
        this.rear=null;

    }
    boolean isEmpty(){
        if(front==null){
            return true;
        }
        else{
            return false;
        }
    }
    void enqueue(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            this.front=newNode;
            this.rear=newNode;
        }
        rear.next=newNode;
        rear=rear.next;
        }
    int deque(){
        var temp=front.data;
        front=front.next;
        return temp;
    }
    void print(){
        var temp=front;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}