package linkedList;

public class InsertNode {
    public static Node<Integer> insertNode(Node<Integer> head, int number, int index) {

        Node<Integer> temp = head;
        int count = 0;
        Node<Integer> newNode = new Node<>(number);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        } 
            while (count < index - 1) {
                temp = temp.next;
                count++;
            }
            if(temp==null){
                return head;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        return head;

    }

    public static void main(String[] args) {
        Node<Integer> head = SLL.createList();
        System.out.println("List");
        SLL.printList(head);

        head=insertNode(head, 23, 2);
        System.out.println("New List");
        SLL.printList(head);

    }
}
