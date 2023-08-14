package Blind75_Leetcode;
import java.util.Arrays;
import java.util.Scanner;
public class Minimum_rotated_subarray {
    static int rotated_subArray(int[] arr,int n){
        int count = 0;
        int p = 0;
        for(int i = 0;i<n;i++){
                if (arr[count] > arr[i]) {
                    p++;
                }
        }
        return p;
    }
    static int minimumRotate(int[] arr, int count){
        int p = 0;
        int temp;
        while(p <= count){
            temp = arr[0];
            for(int i = 0;i < arr.length - 1; i++){
                arr[i] = arr[i+1];
            }
            arr[arr.length - 1] = temp;
            p++;
        }
        System.out.println(Arrays.toString(arr));
        return p;
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
       int count = rotated_subArray(arr,n);
         int p = minimumRotate(arr,count);
        System.out.println("the minimum rotation will be: "+ p);


    }
}
