package Bitwise_Manupulation;

import java.util.Scanner;

public class GetTheBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = sc.nextInt();
        System.out.println("Enter the position: ");
        int pos = sc.nextInt();

        int bitMask = n<<pos;

// GET BIT-MASK
        if((bitMask & n) == 0){
            System.out.println("Bit was zero");
        }else {
            System.out.println("Bit was one");
        }

//SET BIT-MASK
        if((bitMask | n) == 0){
            System.out.println("Bit was zero");
        }else {
            System.out.println("Bit was one");
        }

// CLEAR BIT-MASK
        int notBitMask = ~(bitMask);
        int  newNumber = notBitMask & n;
        System.out.println(newNumber);
    }
}
