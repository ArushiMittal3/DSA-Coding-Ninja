package linkedList;

public class IncrementSLL {

    public static void increment(Node<Integer> head){
        Node<Integer> temp=head;
        while(temp!=null){
            temp.data++;
            temp=temp.next;
        }
        
    }
    public static void main(String[] args) {
        Node<Integer> head=SLL.createList();
        System.out.println("Old LIst");
        SLL.printList(head);

        increment(head);

        System.out.println("New List");
        SLL.printList(head);

        //therefore unlike c++ it does gets changed in the original linked list 
        //yayyyyyy no pointerssssss
    }
}
