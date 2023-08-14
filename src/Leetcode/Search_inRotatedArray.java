package Leetcode;
import java.util.Scanner;
import java.util.Arrays;
public class Search_inRotatedArray {
    public static int[] search(int[] numbs, int target){
        int s = 0;
        while(s != target){
            int temp = numbs[0];
            for(int i=0;i<numbs.length-1;i++){
               numbs[i] = numbs[i+1];
            }
           numbs[numbs.length - 1] = temp;
            s++;
        }
        return numbs;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
       // System.out.println("Enter the target:");
        int target = sc.nextInt();
      //  System.out.println("enter the elements in the array:");
        int[] numbs = new int[n];
        for(int i = 0; i < n; i++){
            numbs[i] = sc.nextInt();
        }
       int[] arr = search(numbs , target);
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println(i);
            }
        }
    }
}
