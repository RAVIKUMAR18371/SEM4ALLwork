package Leetcode;
import java.util.Scanner;
// Time Complexity :: O(N)
// Space Complexity :: O(1)
public class Jump_Game {
    static boolean jump(int[] nums,int n){
        int reachable = 0;

        for(int i = 0; i<n; i++){
            if(reachable < i){
                return false;
            }
            reachable = Math.max(reachable,i+nums[i]);
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i = 0;i < n; i++){
            nums[i] = sc.nextInt();
        }

        boolean bool = jump(nums,n);
        if(bool){
            System.out.println("we are able to reach to the end index");
            System.out.println("the value is: " + bool);
        }
        else {
            System.out.println("we are not able to reach to the end index");
            System.out.println("the value is: " + bool);

        }


    }
}
