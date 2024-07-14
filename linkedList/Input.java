package linkedList;

import java.util.Scanner;

public class Input {
    public static Node<Integer> takeInput() {
        Scanner scan = new Scanner(System.in);
        int data = scan.nextInt();
        Node<Integer> head = null;
        Node<Integer> tail=null;
        while (data != -1) {
            Node<Integer> node = new Node<Integer>(data);
            if (head == null) {
                head = node;
                 tail = node;
            } else {
                tail.next = node;
                tail=node;
            }
            data = scan.nextInt();
        }
        scan.close();
        return head;

    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        System.out.println("List");
        SLL.printList(head);

    }
}
