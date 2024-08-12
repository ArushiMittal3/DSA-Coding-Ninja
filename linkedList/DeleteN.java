package linkedList;

public class DeleteN {
    public static Node<Integer> deleteN(Node<Integer> head, int n1, int n2) {
        Node<Integer> current = head;
        Node<Integer> resultHead = null; // This will be the head of the resulting list
        Node<Integer> resultTail = null; // This will keep track of the tail of the resulting list

        while (current != null) {
            // Keep n1 nodes
            for (int i = 0; i < n1 && current != null; i++) {
                if (resultHead == null) {
                    resultHead = current;
                    resultTail = current;
                } else {
                    resultTail.next = current;
                    resultTail = resultTail.next;
                }
                current = current.next;
            }
            // Skip n2 nodes
            for (int i = 0; i < n2 && current != null; i++) {
                current = current.next;
            }
        }

        // Make sure the last node's next is set to null
        if (resultTail != null) {
            resultTail.next = null;
        }

        return resultHead;
    }

    public static void main(String[] args) {
        Node<Integer> head1 = Input.takeInput();
        System.out.println("List 1");
        SLL.printList(head1);

        Node<Integer> head2 = deleteN(head1, 3, 2); // Example parameters
        System.out.println("List 2");
        SLL.printList(head2);
    }
}
