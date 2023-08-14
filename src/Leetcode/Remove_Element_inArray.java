package Leetcode;
import java.util.Scanner;
import java.util.Arrays;
// wrong Approach.--> view Leetcode submitted and posted solutions
public class Remove_Element_inArray {
    static int[] removeElement(int[] nums,int val){
        int[] temp = new int[nums.length];
        for(int i = 0,m=0; i < nums.length; i++,m++){
            if(nums[i] != val){
                temp[m] = nums[i];
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value:");
        int val = sc.nextInt();
        System.out.println("Enter the value of N:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements in the array:");
        for(int i=0;i<n;i++){
            nums[i] = (sc.nextInt());
        }
        int[] p = removeElement(nums , val);
        System.out.println(Arrays.toString(p));
    }
}
