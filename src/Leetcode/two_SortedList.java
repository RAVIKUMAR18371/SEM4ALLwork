package Leetcode;
import java.util.*;

public class two_SortedList {
    ListNode head1;
    ListNode head2;
    int size1 = 0;
    int size2 = 0;
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val,ListNode next){
            this.val = val;
            this.next = next;
        }
        ListNode(int value){
            this.val = value;
        }
    }
    void beg1(int val){
        ListNode node = new ListNode(val);
        node.next = head1;
        head1 = node;
        size1++;
    }

    void beg2(int val){
        ListNode node = new ListNode(val);
        node.next = head2;
        head2 = node;
        size2++;
    }
    void display() {
        int[] nums = new int[(size1 + size2)];
        int i = 0;
        while (head1 != null && i < size1 + size2) {
            nums[i] = head1.val;
            i++;
            head1 = head1.next;
        }
        while (head2 != null && i < size1 + size2) {
            nums[i] = head2.val;
            i++;
            head2 = head2.next;
        }
        Arrays.sort(nums);
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + "-->");
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        two_SortedList ts = new two_SortedList();
        ts.beg1(1);
        ts.beg1(2);
        ts.beg1(4);

        ts.beg2(1);
        ts.beg2(3);
        ts.beg2(4);

        ts.display();


    }
}
