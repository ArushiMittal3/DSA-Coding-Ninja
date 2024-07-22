package linkedList;

public class OddEven {
    public static Node<Integer> oddEven(Node<Integer> head){
        Node<Integer> oddHead=null;
        Node<Integer> oddTail=null;
        Node<Integer> evenHead=null;
        Node<Integer> evenTail=null;
    
        while(head!=null){
            if(head.data%2==0){
                if(evenHead==null){
                    evenHead=head;
                    evenTail=head;
                    
                }else{
                    
                    evenTail.next=head;
                    evenTail=evenTail.next; 
                }
            }else{
                if(oddHead==null){
                    oddHead=head;
                    oddTail=head;
                    
                }else{
                   
                    oddTail.next=head;
                    oddTail=oddTail.next; 
                }
            }
            head=head.next;
        }

        oddTail.next=evenHead;
        evenTail.next=null;

        return head;
    }
    public static void main(String[] args) {
        Node<Integer> head1 = Input.takeInput();
        System.out.println("List 1");
        SLL.printList(head1);

        Node<Integer> head2 = oddEven(head1);
        System.out.println("List 2");
        SLL.printList(head2);

    }

}
