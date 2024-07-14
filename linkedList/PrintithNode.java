package linkedList;

public class PrintithNode {
    public static int ithNode(Node<Integer> head , int i) {
        Node<Integer> temp = head;
        
        int count=0;
        while (count != i) {
            count++;
            temp = temp.next;
        }
        return temp.data;

    }

    public static void main(String[] args) {
        Node<Integer> head = SLL.createList();
        System.out.println("LIst");
        SLL.printList(head);

       

        System.out.println("Node is :- " +  ithNode(head, 0));

    }
}
