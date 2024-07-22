package linkedList;

public class ReverseRecursive {
    // Complete the reverse function below.
    static Node<Integer> reverse(Node<Integer> head) {
        if(head == null) {
            return head;
        }

        // last Node<Integer> or only one Node<Integer>
        if(head.next == null) {
            return head;
        }

        Node<Integer> newHeadNode = reverse(head.next);

        // change references for middle chain
        head.next.next = head;
        head.next = null;

        // send back new head node in every recursion
        return newHeadNode;
    }

    public static void main(String[] args) {
        Node<Integer> head = SLL.createList();
        System.out.println("List");
        SLL.printList(head);

        head=reverse(head);
        System.out.println("New List");
        SLL.printList(head);
    }
}
