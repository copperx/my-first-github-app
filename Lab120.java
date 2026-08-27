import java.util.Scanner;
public class Lab120
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        // n indicates the number of words that follow
        int n = scnr.nextInt();
        String[] wordArray = new String[20];
        int[] freqArray = new int[20];
        // This loop reads n words 
        for(int i = 0; i < n; i++) 
        {
            String word = scnr.nextLine();

            boolean found = false;
            // Search for the word in the array
            for(int j = 0; j < n; j++) {
                if(wordArray[j].equals(word)) {
                    // Found the word. Increment its frequency.
                    freqArray[j]++;
                    found = true;
                }
            }

            if(!found) {
                wordArray[i] = word;
                freqArray[i] = 1;
            }
        }

        // Print the frequencies of each word
        for(int i = 0; i < n; i++) 
        {
            System.out.println(wordArray[i] + " - " + freqArray[i]);
        }
    }

}