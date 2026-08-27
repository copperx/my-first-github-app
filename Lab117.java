// Given a sorted list of integers, output the middle integer. A negative number
// indicates the end of the input (the negative number is not part of the
// sorted list.) 
// Example: if input is 2 3 4 8 11 -1
// The output is:
// Middle item: 4
// The max number of elements should not exceed 9.

import java.util.Scanner;

public class Lab117
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        int[] userValues = new int[9];

        int n = 0;

        // Read values from keyboard and store them into the array
        int number = scnr.nextInt();
        while(number >= 0) {
            userValues[n] = number;
            n++;
            number = scnr.nextInt(); // read another number
        }

        // Print the middle element. To find the index of the middle: n / 2
        System.out.println("Middle item: " + userValues[n/2]);
    }
}