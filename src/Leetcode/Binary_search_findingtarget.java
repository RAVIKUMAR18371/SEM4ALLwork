package Leetcode;
import java.util.ArrayList;
import java.util.Scanner;
public class Binary_search_findingtarget {
     static int i = 0;
    public static int search(int[] nums, int target) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i : nums) {
            al.add(i);
        }
        if (al.contains(target)) {
            while (i < nums.length) {
                if (nums[i] != target) {
                    i++;
                    return search(nums, target);
                } else {
                    return target;
                }
            }
        }
            return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int V = sc.nextInt();
        System.out.println("Enter the value want to search");
        int p = sc.nextInt();
        int[] arr = new int[V];
        System.out.println("Enter the elements in the array:");
        for(int i = 0;i<V;i++){
            arr[i] = sc.nextInt();
        }
        int m = search(arr,p);
        System.out.println(m);
    }
}
