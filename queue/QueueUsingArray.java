package queue;

public class QueueUsingArray {
    private int data[];
    private int front;
    private int rear;
    private int size;

    public QueueUsingArray(){
        data = new int[5];
        front=-1;
        rear=-1;
        size=0;
    }

    public QueueUsingArray(int n){
        data = new int[n];
        front=-1;
        rear=-1;
    }

    public int size(){
        return size;  
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return size==data.length;
    }

    public void enqueue(int ele){
        if(rear==-1){
            front=rear=0;
        }else{
            rear++;
        }
        size++;
        if(size>data.length){
            System.out.println("size full cant engquqe");
            return ;
        }
        
        data[rear]=ele;
    }

    public int dequeue(){
        if(rear==-1){
            System.out.println("cant dequeue , emppty");
            return -1;
        }
        int ele=data[0];
        front++;
        size--;
        return ele;
    }

    public void printQueue(){
        for(int i=front; i<rear+1;i++){
            System.out.print(data[i] + " ");
        }
    }

    public static void main(String[] args) {
        QueueUsingArray queue=new QueueUsingArray();
        queue.enqueue(3);
        queue.enqueue(34);
        queue.enqueue(44);
        queue.enqueue(342);
        queue.enqueue(2);

        System.out.println(queue.isFull());

        System.out.println(queue.dequeue());

        queue.dequeue();
        queue.dequeue();
        
        

        System.out.println(queue.isEmpty());

        


        queue.printQueue();
    }


}
