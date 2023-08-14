package Leetcode;
import java.util.*;

public class Top_Kfrequent {
    public static int[] topKFrequent(int[] nums, int k, int[] temp) {
        int p = nums.length - 1;
        int[] update = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int j = nums[i];
            update[j]++;
        }
        ArrayList<Integer> al = new ArrayList<>();
        for (int m : update) {
            al.add(m);
        }

        int d = 0;
        int count = 0;
        while (d < k) {
            for (int i = 0; i < al.size(); i++) {
                    count = Math.max(count , al.get(i));
                }
            temp[d] = al.indexOf(count);
            al.set(count , 0);
            d++;
            }
            return temp;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the K:");
        int K = sc.nextInt();
        System.out.println("enter the elements in the array:");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] temp = new int[K];
        int[] arr = topKFrequent(nums, K , temp);
        System.out.println(Arrays.toString(arr));

    }
}
