package Leetcode;
import java.util.Scanner;
public class jump_game2 {
    //Q--> Minimum number of jump to reach the end

    static int jump(int[] nums,int n){
        int curr = 0;
        int next = 1;
        int ans = 0;
        for(int i = 0; next < n;i++){
            if(i > curr){
                ans++;
                curr = next;
            }
            next = Math.max(next , nums[i] + i);
        }
        return ans;
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
       int P = jump(nums,n);
        System.out.println(P);


    }
}
