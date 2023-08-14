package Blind75_Leetcode.linkedList;
import java.util.Stack;

public class Reverse_LinkedList {
    Node head;
    Node tail;
    int size;
    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
        Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }

    void insBeg(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
    }

    void reverse(){
        Stack<Integer> s = new Stack<>();
        Node node = head;
        while(node!= null){
            s.add(node.value);
            node = node.next;
        }
        while(!s.isEmpty()){
            System.out.print(s.pop() + "-->");
        }
        System.out.println("End");


    }

    void display(){
        Node node = head;
        while(node!=null){
            System.out.print(node.value + "-->");
            node = node.next;
        }
        System.out.println("End");

    }
    public static void main(String[] args) {
        Reverse_LinkedList RLL = new Reverse_LinkedList();
        RLL.insBeg(3);
        RLL.insBeg(7);
        RLL.insBeg(8);
        RLL.insBeg(2);
        RLL.insBeg(9);
        RLL.insBeg(22);
        RLL.insBeg(34);

        RLL.display();

        RLL.reverse();
    }
}
