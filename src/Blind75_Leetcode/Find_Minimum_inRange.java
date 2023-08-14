package Blind75_Leetcode;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Scanner;
public class Find_Minimum_inRange {
    static void min(int range,int[] arr, HashSet<Integer> hs){
        for(int j : arr){
            hs.add(j);
        }
        for(int i = 0; i < range; i++){
            if(!hs.contains(i)){
                System.out.println("The missing number in the range will be: "+i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<>();
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        System.out.println("Enter the elements in the array: ");
        for(int i = 1;i < n+1;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int range = arr.length;
        min(range,arr,hs);
    }
}
