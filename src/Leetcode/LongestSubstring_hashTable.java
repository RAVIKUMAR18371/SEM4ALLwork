package Leetcode;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstring_hashTable {
    // pwwkew
    public static int lengthOfLongestSubstring(String s){
        int max = 0;
        int closestmax = 0;
        Set<Character> ts = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            if(!ts.contains(s.charAt(i))) {
                ts.add(s.charAt(i));
                max = ts.size();
                max = Math.max(max , closestmax);


            }
            else{
                int j = 0;
                while(s.charAt(j) != s.charAt(i)) {
                    ts.remove(s.charAt(j));
                    j++;
                }
                ts.add(s.charAt(i));
                closestmax = ts.size();
                closestmax = Math.max(max , closestmax);

            }
        }
        return Math.max(max,closestmax);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.next();
        int length = lengthOfLongestSubstring(s);
        System.out.println(length);

    }
}
