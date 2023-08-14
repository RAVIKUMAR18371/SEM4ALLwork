package Blind75_Leetcode;
import java.util.Arrays;
import java.util.Scanner;
public class Product_of_Array_ExceptSelf {
    static int ans(int product,int n,int[] nums,int j){
        for(int i = 0;i < n; i++) {
            if (i != j) {
                product *= nums[i];
            }
        }
        return product;
    }
    static int[] product(int[] nums){
       int n = nums.length;
       int[] ans = new int[n];
       int product = 1;

       for(int j = 0;j < n; j++){
           ans[j] = product * ans(product,n,nums,j);
       }
       return ans;
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
         int[] temp = product(arr);
        System.out.println(Arrays.toString(temp));

    }
}
