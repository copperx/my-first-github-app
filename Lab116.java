import java.util.Scanner;

public class Lab116
{
    
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        int[] userList = new int[20];
        int numElements;

        numElements = scnr.nextInt();

        // Read the elements into the array
        for(int i = 0; i < numElements; i++)
        {
            userList[i] = scnr.nextInt();
        }

        // Print the elements in reverse order. Each
        // element should be followed by a comma
        // Example: 10,5,7,9,
        for(int i = numElements-1;  i >= 0; i--)         // Complete this loop
        {
            System.out.print(userList[i] + ",");
        }
        System.out.println(); 
    }
}