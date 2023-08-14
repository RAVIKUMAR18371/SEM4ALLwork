package Leetcode;
import java.util.Scanner;
public class AmountOfMoneyRobbed {
    public static int rob(int[] nums){
        int money = 0;
        for(int i = 0; i < nums.length; i+=2){
            money = money + nums[i];
        }
        return money;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
      int money = rob(arr);
        System.out.println(money);
    }
}
