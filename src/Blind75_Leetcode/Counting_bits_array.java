package Blind75_Leetcode;
import java.util.Arrays;
import java.util.Scanner;
public class Counting_bits_array {
  static int[] countbits(int num){
        int[] ans = new int[num + 1];
        for(int i = 0;i<num;i++){
            ans[i] = rec(i, ans);
        }
        return ans;
    }
    private static int rec(int num,int[] memo){
        if(num == 0)
            return 0;
        if(num == 1){
            return 1;
        }
        if(memo[num] != 0)
            return memo[num];

        if(num % 2 == 0){
            memo[num] = rec(num/2,memo);
            return rec(num/2,memo);
        }
        else{
            memo[num] = 1+rec(num/2 , memo);
            return 1+rec(num/2,memo);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int num = sc.nextInt();
        int[] arr = countbits(num);
        System.out.println(Arrays.toString(arr));
    }
}
