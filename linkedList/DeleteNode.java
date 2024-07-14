package linkedList;

public class DeleteNode {
    public static Node<Integer> deleteNode(Node<Integer> head, int number, int index) {

        Node<Integer> temp = head;
        int count = 0;
        if (index == 0) {
            head = head.next;
            return head;
        }

        while (count < index - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            return head;
        }

        if (temp.next==null) {
            temp=null;
            return head;
        }
        temp.next = temp.next.next;
        return head;

    }

    public static void main(String[] args) {
        Node<Integer> head = SLL.createList();
        System.out.println("List");
        SLL.printList(head);

        head = deleteNode(head, 23, 3);
        System.out.println("New List");
        SLL.printList(head);
    }
}
