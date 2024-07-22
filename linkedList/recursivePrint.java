package linkedList;

public class recursivePrint {
    public static Node<Integer> printRecursive(Node<Integer> head) {
        if (head == null) {
            return head;
        }
        System.err.print(head.data +" -> ");
        return printRecursive(head.next);

    }

    public static void main(String[] args) {
        Node<Integer> head = SLL.createList();
        System.out.println("LIst");
        printRecursive(head);

    }
}
