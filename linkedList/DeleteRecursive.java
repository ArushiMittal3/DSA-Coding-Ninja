package linkedList;

public class DeleteRecursive {
    public static Node<Integer> deleteNode(Node<Integer> head,  int index) {

       
        if (index == 0) {
            head = head.next;
            return head;
        }

        head.next=deleteNode(head.next, index-1);
        return head;

    }

    public static void main(String[] args) {
        Node<Integer> head = SLL.createList();
        System.out.println("List");
        SLL.printList(head);

        head = deleteNode(head, 2);
        System.out.println("New List");
        SLL.printList(head);
    }
}
