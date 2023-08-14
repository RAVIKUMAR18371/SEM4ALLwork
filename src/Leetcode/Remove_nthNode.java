package Leetcode;
import java.util.Scanner;
public class Remove_nthNode {
    Node head;
    Node tail;
    int size = 0;

    void insBeg(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }
    void delAny(int index){
        Node node = head;
        for(int i = 0;i<index;i++){
            node = node.next;
        }
        node.next = node.next.next;
    }

    void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of LinkedList:");
        int n = sc.nextInt();
        Remove_nthNode p = new Remove_nthNode();
        System.out.println("Enter the elements in the LinkedList:");
        for(int i = 0; i < n; i++){
            p.insBeg(sc.nextInt());
        }
        System.out.println("Enter the particular index which node need to be deleted:");
        p.delAny(sc.nextInt());
        System.out.println();

        p.display();
    }
}
