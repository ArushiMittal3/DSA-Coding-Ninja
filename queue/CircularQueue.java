package queue;

public class CircularQueue {
    private int data[];
    private int front;
    private int rear;
    private int size;

    public CircularQueue(){
        data = new int[3];
        front=-1;
        rear=-1;
        size=0;
    }

    public CircularQueue(int n){
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
            rear=(rear+1)%data.length; //change
        }
        data[rear]=ele;
        size++;
        System.out.println(rear);

    }

    public int dequeue(){
        if(size==0){
            System.out.println("cant dequeue , emppty");
            return -1;
        }
        int ele=data[0];
        
        size--;

        front=(front+1)%data.length;

        return ele;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        if(size>3){
            size=3;
        }

        int count = size;
        int i = front;
        while (count > 0) {
            System.out.print(data[i] + " ");
            i = (i + 1) % data.length;
            count--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue queue=new CircularQueue();
        queue.enqueue(3);
        queue.enqueue(34);
        queue.enqueue(323);
        queue.enqueue(31);

        System.out.println(queue.dequeue());

        

    
        
       
        


        queue.printQueue();
    }


}
