public class QueArr{
    public static void main(String[] args) {
        QArr q= new QArr(4);
        System.out.println(q.isEmpty());
        q.enque(4);
        q.enque(30);
        q.enque(60);
        q.enque(50);
        System.out.println(q.isFull());
        q.print();
        
    }
}
class QArr{
    int rear;
    int front;
    int size;
    int[] queues;

    public QArr(int size) {
        this.rear=-1;
        this.front=0;
        this.size=size;
        this.queues= new int[size];
    }
    boolean isFull(){
        if(rear==size-1){
            System.err.println("the que is full");
            return true;
        }
        else{
            return false;
        }
    }
    boolean isEmpty(){
        if(rear==-1){
            System.err.println("the que is empty");
            return true;
        }else{
            return false;
        }
    }
    void enque(int data){
        if(isFull()){
            return;
        }
        rear++;
        queues[rear]=data;
    }
    int deque(){
        var temp=queues[front];
        for(int i=0;i<queues.length;i++){
            queues[i-1]=queues[i];
        }
        return temp;
    }
    void print(){
        System.out.println("--queue-");
        for(int i=0;i<queues.length;i++){
            System.out.print(queues[i]+" ");
        }System.out.println();
        System.out.println("---------");

    }
}