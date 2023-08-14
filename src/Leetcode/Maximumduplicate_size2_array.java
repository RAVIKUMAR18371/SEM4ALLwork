package Leetcode;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class Maximumduplicate_size2_array {
    /*
  static int count = 0;
    static int[] removeDuplicates(int[] nums){
        for(int i=0; i<nums.length - 1;i++){
            for(int j = i; j < nums.length;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
                if(count == 3){
                    nums[j] = Integer.parseInt(null);
                    Arrays.sort(nums);
                }
            }
        }
        return nums;


    }

     */
    static int removeDuplicates(int[] nums) {
        int index = 1;
        int count = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 0;
            }

            if (count <= 1) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();

        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        int k = removeDuplicates(nums);
        System.out.println(k);
    }
}
