package Leetcode;
import java.util.Arrays;
import java.util.Scanner;
public class Rotate_the_Array {
    static void rotateArr(int[] nums , int p){
        int s = 0;
        while(s != p){
            int temp = nums[0];
            for(int i=0;i<nums.length-1;i++){
                nums[i] = nums[i+1];
            }
            nums[nums.length - 1] = temp;
            s++;
        }
        System.out.println(Arrays.toString(nums));

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
        System.out.print("Enter the number of times want to rotate: ");
        int p = sc.nextInt();
        rotateArr(nums , p);



    }
}
