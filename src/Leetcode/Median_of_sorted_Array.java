package Leetcode;
import java.util.Arrays;
import java.util.Scanner;
public class Median_of_sorted_Array {
    public static Double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int m = nums1.length;
        int n = nums2.length;
         double median = 0;
        double[] temp = new double[m+n];
        System.arraycopy(nums1,0,temp,0,nums1.length);
        System.arraycopy(nums2,0,temp,nums1.length,nums2.length);
        Arrays.sort(temp);
        int mid = temp.length/2;
        if(temp.length % 2 == 1){
            median = temp[mid];
        }
        else{
            median = (double) (nums1[nums1.length - 1] + nums2[0]) /2;
        }
        return median;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the 1st array:");
        int m = sc.nextInt();
        System.out.println("Enter the size of the 2nd array:");
        int n = sc.nextInt();
        System.out.println("enter the elements in the 1st array:");
        int[] nums1 = new int[m];
        int[] nums2 = new int[n];
        for(int i = 0; i < m; i++){
            nums1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements in the 2nd array:");
        for(int i = 0; i < n; i++){
            nums2[i] = sc.nextInt();
        }
        double result = findMedianSortedArrays(nums1 , nums2);
        System.out.println(result);
    }
}
