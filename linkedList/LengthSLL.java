package linkedList;

public class LengthSLL {
    public static int length(Node<Integer> head) {
        Node<Integer> temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;

    }

    public static void main(String[] args) {
        Node<Integer> head = SLL.createList();
        System.out.println("LIst");
        SLL.printList(head);

        int count = length(head);

        System.out.println("Length :- " + count);

    }
}
