package Leetcode;
import java.util.HashSet;
import java.util.Scanner;
public class contains_duplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hs.contains(nums[i])) {
                return true;
            } else {
                hs.add(nums[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements in the array:");
        for(int i = 0;i < n; i++){
            nums[i] = sc.nextInt();
        }
        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }
}
