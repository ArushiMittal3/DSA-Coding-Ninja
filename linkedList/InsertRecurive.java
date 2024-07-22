package linkedList;

public class InsertRecurive {
    public static Node<Integer> insertNode(Node<Integer> head, int number, int index) {

        Node<Integer> newNode = new Node<>(number);
        if (index == 0) {
            newNode.next = head;
            return newNode;
        } 
        head.next= insertNode(head.next, number, index-1);
           
        return head;

    }

    public static void main(String[] args) {
        Node<Integer> head = SLL.createList();
        System.out.println("List");
        SLL.printList(head);

        head=insertNode(head, 23, 3);
        System.out.println("New List");
        SLL.printList(head);

    }
}
