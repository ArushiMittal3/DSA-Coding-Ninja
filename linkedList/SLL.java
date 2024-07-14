package linkedList;

public class SLL {

    //create a linked list
    public static Node<Integer> createList(){
        Node<Integer> n1= new Node<Integer>(10);
        Node<Integer> n2= new Node<Integer>(20);
        Node<Integer> n3= new Node<Integer>(30);
        Node<Integer> n4= new Node<Integer>(40);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        return n1;
    }

    //print a linked list
    public static void printList(Node<Integer> head){
        while(head !=null){
            System.out.println(head.data);
            head=head.next;
        }
    }

    public static void main(String[] args) {
        // Node<Integer> n1= new Node<Integer>(10);
        // System.out.println(n1);//prints address of node
        // System.out.println(n1.data);//prints data
        // System.out.println(n1.next);//prints address stored of next node

        Node<Integer> head=createList();
        printList(head);

    }
}


